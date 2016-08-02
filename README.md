# swing-rectlook
Modified java swing inspired in twitter bootstrap

<b>Current components list:</b>
  1. CustomImageIcon:
    * Custom icon for several components
    ```java
    CustomImageIcon icon = new CustomImageIcon("iconpath/icon.png", "icon description", width, heigth);
    ```
  2. RainbowPanel
    * Just a garnish component
    ```java
    RainbowPanel rbp = new RainbowPanel(bounds);
    ```
  3. BottomPanel
    * Panel with custom text with separator on top.
    ```java
    BottomPanel bp = new BottomPanel("Your text here", bounds);
    ```
  4. TitlePanel
    * Panel with custom icon (CustomImageIcon), text and a separator on bottom.
    ```java
    TitlePanel tp = new TitlePanel("Your title", bounds, customImageIcon);
    ```
  5. RectlookButton
    * Button with custom text and 6 color types:
      - DEFAULT_TYPE = 1;
      - PRIMARY_TYPE = 2;
      - SUCCESS_TYPE = 3;
      - INFO_TYPE = 4;
      - WARNING_TYPE = 5;
      - DANGER_TYPE = 6;
    ```java
    RectlookButton button = new RectlookButton("Button text", RectlookButton.DANGER_TYPE);
    ```
  6. RectlookCheckBox
    * Custom checkbox with customizable primary and secondary colors.
    ```java
    //new Color(138, 147, 179), new Color(114, 132, 193)
    RectlookCheckBox jcb = new RectlookCheckBox("Checkbox text", primaryColor, secundaryColor);
    ```
  7. RectlookFormField (Compound by RectlookTextField and CustomImageIcon)
    * Custom form field with customizable icon and placeholder text.
    ```java
    //the description is the placeholder
    RectlookFormField jpEmail = new RectlookFormField("iconPath", "formFieldDescription");
    ```
  8. RectlookTextField
    * Custom textfield with placeholder text.
    ```java
    RectlookTextField textField = new RectlookTextField();
    textField.setPlaceholder("placeHolderText");
    ```

-----------------------------

<b>ScreenShots</b> (showing button with normal colors and hover colors)

<img src="http://i.imgur.com/cprjvI7.jpg" alt="Components" title="Components">
