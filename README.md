**CSS Selectors**
> Best Selectors are unique, descriptive and static
> Use: ids, class, names, CSS Selectors
> By.cssSelector(".q")
> By.cssSelector("#q")
> By.cssSelector("input[name='q']")
> When they are not descriptive selectors matching by text can come in rescue
> We can match text by :
> 1. Value- Matches text by exact value of selector
> 2. Wildcard - Matches text based on a selector or part of a selector
>1. By.cssSelector("<tag_name>[type='<value>']");
Prefix a[id^='prefix'] :
<div id='fix_randomId'> By.cssSelector("div[id^='fix']");
<div id='randomId_fix'> By.cssSelector("div[id$='fix']");
<div id='1223_fix_randomId'> By.cssSelector("div[id*='fix']");