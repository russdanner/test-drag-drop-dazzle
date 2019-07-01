def targetedContentService = applicationContext.get("targetedContentService")
def homepageScenarioItem = targetedContentService.getHomepageScenario(profile)

templateModel.homepageScenario = homepageScenarioItem

def macrosItem = siteItemService.getSiteItem("/site/components/macros/store-macros.xml")
def bodyContent = templateModel.bodyContent

def keyValuePairs = macrosItem.get("//item")

logger.info("PROPS :"+keyValuePairs)
keyValuePairs.each { el ->
//    bodyContent = bodyContent.replaceAll("["+p+"]", v)
logger.info("PAIR:"+ el.selectNode("key").getText() )    
}



//templateModel.bodyContent = 

def sum = 46 + 2

templateModel.mysum = sum

templateModel.content = "HELLO WORLD"

