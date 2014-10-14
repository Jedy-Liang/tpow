

/* First created by JCasGen Mon Nov 24 17:43:52 EST 2008 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Nov 24 17:43:52 EST 2008
 * XML source: C:/Documents and Settings/Administrator/My Documents/WORK/Text2Test/workspaces/Europa workspace/Archetest/ArchetestTextAnalysis/LP_SP/ModelAnalysisDescriptors/POSOverrideCandidates.xml
 * @generated */
public class NounOverrideCandidateAnnotation extends OverrideCandidateAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NounOverrideCandidateAnnotation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NounOverrideCandidateAnnotation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NounOverrideCandidateAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NounOverrideCandidateAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NounOverrideCandidateAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    
