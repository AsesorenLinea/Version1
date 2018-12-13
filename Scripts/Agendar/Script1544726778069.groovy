import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable



WebUI.setText(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA/input_INGRESE_UserName'), 'admin@intergrupo.com')

WebUI.setEncryptedText(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA/input_INGRESE_Password'), 
    'b+8P+9F4CC4=')

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA/button_INGRESE'))

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/a_Usuarios'))

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/i_Activo_glyphicon glyphicon-e'))

WebUI.selectOptionByValue(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/select_Desconectado'), 
    '0', true)

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/button_Guardar'))

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/i_Toggle navigation_fa fa-user'))

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/i_Toggle navigation_fa fa-care'))

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/i_Toggle navigation_fa fa-user'))

WebUI.click(findTestObject('Page_AsesorEnLineaQA_Login/Page_AsesorEnLineaQA - CambiodeEstadoAsesor/a_Salir'))

