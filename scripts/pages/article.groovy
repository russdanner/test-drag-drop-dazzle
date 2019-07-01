def targetedContentService = applicationContext.get("targetedContentService")
def homepageScenarioItem = targetedContentService.getHomepageScenario(profile)

templateModel.homepageScenario = homepageScenarioItem

def macrosItem = siteItemService.getSiteItem("/site/components/macros/store-macros.xml")
def bodyContent = templateModel.bodyContent

def keyValuePairs  = macrosItem.getProperties().get("macros")
keyValuePairs.each { k, v, ->
    bodyContent = bodyContent.replaceAll("["+k+"]", v)
    
}



//templateModel.bodyContent = 

def sum = 46 + 2

templateModel.mysum = sum

templateModel.content = "HELLO WORLD"

