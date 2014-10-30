
/* First created by JCasGen Mon Nov 24 17:43:52 EST 2008 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Nov 24 17:43:52 EST 2008
 * @generated */
public class VerbOverrideCandidateAnnotation_Type extends OverrideCandidateAnnotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (VerbOverrideCandidateAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = VerbOverrideCandidateAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new VerbOverrideCandidateAnnotation(addr, VerbOverrideCandidateAnnotation_Type.this);
  			   VerbOverrideCandidateAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new VerbOverrideCandidateAnnotation(addr, VerbOverrideCandidateAnnotation_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = VerbOverrideCandidateAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.tt.VerbOverrideCandidateAnnotation");
 
  /** @generated */
  final Feature casFeat_kind;
  /** @generated */
  final int     casFeatCode_kind;
  /** @generated */ 
  public String getKind(int addr) {
        if (featOkTst && casFeat_kind == null)
      jcas.throwFeatMissing("kind", "uima.tt.VerbOverrideCandidateAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_kind);
  }
  /** @generated */    
  public void setKind(int addr, String v) {
        if (featOkTst && casFeat_kind == null)
      jcas.throwFeatMissing("kind", "uima.tt.VerbOverrideCandidateAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_kind, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public VerbOverrideCandidateAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_kind = jcas.getRequiredFeatureDE(casType, "kind", "uima.cas.String", featOkTst);
    casFeatCode_kind  = (null == casFeat_kind) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_kind).getCode();

  }
}



    
