def targetedContentService = applicationContext.get("targetedContentService")
def homepageScenarioItem = targetedContentService.getHomepageScenario(profile)

templateModel.homepageScenario = homepageScenarioItem
templateModel.bodyContent = templateModel.bodyContent_html

def sum = 46 + 2

templateModel.mysum = sum

templateModel.content = "HELLO WORLD"

