

/* First created by JCasGen Mon Nov 24 17:42:45 EST 2008 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Nov 24 17:43:52 EST 2008
 * XML source: C:/Documents and Settings/Administrator/My Documents/WORK/Text2Test/workspaces/Europa workspace/Archetest/ArchetestTextAnalysis/LP_SP/ModelAnalysisDescriptors/POSOverrideCandidates.xml
 * @generated */
public class OverrideCandidateAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(OverrideCandidateAnnotation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected OverrideCandidateAnnotation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public OverrideCandidateAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public OverrideCandidateAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public OverrideCandidateAnnotation(JCas jcas, int begin, int end) {
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

    
