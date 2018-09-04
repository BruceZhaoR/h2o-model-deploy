package bruce.zhao;

import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name = "GBM_model_R_1536024753790_103", algorithm = "gbm")
public class GBM_model_R extends GenModel {
    // Names of columns used by model.
    public static final String[] NAMES = NamesHolder_GBM_model_R_1536024753790_103.VALUES;
    // Number of output classes included in training data response column.
    public static final int NCLASSES = 2;
    // Column domains. The last array contains domain of response column.
    public static final String[][] DOMAINS = new String[][]{
            /* AGE */ null,
            /* RACE */ null,
            /* PSA */ null,
            /* GLEASON */ null,
            /* CAPSULE */ GBM_model_R_1536024753790_103_ColInfo_4.VALUES
    };
    // Prior class distribution
    public static final double[] PRIOR_CLASS_DISTRIB = {0.5973684210526315, 0.4026315789473684};
    // Class distribution used for model building
    public static final double[] MODEL_CLASS_DISTRIB = {0.5973684210526315, 0.4026315789473684};
    public GBM_model_R() {
        super(NAMES, DOMAINS, "CAPSULE");
    }

    @Override
    public hex.ModelCategory getModelCategory() {
        return hex.ModelCategory.Binomial;
    }

    public boolean isSupervised() {
        return true;
    }

    public int nfeatures() {
        return 4;
    }

    public int nclasses() {
        return 2;
    }

    public String getUUID() {
        return Long.toString(3586255622491469577L);
    }

    // Pass in data in a double[], pre-aligned to the Model's requirements.
    // Jam predictions into the preds[] array; preds[0] is reserved for the
    // main prediction (class for classifiers or value for regression),
    // and remaining columns hold a probability distribution for classifiers.
    public final double[] score0(double[] data, double[] preds) {
        java.util.Arrays.fill(preds, 0);
        GBM_model_R_1536024753790_103_Forest_0.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_1.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_2.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_3.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_4.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_5.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_6.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_7.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_8.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_9.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_10.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_11.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_12.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_13.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_14.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_15.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_16.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_17.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_18.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_19.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_20.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_21.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_22.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_23.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_24.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_25.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_26.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_27.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_28.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_29.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_30.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_31.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_32.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_33.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_34.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_35.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_36.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_37.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_38.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_39.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_40.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_41.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_42.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_43.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_44.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_45.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_46.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_47.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_48.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_49.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_50.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_51.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_52.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_53.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_54.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_55.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_56.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_57.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_58.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_59.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_60.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_61.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_62.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_63.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_64.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_65.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_66.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_67.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_68.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_69.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_70.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_71.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_72.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_73.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_74.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_75.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_76.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_77.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_78.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_79.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_80.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_81.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_82.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_83.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_84.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_85.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_86.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_87.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_88.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_89.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_90.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_91.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_92.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_93.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_94.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_95.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_96.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_97.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_98.score0(data, preds);
        GBM_model_R_1536024753790_103_Forest_99.score0(data, preds);
        preds[2] = preds[1] + -0.3945120960889672;
        preds[2] = 1. / (1. + Math.min(1e19, Math.exp(-(preds[2]))));
        preds[1] = 1.0 - preds[2];
        preds[0] = hex.genmodel.GenModel.getPrediction(preds, PRIOR_CLASS_DISTRIB, data, 0.4595432309334924);
        return preds;
    }
}

// The class representing training column names
class NamesHolder_GBM_model_R_1536024753790_103 implements java.io.Serializable {
    public static final String[] VALUES = new String[4];

    static {
        NamesHolder_GBM_model_R_1536024753790_103_0.fill(VALUES);
    }

    static final class NamesHolder_GBM_model_R_1536024753790_103_0 implements java.io.Serializable {
        static final void fill(String[] sa) {
            sa[0] = "AGE";
            sa[1] = "RACE";
            sa[2] = "PSA";
            sa[3] = "GLEASON";
        }
    }
}

// The class representing column CAPSULE
class GBM_model_R_1536024753790_103_ColInfo_4 implements java.io.Serializable {
    public static final String[] VALUES = new String[2];

    static {
        GBM_model_R_1536024753790_103_ColInfo_4_0.fill(VALUES);
    }

    static final class GBM_model_R_1536024753790_103_ColInfo_4_0 implements java.io.Serializable {
        static final void fill(String[] sa) {
            sa[0] = "0";
            sa[1] = "1";
        }
    }
}

class GBM_model_R_1536024753790_103_Forest_0 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_0_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_0_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.16740088f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.14850238f :
                                        -0.05798854f)) :
                        (data[2 /* PSA */] < 6.525781f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.9450164f ?
                                        -0.0842475f :
                                        -0.12363595f) :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.0701802f :
                                        -0.033761524f))) :
                (data[2 /* PSA */] < 14.730078f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.9312882f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.815759f ?
                                        0.05347528f :
                                        0.21056902f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.289204f ?
                                        -0.028811917f :
                                        0.01969422f)) :
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 71.0f ?
                                        0.14442429f :
                                        0.005835324f) :
                                (data[2 /* PSA */] < 22.60625f ?
                                        0.12363594f :
                                        0.24836601f))));
        return pred;
    } // constant pool size = 58B, number of visited nodes = 14, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_1 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_1_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_1_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.15701175f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.13854405f :
                                        -0.0528595f)) :
                        (data[2 /* PSA */] < 6.525781f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.12599641f :
                                        -0.0793665f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.154871f ?
                                        -0.02777952f :
                                        0.084795594f))) :
                (data[2 /* PSA */] < 14.730078f ?
                        (data[0 /* AGE */] < 63.0f ?
                                0.13355602f :
                                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                        -0.0031637258f :
                                        0.13056399f)) :
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.12636209f :
                                        -0.014016966f) :
                                (data[2 /* PSA */] < 22.60625f ?
                                        0.10889657f :
                                        0.21573651f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_2 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_2_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_2_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.1487276f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.13020651f :
                                        -0.048200656f)) :
                        (data[2 /* PSA */] < 6.525781f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.9450164f ?
                                        -0.07016609f :
                                        -0.108548716f) :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.064521454f :
                                        -0.029727846f))) :
                (data[2 /* PSA */] < 14.730078f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.9312882f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.815759f ?
                                        0.04344472f :
                                        0.17564823f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.9020605f ?
                                        0.0046100225f :
                                        -0.046753984f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 71.0f ?
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.15106514f :
                                        0.064794324f) :
                                0.04803188f)));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_3 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_3_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_3_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.14199363f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.12306212f :
                                        -0.04395478f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.371876f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.555713f ?
                                        -0.0744748f :
                                        -0.024346266f) :
                                0.07737841f)) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                (data[0 /* AGE */] < 60.5f ?
                                        0.12130902f :
                                        0.058202643f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.780704f ?
                                        -0.035435773f :
                                        0.042015526f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.050073832f :
                                (data[2 /* PSA */] < 34.676006f ?
                                        0.19294229f :
                                        0.18340106f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_4 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_4_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_4_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.1364348f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.116813436f :
                                        -0.040076245f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.371876f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.555713f ?
                                        -0.06880712f :
                                        -0.022037327f) :
                                0.06875833f)) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                (data[0 /* AGE */] < 60.5f ?
                                        0.10906853f :
                                        0.05217617f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.780704f ?
                                        -0.032094423f :
                                        0.037654117f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.044925503f :
                                (data[2 /* PSA */] < 34.676006f ?
                                        0.17671843f :
                                        0.16943967f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_5 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_5_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_5_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.13178802f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.11124683f :
                                        -0.03652787f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.371876f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.765882f ?
                                        -0.033004075f :
                                        -0.0845138f) :
                                0.061344493f)) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                        (data[0 /* AGE */] < 66.5f ?
                                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                        0.06829209f :
                                        0.1429039f) :
                                (data[0 /* AGE */] < 67.5f ?
                                        -0.111156024f :
                                        0.038237657f)) :
                        0.17426743f));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_6 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_6_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_6_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                -0.12786305f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.10620487f :
                                        -0.033278648f)) :
                        (data[2 /* PSA */] < 6.525781f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.101845644f :
                                        -0.052654225f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        -0.03431703f :
                                        0.041363273f))) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                (data[0 /* AGE */] < 60.5f ?
                                        0.09249172f :
                                        0.042732757f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.137579f ?
                                        0.012627347f :
                                        -0.07311358f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.034960836f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.0f ?
                                        0.15137844f :
                                        0.15903305f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_7 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_7_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_7_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.452734f ?
                        (data[3 /* GLEASON */] < 5.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.91875f ?
                                        -0.08635752f :
                                        -0.13908868f) :
                                (data[0 /* AGE */] < 55.5f ?
                                        0.026666403f :
                                        -0.043135382f)) :
                        0.019909477f) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.21961f ?
                                        0.038840182f :
                                        -0.029094258f) :
                                (data[2 /* PSA */] < 18.409023f ?
                                        0.031477112f :
                                        0.14823143f)) :
                        0.15868501f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_8 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_8_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_8_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[2 /* PSA */] < 6.5621095f ?
                        (data[2 /* PSA */] < 1.3396081f ?
                                -0.13192818f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                        -0.073586375f :
                                        -0.02258729f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 62.5f ?
                                        0.012178279f :
                                        -0.11569656f) :
                                (data[2 /* PSA */] < 8.844531f ?
                                        0.06814852f :
                                        -0.01589728f))) :
                (data[2 /* PSA */] < 14.730078f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.9312882f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.815759f ?
                                        0.021077974f :
                                        0.13558044f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.9020605f ?
                                        -0.011113501f :
                                        -0.06312032f)) :
                        (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 50.903908f ?
                                        0.06592503f :
                                        0.15630533f) :
                                0.0035433588f)));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_9 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_9_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_9_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.452734f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.948413f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.9533668f ?
                                        -0.06748411f :
                                        0.0025851768f) :
                                (data[2 /* PSA */] < 11.141831f ?
                                        -0.14619783f :
                                        -0.043795478f)) :
                        0.023683988f) :
                (data[2 /* PSA */] < 14.730078f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.847549f ?
                                (data[0 /* AGE */] < 63.5f ?
                                        0.10586407f :
                                        0.016091242f) :
                                (data[2 /* PSA */] < 12.387504f ?
                                        -0.062585175f :
                                        -0.007714404f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 71.0f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        0.06586176f :
                                        0.16879989f) :
                                0.009213451f)));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_10 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_10_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_10_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                (data[2 /* PSA */] < 1.8997146f ?
                                        -0.11887761f :
                                        -0.1198614f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.09505887f :
                                        -0.022488786f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.371876f ?
                                (data[0 /* AGE */] < 55.5f ?
                                        0.03130931f :
                                        -0.03319864f) :
                                0.05657438f)) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        0.028703028f :
                                        0.08585588f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.137579f ?
                                        0.004903728f :
                                        -0.07636725f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.02338537f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 44.137627f ?
                                        0.13807748f :
                                        0.13141786f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_11 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_11_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_11_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                (data[2 /* PSA */] < 1.8997146f ?
                                        -0.11676217f :
                                        -0.11761825f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.091086216f :
                                        -0.020423561f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.371876f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.765882f ?
                                        -0.014243921f :
                                        -0.06361749f) :
                                0.050715994f)) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                        (data[0 /* AGE */] < 66.5f ?
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.012539356f :
                                        0.06545018f) :
                                (data[0 /* AGE */] < 67.5f ?
                                        -0.115231015f :
                                        0.020535937f)) :
                        0.1382968f));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_12 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_12_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_12_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 5.8074217f ?
                                (data[2 /* PSA */] < 1.8997146f ?
                                        -0.11491527f :
                                        -0.115663506f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.0872811f :
                                        -0.018536244f)) :
                        (data[2 /* PSA */] < 6.525781f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.08735389f :
                                        -0.030803647f) :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.07368185f :
                                        -0.012713396f))) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        0.02264928f :
                                        0.07527387f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.780704f ?
                                        -0.04108985f :
                                        0.023593785f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.019718677f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 44.137627f ?
                                        0.1321651f :
                                        0.12514447f))));
        return pred;
    } // constant pool size = 58B, number of visited nodes = 14, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_13 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_13_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_13_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.730078f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.954502f ?
                        (data[2 /* PSA */] < 2.8457298f ?
                                (data[2 /* PSA */] < 1.2944257f ?
                                        -0.1321181f :
                                        -0.060164474f) :
                                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                        -0.019781297f :
                                        0.024111701f)) :
                        -0.08739871f) :
                (data[2 /* PSA */] < 16.926815f ?
                        0.11011544f :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 33.861717f ?
                                        0.017838212f :
                                        0.09295852f) :
                                -0.05516504f)));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_14 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_14_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_14_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 63.0f ?
                                        -0.0017855897f :
                                        -0.09747345f) :
                                (data[2 /* PSA */] < 5.567969f ?
                                        -0.059696745f :
                                        0.047518283f)) :
                        -0.081532955f) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (data[0 /* AGE */] < 66.5f ?
                                (data[2 /* PSA */] < 12.780704f ?
                                        0.07049063f :
                                        0.0060992343f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.780704f ?
                                        -0.037142444f :
                                        0.029463045f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.015094814f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 44.137627f ?
                                        0.12793905f :
                                        0.12022662f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_15 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_15_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_15_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.730078f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.952933f ?
                        (data[2 /* PSA */] < 2.845207f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9504076f ?
                                        -0.04686601f :
                                        -0.1011222f) :
                                (data[0 /* AGE */] < 55.5f ?
                                        0.10079273f :
                                        -5.152731E-4f)) :
                        (data[2 /* PSA */] < 11.148972f ?
                                -0.12627204f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.952229f ?
                                        0.040880412f :
                                        -0.08097116f))) :
                (data[2 /* PSA */] < 16.926815f ?
                        0.1005254f :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 33.861717f ?
                                        0.01456189f :
                                        0.08451176f) :
                                -0.055112217f)));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_16 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_16_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_16_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[0 /* AGE */] < 59.5f ?
                                -0.11591472f :
                                (data[2 /* PSA */] < 5.7414064f ?
                                        -0.1118486f :
                                        -0.036352504f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 63.0f ?
                                        0.003701385f :
                                        -0.07130464f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.2863283f ?
                                        -0.031352125f :
                                        0.047344126f))) :
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.29457f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 15.121285f ?
                                        -0.0018244522f :
                                        0.1171317f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 54.60671f ?
                                        -0.06345552f :
                                        0.06468295f)) :
                        (data[2 /* PSA */] < 18.59125f ?
                                0.012814372f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 44.137627f ?
                                        0.124563046f :
                                        0.11648809f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_17 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_17_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_17_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 63.0f ?
                                        -9.899102E-4f :
                                        -0.08786303f) :
                                (data[2 /* PSA */] < 5.567969f ?
                                        -0.05067083f :
                                        0.0419294f)) :
                        -0.07734435f) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                        (data[0 /* AGE */] < 66.5f ?
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.032486055f :
                                        0.048019107f) :
                                (data[0 /* AGE */] < 67.5f ?
                                        -0.11203895f :
                                        0.014589846f)) :
                        0.123985775f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_18 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_18_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_18_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (data[3 /* GLEASON */] < 5.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.1402345f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.3498597f ?
                                        -0.110129505f :
                                        0.021333229f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.11584854f :
                                        -0.023366652f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 15.032812f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.738208f ?
                                        0.0042206272f :
                                        -0.03720131f) :
                                (data[2 /* PSA */] < 21.593517f ?
                                        0.08642911f :
                                        -0.008495877f))) :
                (data[2 /* PSA */] < 18.405664f ?
                        0.0110413795f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 44.228092f ?
                                0.121314615f :
                                0.11364721f)));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_19 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_19_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_19_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 63.0f ?
                                        5.779991E-4f :
                                        -0.0826668f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.525781f ?
                                        -0.034832165f :
                                        0.044084314f)) :
                        -0.07148412f) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.21961f ?
                                        0.018171906f :
                                        -0.04770101f) :
                                (data[2 /* PSA */] < 18.409023f ?
                                        0.009951308f :
                                        0.117707685f)) :
                        0.12125101f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_20 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_20_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_20_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.2383485f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.554577f ?
                                        -0.108296044f :
                                        -0.10927335f) :
                                0.026461143f) :
                        (data[2 /* PSA */] < 9.60874f ?
                                -0.08549745f :
                                (data[0 /* AGE */] < 68.0f ?
                                        -0.11314214f :
                                        -0.004431602f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 23.170313f ?
                        (data[2 /* PSA */] < 2.8461092f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9509927f ?
                                        -0.015480331f :
                                        -0.08917336f) :
                                (data[2 /* PSA */] < 4.903145f ?
                                        0.045868866f :
                                        -0.0034678357f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 60.198048f ?
                                        0.08066328f :
                                        0.009117283f) :
                                -0.04113521f)));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_21 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_21_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_21_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.730078f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.952933f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.7478576f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.06781f ?
                                        -0.007599119f :
                                        -0.06682713f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        0.006775285f :
                                        0.0499828f)) :
                        (data[2 /* PSA */] < 11.148972f ?
                                -0.1180971f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.056858376f :
                                        0.049124658f))) :
                (data[2 /* PSA */] < 16.926815f ?
                        0.08513994f :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        0.006944413f :
                                        0.06316087f) :
                                -0.053080667f)));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_22 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_22_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_22_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.2383485f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.554577f ?
                                        -0.107390374f :
                                        -0.10825147f) :
                                0.026570367f) :
                        (data[2 /* PSA */] < 9.60874f ?
                                -0.08294702f :
                                (data[0 /* AGE */] < 68.0f ?
                                        -0.11146653f :
                                        -0.0045866375f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.971874f ?
                        (data[0 /* AGE */] < 63.5f ?
                                (data[2 /* PSA */] < 4.108594f ?
                                        -0.044550743f :
                                        0.035250224f) :
                                (data[0 /* AGE */] < 67.5f ?
                                        -0.049002223f :
                                        0.0071855513f)) :
                        (data[2 /* PSA */] < 45.479076f ?
                                0.10408356f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.826004f ?
                                        -0.0149767f :
                                        0.118187726f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_23 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_23_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_23_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (data[2 /* PSA */] < 1.3890625f ?
                        -0.12590276f :
                        (data[3 /* GLEASON */] < 5.5f ?
                                (data[0 /* AGE */] < 61.5f ?
                                        -0.02040258f :
                                        -0.051145807f) :
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.00635103f :
                                        -0.02371753f))) :
                (data[2 /* PSA */] < 18.405664f ?
                        0.006313407f :
                        (data[2 /* PSA */] < 34.278164f ?
                                0.11675078f :
                                0.111016504f)));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_24 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_24_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_24_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (data[2 /* PSA */] < 1.3890625f ?
                        -0.12328075f :
                        (data[3 /* GLEASON */] < 5.5f ?
                                (data[0 /* AGE */] < 61.5f ?
                                        -0.018673949f :
                                        -0.047492713f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 52.54375f ?
                                        7.149035E-4f :
                                        0.0455877f))) :
                (data[2 /* PSA */] < 18.405664f ?
                        0.00568744f :
                        (data[2 /* PSA */] < 34.278164f ?
                                0.11491932f :
                                0.10987751f)));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_25 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_25_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_25_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.90381f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.409693f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.606062f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                        -0.011997344f :
                                        0.02649678f) :
                                0.10550822f) :
                        (data[2 /* PSA */] < 23.745596f ?
                                -0.129377f :
                                (data[0 /* AGE */] < 66.5f ?
                                        0.07085694f :
                                        -0.065411314f))) :
                (data[2 /* PSA */] < 45.52328f ?
                        0.09595443f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86019f ?
                                -0.019372717f :
                                0.11537521f)));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_26 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_26_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_26_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (data[2 /* PSA */] < 1.3890625f ?
                        -0.120833784f :
                        (data[3 /* GLEASON */] < 5.5f ?
                                (data[2 /* PSA */] < 5.575f ?
                                        -0.107526205f :
                                        -0.023407836f) :
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.0055607185f :
                                        -0.02118907f))) :
                (data[2 /* PSA */] < 16.091406f ?
                        0.050478216f :
                        (data[2 /* PSA */] < 24.058367f ?
                                -0.04326268f :
                                (data[2 /* PSA */] < 48.903248f ?
                                        0.11167538f :
                                        0.107383415f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_27 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_27_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_27_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 63.0f ?
                                        0.0047745802f :
                                        -0.07486896f) :
                                (data[2 /* PSA */] < 5.567969f ?
                                        -0.038372528f :
                                        0.039831746f)) :
                        -0.06384116f) :
                (data[2 /* PSA */] < 4.9285154f ?
                        0.043270312f :
                        (data[0 /* AGE */] < 66.5f ?
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.041677784f :
                                        0.0405765f) :
                                (data[2 /* PSA */] < 12.366406f ?
                                        -0.043889325f :
                                        0.016393118f))));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_28 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_28_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_28_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (data[2 /* PSA */] < 1.3890625f ?
                        -0.11922495f :
                        (data[3 /* GLEASON */] < 5.5f ?
                                (data[0 /* AGE */] < 61.5f ?
                                        -0.011363017f :
                                        -0.041755144f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.70625f ?
                                        0.011534242f :
                                        -0.0056325174f))) :
                (data[2 /* PSA */] < 16.091406f ?
                        0.046518084f :
                        (data[2 /* PSA */] < 24.058367f ?
                                -0.039555993f :
                                (data[2 /* PSA */] < 48.903248f ?
                                        0.11033924f :
                                        0.106466144f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_29 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_29_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_29_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 15.002344f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.948413f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.744838f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.0651093f ?
                                        -0.0020686104f :
                                        -0.060039982f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        0.007739647f :
                                        0.047766823f)) :
                        (data[2 /* PSA */] < 11.152111f ?
                                -0.111980654f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.053364288f :
                                        0.04904932f))) :
                (data[2 /* PSA */] < 21.456423f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.588583f ?
                                (data[2 /* PSA */] < 17.157719f ?
                                        0.06442202f :
                                        -0.00879734f) :
                                0.09910066f) :
                        (data[2 /* PSA */] < 23.765867f ?
                                -0.114995375f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 71.0f ?
                                        0.04005382f :
                                        -0.06112156f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_30 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_30_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_30_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (data[0 /* AGE */] < 59.5f ?
                        -0.12003007f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9503906f ?
                                0.027169982f :
                                -0.073771164f)) :
                (data[2 /* PSA */] < 3.688165f ?
                        0.06408289f :
                        (data[0 /* AGE */] < 63.5f ?
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.02585871f :
                                        -0.047454074f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 53.10625f ?
                                        -0.012221862f :
                                        0.14062138f))));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_31 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_31_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_31_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (data[2 /* PSA */] < 1.3890625f ?
                        -0.1173956f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.221935f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 15.10501f ?
                                        -0.006015266f :
                                        0.0757006f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                        0.0055805533f :
                                        -0.113446355f))) :
                (data[2 /* PSA */] < 18.405664f ?
                        -4.673449E-4f :
                        (data[2 /* PSA */] < 34.278164f ?
                                0.112977676f :
                                0.1065294f)));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_32 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_32_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_32_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[0 /* AGE */] < 59.5f ?
                        -0.109913036f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.964844f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.780225f ?
                                        -0.105407834f :
                                        0.019388558f) :
                                -0.044218328f)) :
                (data[2 /* PSA */] < 3.2949219f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.4993958f ?
                                (data[2 /* PSA */] < 1.6488482f ?
                                        -0.05269447f :
                                        0.07008466f) :
                                -0.063340545f) :
                        (data[2 /* PSA */] < 4.893419f ?
                                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                        0.005459769f :
                                        0.09087437f) :
                                (data[2 /* PSA */] < 5.946595f ?
                                        -0.056544438f :
                                        0.006593522f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_33 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_33_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_33_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.90381f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.409693f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.606062f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                        -0.009274445f :
                                        0.024536574f) :
                                0.08873628f) :
                        (data[2 /* PSA */] < 23.745596f ?
                                -0.10382239f :
                                (data[0 /* AGE */] < 66.5f ?
                                        0.062313236f :
                                        -0.059612416f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 61.37584f ?
                        (data[2 /* PSA */] < 45.525272f ?
                                0.0855071f :
                                0.040273108f) :
                        -0.021567015f));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_34 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_34_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_34_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 8.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.6f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.7519536f ?
                                        -0.008706926f :
                                        0.03765209f) :
                                (data[0 /* AGE */] < 54.5f ?
                                        -0.0987416f :
                                        -0.005736786f)) :
                        0.06775726f) :
                0.11178137f);
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_35 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_35_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_35_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.2383485f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.554577f ?
                                        -0.1040942f :
                                        -0.105023175f) :
                                0.05071846f) :
                        (data[2 /* PSA */] < 9.60874f ?
                                -0.07411406f :
                                (data[0 /* AGE */] < 68.0f ?
                                        -0.108283676f :
                                        0.017748307f))) :
                (data[0 /* AGE */] < 59.5f ?
                        (data[2 /* PSA */] < 6.2898436f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 56.5f ?
                                        -0.08469498f :
                                        -0.0042561106f) :
                                (data[2 /* PSA */] < 10.030786f ?
                                        0.08899823f :
                                        0.031047896f)) :
                        (data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        -0.0023119699f :
                                        -0.09537205f) :
                                (data[2 /* PSA */] < 9.0125f ?
                                        0.024301467f :
                                        -0.003961146f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_36 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_36_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_36_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 8.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.6f ?
                                (data[0 /* AGE */] < 55.5f ?
                                        0.07732908f :
                                        -0.0013568786f) :
                                (data[0 /* AGE */] < 54.5f ?
                                        -0.09380824f :
                                        -0.0045862147f)) :
                        0.062442906f) :
                0.11080301f);
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_37 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_37_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_37_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.41582f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.942963f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.340278f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.739946f ?
                                        0.0043955194f :
                                        -0.05707441f) :
                                0.061533716f) :
                        (data[0 /* AGE */] < 65.5f ?
                                0.03400762f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.599218f ?
                                        -0.14389615f :
                                        -0.027185336f))) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 22.685938f ?
                                (data[0 /* AGE */] < 61.5f ?
                                        0.028355306f :
                                        -0.08402939f) :
                                (data[2 /* PSA */] < 31.827662f ?
                                        0.098848216f :
                                        -0.013753214f)) :
                        (data[2 /* PSA */] < 21.44375f ?
                                (data[0 /* AGE */] < 70.5f ?
                                        0.08024886f :
                                        0.098083176f) :
                                (data[2 /* PSA */] < 32.26023f ?
                                        -0.071762204f :
                                        0.04506266f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_38 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_38_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_38_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 1.3890625f ?
                -0.115459524f :
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 6.802344f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.248923f ?
                                        -0.10445336f :
                                        0.04290814f) :
                                (data[2 /* PSA */] < 9.679422f ?
                                        -0.069312945f :
                                        -0.012508431f)) :
                        (data[2 /* PSA */] < 1.9402344f ?
                                0.061620086f :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.024626713f :
                                        -0.0016938187f))));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_39 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_39_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_39_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (data[0 /* AGE */] < 59.5f ?
                        -0.11815122f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9503906f ?
                                0.030912658f :
                                -0.06483897f)) :
                (data[2 /* PSA */] < 3.688165f ?
                        0.06016996f :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (data[0 /* AGE */] < 61.0f ?
                                        0.029450774f :
                                        -0.014841493f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 19.6375f ?
                                        0.03898459f :
                                        -0.063175276f))));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_40 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_40_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_40_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.41582f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.942963f ?
                        (data[0 /* AGE */] < 55.5f ?
                                0.05467757f :
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.0988269f :
                                        0.002905934f)) :
                        (data[0 /* AGE */] < 65.5f ?
                                0.028307382f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.599218f ?
                                        -0.13862176f :
                                        -0.024721699f))) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 22.685938f ?
                                (data[0 /* AGE */] < 61.5f ?
                                        0.022094443f :
                                        -0.07410577f) :
                                (data[2 /* PSA */] < 31.827662f ?
                                        0.09143971f :
                                        -0.012275523f)) :
                        (data[2 /* PSA */] < 21.44375f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 15.81897f ?
                                        0.067278005f :
                                        0.098662f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 73.5f ?
                                        0.04060925f :
                                        -0.06539723f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_41 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_41_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_41_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 63.0f ?
                                        0.0038743678f :
                                        -0.06943956f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.525781f ?
                                        -0.023417491f :
                                        0.0452526f)) :
                        -0.05736745f) :
                (data[2 /* PSA */] < 7.9234376f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.7962713f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.9034905f ?
                                        0.03334488f :
                                        -0.03972364f) :
                                0.10097598f) :
                        (data[2 /* PSA */] < 11.0119505f ?
                                (data[0 /* AGE */] < 67.5f ?
                                        0.0146376975f :
                                        -0.08262794f) :
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.017890457f :
                                        -0.040287714f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_42 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_42_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_42_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.90381f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.409693f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.606062f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                        -0.0076581687f :
                                        0.01898854f) :
                                0.08032801f) :
                        (data[2 /* PSA */] < 23.745596f ?
                                -0.08876067f :
                                (data[0 /* AGE */] < 66.5f ?
                                        0.04918538f :
                                        -0.05121011f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 61.37584f ?
                        (data[0 /* AGE */] < 67.5f ?
                                0.083961144f :
                                0.04147172f) :
                        -0.026415462f));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_43 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_43_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_43_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 75.5f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                        -0.014661594f :
                                        0.02087642f) :
                                -0.08336688f) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 73.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.695312f ?
                                        -0.01404526f :
                                        0.08118724f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 10.447266f ?
                                        0.073866315f :
                                        -0.01779714f))) :
                (data[2 /* PSA */] < 8.331836f ?
                        -0.034238752f :
                        -0.01972337f));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_44 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_44_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_44_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.2383485f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.554577f ?
                                        -0.103129566f :
                                        -0.104008526f) :
                                0.041194398f) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 65.5f ?
                                        -0.10820009f :
                                        0.04291789f) :
                                -0.05077502f)) :
                (data[2 /* PSA */] < 1.6613281f ?
                        -0.049468197f :
                        (data[2 /* PSA */] < 4.8966093f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 3.9601026f ?
                                        0.0014581304f :
                                        0.064027734f) :
                                (data[2 /* PSA */] < 5.949761f ?
                                        -0.047311112f :
                                        0.0050023f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_45 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_45_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_45_class_0 {
    static final double score0(double[] data) {
        double pred = (data[0 /* AGE */] < 53.5f ?
                -0.04079671f :
                (data[0 /* AGE */] < 55.5f ?
                        0.03917941f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 51.48594f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.0709466f :
                                        -8.5317943E-4f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        0.012358296f :
                                        0.14577001f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_46 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_46_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_46_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.400585f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 15.095137f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.622264f ?
                                        0.0032056787f :
                                        -0.020504346f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.099874f ?
                                        0.09951284f :
                                        0.011053804f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (data[0 /* AGE */] < 62.5f ?
                                        -0.060505368f :
                                        0.025391985f) :
                                -0.09816068f)) :
                (data[2 /* PSA */] < 16.091406f ?
                        0.039941948f :
                        (data[2 /* PSA */] < 24.058367f ?
                                -0.048233137f :
                                (data[2 /* PSA */] < 48.903248f ?
                                        0.10957148f :
                                        0.10376179f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_47 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_47_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_47_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 1.3890625f ?
                -0.114165135f :
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[2 /* PSA */] < 6.802344f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.248923f ?
                                        -0.10346327f :
                                        0.03627628f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                        -0.021585708f :
                                        -0.045956943f)) :
                        (data[2 /* PSA */] < 1.9402344f ?
                                0.058921635f :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.02027691f :
                                        -0.0014022079f))));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_48 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_48_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_48_class_0 {
    static final double score0(double[] data) {
        double pred = (data[0 /* AGE */] < 53.5f ?
                -0.039530884f :
                (data[0 /* AGE */] < 55.5f ?
                        0.03517369f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 51.48594f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.06735027f :
                                        -6.249222E-4f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        0.01335539f :
                                        0.14569366f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_49 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_49_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_49_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 75.5f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 22.625782f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.893109f ?
                                        0.0032792727f :
                                        -0.021536672f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 60.126118f ?
                                        0.040457536f :
                                        -0.0358918f)) :
                        (data[2 /* PSA */] < 3.5671875f ?
                                -0.12534213f :
                                (data[2 /* PSA */] < 8.774158f ?
                                        0.14363083f :
                                        -0.007229682f))) :
                (data[2 /* PSA */] < 8.331836f ?
                        -0.031479686f :
                        -0.018196862f));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_50 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_50_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_50_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.400585f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.724228f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.9212f ?
                                        -8.4568764E-4f :
                                        -0.059133742f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.0f ?
                                        0.017954014f :
                                        0.09844992f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (data[0 /* AGE */] < 62.5f ?
                                        -0.055286825f :
                                        0.018996472f) :
                                -0.093101785f)) :
                (data[2 /* PSA */] < 16.091406f ?
                        0.03724976f :
                        (data[0 /* AGE */] < 66.5f ?
                                0.11711218f :
                                -0.04138372f)));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_51 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_51_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_51_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 1.3890625f ?
                -0.112675905f :
                (data[3 /* GLEASON */] < 5.5f ?
                        (data[0 /* AGE */] < 61.5f ?
                                0.017266607f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.07598778f :
                                        0.0017410088f)) :
                        (data[2 /* PSA */] < 1.9402344f ?
                                0.054355692f :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.0199776f :
                                        -0.0016387227f))));
        return pred;
    } // constant pool size = 26B, number of visited nodes = 6, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_52 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_52_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_52_class_0 {
    static final double score0(double[] data) {
        double pred = (data[0 /* AGE */] < 53.5f ?
                -0.03636787f :
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (data[0 /* AGE */] < 63.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.190625f ?
                                        0.0064124744f :
                                        0.057780486f) :
                                (data[0 /* AGE */] < 67.5f ?
                                        -0.039316572f :
                                        0.008335235f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 13.641016f ?
                                0.022758938f :
                                -0.06495005f)));
        return pred;
    } // constant pool size = 26B, number of visited nodes = 6, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_53 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_53_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_53_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 75.5f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 22.625782f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.893109f ?
                                        0.0030787513f :
                                        -0.020488704f) :
                                (data[2 /* PSA */] < 27.198994f ?
                                        0.054110922f :
                                        0.007744764f)) :
                        (data[2 /* PSA */] < 3.5671875f ?
                                -0.12337431f :
                                (data[2 /* PSA */] < 8.774158f ?
                                        0.1279633f :
                                        -0.006572832f))) :
                (data[2 /* PSA */] < 8.331836f ?
                        -0.030033441f :
                        -0.014711005f));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_54 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_54_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_54_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.36283f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.60656f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 16.96183f ?
                                        7.873267E-4f :
                                        -0.041678064f) :
                                0.07173718f) :
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.0074369167f :
                                        -0.08824489f) :
                                0.11112587f)) :
                0.10871576f);
        return pred;
    } // constant pool size = 26B, number of visited nodes = 6, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_55 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_55_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_55_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.90381f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.409693f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.616545f ?
                                (data[0 /* AGE */] < 63.5f ?
                                        0.012877423f :
                                        -0.008690422f) :
                                (data[0 /* AGE */] < 63.5f ?
                                        -0.021853216f :
                                        0.09403868f)) :
                        (data[2 /* PSA */] < 23.745596f ?
                                -0.08110779f :
                                (data[0 /* AGE */] < 66.5f ?
                                        0.039961383f :
                                        -0.05222786f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 61.37584f ?
                        (data[0 /* AGE */] < 67.5f ?
                                0.0746968f :
                                0.04317688f) :
                        -0.033684622f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_56 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_56_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_56_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 24.484766f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.825553f ?
                                        -0.005210048f :
                                        0.058526017f) :
                                -0.055592358f) :
                        -0.055996183f) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.042614527f :
                                        0.016746672f) :
                                -0.077967346f) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 19.672579f ?
                                (data[0 /* AGE */] < 74.5f ?
                                        0.082930185f :
                                        0.024793519f) :
                                -0.033699356f)));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_57 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_57_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_57_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.025f ?
                                        0.006993599f :
                                        -0.029988991f) :
                                (data[2 /* PSA */] < 12.4625f ?
                                        0.03980214f :
                                        6.704996E-5f)) :
                        -0.07866174f) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.452734f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.043874f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.087513f ?
                                        -0.0017660366f :
                                        0.09763687f) :
                                (data[2 /* PSA */] < 11.589881f ?
                                        -0.08303626f :
                                        0.0029135772f)) :
                        (data[2 /* PSA */] < 24.320038f ?
                                0.10578374f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 50.797527f ?
                                        -0.04020737f :
                                        0.09899199f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_58 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_58_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_58_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (data[0 /* AGE */] < 63.5f ?
                                0.10139545f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.11904475f :
                                        0.05225415f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 65.5f ?
                                        -0.10711409f :
                                        0.041190457f) :
                                -0.048630703f)) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 65.5f ?
                                        -0.0019381476f :
                                        0.053775582f) :
                                -0.07050421f) :
                        (data[0 /* AGE */] < 68.5f ?
                                (data[2 /* PSA */] < 10.447266f ?
                                        0.12054735f :
                                        -0.021897437f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.896875f ?
                                        -0.013515861f :
                                        0.0308616f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_59 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_59_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_59_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.2949219f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.5520408f ?
                        (data[0 /* AGE */] < 61.5f ?
                                -0.11701716f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                        0.11437306f :
                                        -0.03326699f)) :
                        -0.062681474f) :
                (data[2 /* PSA */] < 4.893419f ?
                        (data[2 /* PSA */] < 3.7512612f ?
                                0.10845104f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.550105f ?
                                        -0.04752996f :
                                        0.08404208f)) :
                        (data[2 /* PSA */] < 5.946595f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.008290139f :
                                        -0.09444726f) :
                                (data[0 /* AGE */] < 60.5f ?
                                        0.039857857f :
                                        -0.004861479f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_60 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_60_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_60_class_0 {
    static final double score0(double[] data) {
        double pred = (data[0 /* AGE */] < 53.5f ?
                -0.033962417f :
                (data[0 /* AGE */] < 55.5f ?
                        0.031835943f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 52.847267f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.07053729f :
                                        -3.0723642E-4f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 71.16776f ?
                                        0.04724916f :
                                        0.10703862f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_61 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_61_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_61_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 73.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 22.489649f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.834615f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.339227f ?
                                        -0.009609661f :
                                        0.02532764f) :
                                (data[2 /* PSA */] < 10.697024f ?
                                        -0.12567112f :
                                        -0.011333135f)) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 60.03359f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 42.2418f ?
                                        0.011255597f :
                                        0.14245051f) :
                                -0.03811602f)) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 19.63086f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 75.5f ?
                                (data[2 /* PSA */] < 7.6539063f ?
                                        0.07084922f :
                                        0.06557326f) :
                                -0.026178285f) :
                        -0.04592961f));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_62 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_62_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_62_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 1.3890625f ?
                -0.11024453f :
                (data[2 /* PSA */] < 1.9293396f ?
                        0.040732108f :
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        -0.0026762749f :
                                        -0.052911356f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                        -3.40207E-4f :
                                        0.027831146f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_63 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_63_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_63_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (data[0 /* AGE */] < 59.5f ?
                        -0.11638096f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9503906f ?
                                0.035616357f :
                                -0.056275114f)) :
                (data[2 /* PSA */] < 3.688165f ?
                        0.058331564f :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (data[0 /* AGE */] < 61.0f ?
                                        0.023627292f :
                                        -0.012567647f) :
                                (data[2 /* PSA */] < 6.8875f ?
                                        0.06349943f :
                                        -1.9854585E-4f))));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_64 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_64_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_64_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 8.5f ?
                (data[0 /* AGE */] < 54.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.71875f ?
                                0.0433068f :
                                -0.088274054f) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 52.917187f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 76.5f ?
                                        2.357982E-4f :
                                        -0.047894735f) :
                                0.053303596f)) :
                0.052454468f);
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_65 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_65_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_65_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[0 /* AGE */] < 59.5f ?
                        -0.109096505f :
                        (data[0 /* AGE */] < 64.5f ?
                                0.053364575f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.35f ?
                                        -0.0772743f :
                                        0.017564308f))) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 60.483593f ?
                                        0.00585143f :
                                        -0.06700727f) :
                                -0.063436955f) :
                        (data[0 /* AGE */] < 68.5f ?
                                (data[2 /* PSA */] < 10.447266f ?
                                        0.10933319f :
                                        -0.01898427f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.896875f ?
                                        -0.012594651f :
                                        0.028066661f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_66 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_66_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_66_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 46.846252f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.846012f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.404055f ?
                                        0.0013901521f :
                                        -0.030677767f) :
                                0.070610404f) :
                        -0.03118904f) :
                0.10796461f);
        return pred;
    } // constant pool size = 18B, number of visited nodes = 4, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_67 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_67_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_67_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.2949219f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.5520408f ?
                        (data[0 /* AGE */] < 61.5f ?
                                -0.11425989f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.6492188f ?
                                        -0.025252983f :
                                        0.08433893f)) :
                        -0.0587052f) :
                (data[2 /* PSA */] < 4.893419f ?
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                                        -0.034298748f :
                                        0.035144646f) :
                                0.06322053f) :
                        (data[2 /* PSA */] < 5.946595f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.006598914f :
                                        -0.088560164f) :
                                (data[0 /* AGE */] < 60.5f ?
                                        0.036871802f :
                                        -0.0043480447f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_68 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_68_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_68_class_0 {
    static final double score0(double[] data) {
        double pred = (data[0 /* AGE */] < 53.5f ?
                -0.030984728f :
                (data[0 /* AGE */] < 55.5f ?
                        0.030530253f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 52.847267f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.068064235f :
                                        -1.4092485E-4f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 71.16776f ?
                                        0.041451126f :
                                        0.106093526f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_69 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_69_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_69_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 1.3890625f ?
                -0.10938585f :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 59.74531f ?
                                        0.003639574f :
                                        -0.067179985f) :
                                -0.062214583f) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.60703f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.743811f ?
                                        0.013466963f :
                                        -0.020535951f) :
                                (data[2 /* PSA */] < 24.256592f ?
                                        0.09826082f :
                                        -0.007906523f))));
        return pred;
    } // constant pool size = 30B, number of visited nodes = 7, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_70 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_70_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_70_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.2383485f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.554577f ?
                                        -0.102165215f :
                                        -0.10295733f) :
                                0.0438861f) :
                        (data[2 /* PSA */] < 9.60874f ?
                                -0.06352052f :
                                (data[0 /* AGE */] < 68.0f ?
                                        -0.10484926f :
                                        0.015068674f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 16.908203f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.734864f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.930506f ?
                                        0.00446776f :
                                        -0.044263452f) :
                                0.07627356f) :
                        (data[2 /* PSA */] < 20.26579f ?
                                -0.06648259f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                        0.013914003f :
                                        -0.03680726f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_71 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_71_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_71_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.400585f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.724228f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.9212f ?
                                        -2.878226E-4f :
                                        -0.04692048f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.088594f ?
                                        0.0749137f :
                                        -0.0074982843f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (data[0 /* AGE */] < 62.5f ?
                                        -0.05100734f :
                                        0.017016547f) :
                                -0.08173651f)) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 65.5f ?
                                0.050784808f :
                                -0.056862228f) :
                        0.042701457f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_72 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_72_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_72_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 73.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 22.489649f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.069056f ?
                                (data[0 /* AGE */] < 63.5f ?
                                        0.013709942f :
                                        -0.011280412f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        -0.10468446f :
                                        0.04953127f)) :
                        (data[2 /* PSA */] < 27.526031f ?
                                0.05632264f :
                                (data[0 /* AGE */] < 64.5f ?
                                        -0.046621565f :
                                        0.050638374f))) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 19.63086f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 75.5f ?
                                (data[2 /* PSA */] < 7.6539063f ?
                                        0.062680565f :
                                        0.057882342f) :
                                -0.024995938f) :
                        -0.037621025f));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_73 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_73_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_73_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.41582f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.942963f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.340278f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.634006f ?
                                        0.003794918f :
                                        -0.04906719f) :
                                0.054874547f) :
                        (data[0 /* AGE */] < 65.5f ?
                                0.038677167f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.599218f ?
                                        -0.12747383f :
                                        -0.020279502f))) :
                (data[2 /* PSA */] < 16.890656f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                (data[0 /* AGE */] < 62.5f ?
                                        0.042774145f :
                                        -0.04868132f) :
                                0.10854211f) :
                        (data[2 /* PSA */] < 23.127068f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.10235f ?
                                        -0.006932513f :
                                        -0.07673923f) :
                                (data[2 /* PSA */] < 27.680698f ?
                                        0.04725458f :
                                        -0.0030296992f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_74 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_74_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_74_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 6.6301756f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.055267f ?
                        (data[0 /* AGE */] < 57.5f ?
                                -0.07876142f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.4433594f ?
                                        0.0014354012f :
                                        0.08243933f)) :
                        -0.08346613f) :
                (data[2 /* PSA */] < 7.1499796f ?
                        0.05189566f :
                        (data[0 /* AGE */] < 60.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 58.5f ?
                                        -8.985059E-4f :
                                        0.13657491f) :
                                (data[0 /* AGE */] < 65.5f ?
                                        -0.034443803f :
                                        0.0054342435f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_75 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_75_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_75_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 51.213673f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 76.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.475195f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 73.5f ?
                                        -0.0017928048f :
                                        0.035250634f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                        7.554432E-4f :
                                        -0.090681106f)) :
                        -0.04075452f) :
                (data[2 /* PSA */] < 64.08913f ?
                        0.09074838f :
                        -0.045591258f));
        return pred;
    } // constant pool size = 26B, number of visited nodes = 6, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_76 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_76_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_76_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.41582f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.942963f ?
                        (data[0 /* AGE */] < 55.5f ?
                                0.049699508f :
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.083504245f :
                                        0.0014123787f)) :
                        (data[0 /* AGE */] < 65.5f ?
                                0.032204404f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.599218f ?
                                        -0.124329865f :
                                        -0.019119672f))) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                        (data[0 /* AGE */] < 60.5f ?
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.031646743f :
                                        0.07983753f) :
                                (data[2 /* PSA */] < 23.11797f ?
                                        -0.043343436f :
                                        -0.0030167403f)) :
                        (data[2 /* PSA */] < 15.48125f ?
                                0.07205403f :
                                (data[0 /* AGE */] < 69.5f ?
                                        0.036607083f :
                                        -0.009395409f))));
        return pred;
    } // constant pool size = 50B, number of visited nodes = 12, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_77 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_77_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_77_class_0 {
    static final double score0(double[] data) {
        double pred = (data[0 /* AGE */] < 53.5f ?
                -0.030043483f :
                (data[0 /* AGE */] < 55.5f ?
                        0.027741427f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 52.847267f ?
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.05893296f :
                                        -3.890769E-4f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 71.16776f ?
                                        0.043213695f :
                                        0.10563283f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_78 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_78_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_78_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 24.484766f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.825553f ?
                                        -0.00358243f :
                                        0.05089584f) :
                                -0.059085637f) :
                        -0.049951475f) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.034610316f :
                                        0.015279621f) :
                                -0.07396f) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 19.672579f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 10.669682f ?
                                        0.016338617f :
                                        0.07432339f) :
                                -0.020459197f)));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_79 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_79_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_79_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 7.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.400585f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 14.724228f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 12.9212f ?
                                        -4.3276802E-4f :
                                        -0.047611557f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 18.088594f ?
                                        0.06849501f :
                                        -0.0016056196f)) :
                        (data[2 /* PSA */] < 25.838062f ?
                                -0.05535442f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        0.015194304f :
                                        -0.019851483f))) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 65.5f ?
                                0.051644146f :
                                -0.05505356f) :
                        0.04182511f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_80 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_80_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_80_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.2949219f ?
                (data[0 /* AGE */] < 65.5f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 60.5f ?
                                -0.078786075f :
                                0.18316309f) :
                        (data[2 /* PSA */] < 1.8009765f ?
                                0.036146626f :
                                -0.13184902f)) :
                (data[2 /* PSA */] < 4.893419f ?
                        (data[2 /* PSA */] < 3.7512612f ?
                                0.09058302f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.550105f ?
                                        -0.048526943f :
                                        0.074892595f)) :
                        (data[2 /* PSA */] < 5.946595f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        -0.0038015703f :
                                        -0.087505706f) :
                                (data[0 /* AGE */] < 60.5f ?
                                        0.02936915f :
                                        -0.0028397816f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_81 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_81_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_81_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.025f ?
                                        0.0060132802f :
                                        -0.029734112f) :
                                (data[0 /* AGE */] < 56.5f ?
                                        -0.03558884f :
                                        0.024755593f)) :
                        -0.059515033f) :
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 17.452734f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 13.767576f ?
                                (data[0 /* AGE */] < 68.5f ?
                                        0.045910742f :
                                        -0.0032542676f) :
                                -0.06330795f) :
                        (data[2 /* PSA */] < 24.320038f ?
                                0.095276274f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 50.797527f ?
                                        -0.0334427f :
                                        0.09526078f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_82 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_82_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_82_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9494139f ?
                        (data[2 /* PSA */] < 1.3502128f ?
                                -0.10841644f :
                                0.030188452f) :
                        -0.061782297f) :
                (data[2 /* PSA */] < 3.688165f ?
                        0.051528465f :
                        (data[2 /* PSA */] < 4.219461f ?
                                -0.036919326f :
                                (data[0 /* AGE */] < 63.5f ?
                                        0.012763706f :
                                        -0.004858101f))));
        return pred;
    } // constant pool size = 26B, number of visited nodes = 6, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_83 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_83_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_83_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 67.5f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                        (Double.isNaN(data[3]) || data[3 /* GLEASON */] < 6.5f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.025f ?
                                        0.0052611353f :
                                        -0.027713237f) :
                                (data[2 /* PSA */] < 8.1125f ?
                                        0.040069055f :
                                        0.0016004386f)) :
                        -0.054070227f) :
                (data[2 /* PSA */] < 5.473047f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 3.7554336f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 2.5541306f ?
                                        -0.011964383f :
                                        0.0967805f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.8539524f ?
                                        -0.03189313f :
                                        -0.12648444f)) :
                        (data[2 /* PSA */] < 6.399039f ?
                                0.080357686f :
                                (data[0 /* AGE */] < 70.5f ?
                                        0.036593825f :
                                        -0.021299262f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_84 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_84_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_84_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.975586f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 3.5484426f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.019745149f :
                                        0.14619455f) :
                                -0.123294696f) :
                        -0.061495855f) :
                (data[2 /* PSA */] < 4.7708464f ?
                        0.048847903f :
                        (data[0 /* AGE */] < 60.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 58.5f ?
                                        -0.005173936f :
                                        0.1247394f) :
                                (data[0 /* AGE */] < 65.5f ?
                                        -0.032634f :
                                        0.006781628f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_85 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_85_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_85_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (data[0 /* AGE */] < 63.5f ?
                                0.10526704f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.11628684f :
                                        0.05479272f)) :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 65.5f ?
                                        -0.10769309f :
                                        0.040836576f) :
                                -0.043672785f)) :
                (data[2 /* PSA */] < 7.3789062f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.0516114f ?
                                (data[0 /* AGE */] < 61.5f ?
                                        -0.032395218f :
                                        0.018845685f) :
                                (data[2 /* PSA */] < 6.5977817f ?
                                        -0.06959515f :
                                        -0.011477686f)) :
                        (data[2 /* PSA */] < 8.412664f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 7.9498453f ?
                                        0.06441736f :
                                        0.01104619f) :
                                (data[0 /* AGE */] < 55.5f ?
                                        -0.047154173f :
                                        0.004172358f))));
        return pred;
    } // constant pool size = 54B, number of visited nodes = 13, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_86 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_86_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_86_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (data[0 /* AGE */] < 61.5f ?
                        -0.11202813f :
                        (data[0 /* AGE */] < 66.5f ?
                                0.0473127f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.7941406f ?
                                        0.027557105f :
                                        -0.12032929f))) :
                (data[2 /* PSA */] < 3.688165f ?
                        0.043180797f :
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (data[2 /* PSA */] < 5.825f ?
                                        -0.036904443f :
                                        0.002804191f) :
                                (data[2 /* PSA */] < 6.8875f ?
                                        0.05405838f :
                                        0.0020542957f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_87 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_87_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_87_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.975586f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 3.5484426f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.01694192f :
                                        0.12070939f) :
                                -0.12187708f) :
                        -0.056683697f) :
                (data[2 /* PSA */] < 4.7708464f ?
                        0.044352215f :
                        (data[0 /* AGE */] < 60.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 58.5f ?
                                        -0.0024779465f :
                                        0.118542016f) :
                                (data[0 /* AGE */] < 65.5f ?
                                        -0.02974348f :
                                        0.0056321328f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_88 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_88_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_88_class_0 {
    static final double score0(double[] data) {
        double pred = (data[3 /* GLEASON */] < 5.5f ?
                (data[2 /* PSA */] < 6.834375f ?
                        (data[0 /* AGE */] < 63.5f ?
                                0.094827585f :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.11483978f :
                                        0.046857692f)) :
                        (data[2 /* PSA */] < 9.1133175f ?
                                -0.058433443f :
                                (data[0 /* AGE */] < 68.0f ?
                                        -0.10385984f :
                                        0.010739818f))) :
                (data[0 /* AGE */] < 55.5f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.467969f ?
                                0.083615236f :
                                -0.042547118f) :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 11.190625f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.829297f ?
                                        -3.6837155E-4f :
                                        -0.086393595f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 71.5f ?
                                        -0.0017623483f :
                                        0.06891524f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_89 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_89_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_89_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (data[0 /* AGE */] < 65.5f ?
                        (data[2 /* PSA */] < 1.5988281f ?
                                -0.11479815f :
                                0.067083396f) :
                        (data[2 /* PSA */] < 1.7990234f ?
                                0.021003006f :
                                -0.12980837f)) :
                (data[2 /* PSA */] < 3.688165f ?
                        0.040969986f :
                        (data[0 /* AGE */] < 63.5f ?
                                (Double.isNaN(data[1]) || data[1 /* RACE */] < 1.5f ?
                                        0.014908665f :
                                        -0.037399236f) :
                                (data[0 /* AGE */] < 64.5f ?
                                        -0.08168272f :
                                        6.0001074E-4f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_90 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_90_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_90_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 6.6301756f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 6.055267f ?
                        (data[0 /* AGE */] < 61.5f ?
                                (data[2 /* PSA */] < 3.15f ?
                                        0.020397715f :
                                        -0.06406969f) :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 5.4433594f ?
                                        0.0020484808f :
                                        0.086001694f)) :
                        -0.074221164f) :
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 70.5f ?
                        (data[2 /* PSA */] < 9.817187f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        0.0018151443f :
                                        0.11357821f) :
                                (data[0 /* AGE */] < 54.5f ?
                                        -0.06711087f :
                                        0.005021551f)) :
                        (data[0 /* AGE */] < 71.5f ?
                                -0.07638944f :
                                (data[2 /* PSA */] < 11.282031f ?
                                        -0.03929327f :
                                        0.04173948f))));
        return pred;
    } // constant pool size = 46B, number of visited nodes = 11, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_91 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_91_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_91_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.2949219f ?
                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                        (data[0 /* AGE */] < 60.5f ?
                                -0.078135006f :
                                (data[0 /* AGE */] < 65.5f ?
                                        0.13894507f :
                                        -0.025651207f)) :
                        -0.12013783f) :
                (data[2 /* PSA */] < 4.893419f ?
                        (data[2 /* PSA */] < 3.7512612f ?
                                0.07181475f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 4.550105f ?
                                        -0.043181673f :
                                        0.06689788f)) :
                        (data[2 /* PSA */] < 5.946595f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 68.5f ?
                                        0.0014519022f :
                                        -0.086061426f) :
                                (data[0 /* AGE */] < 60.5f ?
                                        0.026148295f :
                                        -0.0019915174f))));
        return pred;
    } // constant pool size = 42B, number of visited nodes = 10, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_92 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_92_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_92_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 23.238379f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.110306f ?
                        (data[0 /* AGE */] < 55.5f ?
                                (data[0 /* AGE */] < 53.5f ?
                                        -0.021940272f :
                                        0.07466247f) :
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.0622788f :
                                        -2.5444265E-4f)) :
                        -0.06979839f) :
                (data[2 /* PSA */] < 27.560196f ?
                        0.052559964f :
                        (data[2 /* PSA */] < 34.130886f ?
                                -0.06709511f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 61.347923f ?
                                        0.045860454f :
                                        -0.034746088f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_93 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_93_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_93_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 46.846252f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.846012f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 26.870768f ?
                                        -6.154267E-5f :
                                        -0.05302028f) :
                                0.06380244f) :
                        -0.029013423f) :
                0.10760349f);
        return pred;
    } // constant pool size = 18B, number of visited nodes = 4, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_94 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_94_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_94_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 1.3890625f ?
                -0.10957968f :
                (data[2 /* PSA */] < 2.4696167f ?
                        (data[0 /* AGE */] < 65.5f ?
                                0.049505882f :
                                0.006560464f) :
                        (data[2 /* PSA */] < 3.005673f ?
                                -0.049123004f :
                                (data[0 /* AGE */] < 59.5f ?
                                        0.013721936f :
                                        -0.0019957724f))));
        return pred;
    } // constant pool size = 22B, number of visited nodes = 5, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_95 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_95_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_95_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 3.975586f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 3.5484426f ?
                        (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 69.5f ?
                                        -0.01667338f :
                                        0.10645213f) :
                                -0.11816682f) :
                        -0.053933363f) :
                (data[2 /* PSA */] < 4.7708464f ?
                        0.041016918f :
                        (data[0 /* AGE */] < 60.5f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 58.5f ?
                                        -0.0031539102f :
                                        0.10879254f) :
                                (data[0 /* AGE */] < 65.5f ?
                                        -0.024836747f :
                                        0.00448985f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_96 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_96_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_96_class_0 {
    static final double score0(double[] data) {
        double pred = (data[2 /* PSA */] < 2.8865235f ?
                (data[0 /* AGE */] < 61.5f ?
                        -0.11097671f :
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 1.9503906f ?
                                0.019971846f :
                                -0.04201066f)) :
                (data[2 /* PSA */] < 3.4209511f ?
                        0.043589666f :
                        (data[2 /* PSA */] < 3.9532912f ?
                                -0.05038966f :
                                (data[0 /* AGE */] < 63.5f ?
                                        0.012378421f :
                                        -0.0031020928f))));
        return pred;
    } // constant pool size = 26B, number of visited nodes = 6, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_97 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_97_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_97_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 66.86894f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 46.846252f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 32.846012f ?
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 24.455244f ?
                                        4.0150638E-4f :
                                        -0.031649675f) :
                                0.0597231f) :
                        -0.026503563f) :
                0.106937945f);
        return pred;
    } // constant pool size = 18B, number of visited nodes = 4, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_98 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_98_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_98_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[2]) || data[2 /* PSA */] < 23.238379f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 21.110306f ?
                        (data[0 /* AGE */] < 55.5f ?
                                (data[0 /* AGE */] < 53.5f ?
                                        -0.02070631f :
                                        0.0669927f) :
                                (data[0 /* AGE */] < 57.5f ?
                                        -0.058736287f :
                                        -1.2327237E-4f)) :
                        -0.06329367f) :
                (data[2 /* PSA */] < 27.560196f ?
                        0.050616413f :
                        (data[2 /* PSA */] < 34.130886f ?
                                -0.05473764f :
                                (Double.isNaN(data[2]) || data[2 /* PSA */] < 61.347923f ?
                                        0.03967288f :
                                        -0.03523004f))));
        return pred;
    } // constant pool size = 34B, number of visited nodes = 8, static init size = 0B
}


class GBM_model_R_1536024753790_103_Forest_99 {
    public static void score0(double[] fdata, double[] preds) {
        preds[1] += GBM_model_R_1536024753790_103_Tree_99_class_0.score0(fdata);
    }
}

class GBM_model_R_1536024753790_103_Tree_99_class_0 {
    static final double score0(double[] data) {
        double pred = (Double.isNaN(data[0]) || data[0 /* AGE */] < 75.5f ?
                (Double.isNaN(data[2]) || data[2 /* PSA */] < 9.829297f ?
                        (Double.isNaN(data[2]) || data[2 /* PSA */] < 8.154225f ?
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 72.5f ?
                                        -0.0048681856f :
                                        0.037843503f) :
                                (Double.isNaN(data[0]) || data[0 /* AGE */] < 66.5f ?
                                        -0.028442157f :
                                        0.11445072f)) :
                        (data[2 /* PSA */] < 12.365834f ?
                                (data[0 /* AGE */] < 65.5f ?
                                        0.026117174f :
                                        -0.06884861f) :
                                (data[2 /* PSA */] < 13.360632f ?
                                        0.03852595f :
                                        -0.0010864382f))) :
                (data[2 /* PSA */] < 8.331836f ?
                        -0.022694308f :
                        -0.0070866556f));
        return pred;
    } // constant pool size = 38B, number of visited nodes = 9, static init size = 0B
}
