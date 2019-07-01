def targetedContentService = applicationContext.get("targetedContentService")
def homepageScenarioItem = targetedContentService.getHomepageScenario(profile)

templateModel.homepageScenario = homepageScenarioItem


def siteContentService = applicationContext.get("siteContentService")
def bodyContent = siteContentService.processMacrosForItem(contentModel)

templateModel.bodyContent = bodyContent

def sum = 46 + 2

templateModel.mysum = sum

templateModel.content = "HELLO WORLD"

