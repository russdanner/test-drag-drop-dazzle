def targetedContentService = applicationContext.get("targetedContentService")
def homepageScenarioItem = targetedContentService.getHomepageScenario(profile)

templateModel.homepageScenario = homepageScenarioItem

def macrosItem = siteItemService.getSiteItem("/site/components/macros/store-macros.xml")
def bodyContent = templateModel.bodyContent

def keyValuePairs = macrosItem.get("//item")
keyValuePairs.each { el ->
    bodyContent = bodyContent.replace("["+el.selectNodes("key")[0].getText()+"]", "foo")
}



templateModel.bodyContent = bodyContent

def sum = 46 + 2

templateModel.mysum = sum

templateModel.content = "HELLO WORLD"

