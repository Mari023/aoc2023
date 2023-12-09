package year2023.day08;

public class Input {
    public static final String[] INPUT = """
            LRLRRRLRRLRRRLRRRLLLLLRRRLRLRRLRLRLRRLRRLRRRLRLRLRRLLRLRRLRRLRRLRRRLLRRRLRRRLRRLRLLLRRLRRRLRLRRLRRRLRRLRLLLRRRLRRLRRLRRRLRRRLRRRLRLRLRLRRRLRRRLLLRRLLRRRLRLRLRRRLRRRLRRLRRRLRLRLLRRRLRLRRLRLRLRRLLLRRRLRRRLRRLRRLRLRRLLRRLRRRLRRRLLRRRLRRLRLLRRLRLRRLLRRRLLLLRRLRRRLRLRRLLRLLRRRLLRRLLRRRLRRRLRRLLRLRLLRRLLRLLLRRRR

            FCG = (PLG, GXC)
            PQT = (SQK, GHP)
            NVS = (TPQ, PPB)
            CTR = (SXS, KCV)
            FNM = (KHG, FLD)
            TFH = (CLD, CLD)
            MLQ = (QQL, JVK)
            LQR = (TFH, RRM)
            QKX = (VPR, BHD)
            QQL = (VBD, CPM)
            QST = (HPC, DFJ)
            QBX = (HPH, BTM)
            TVB = (SHJ, GMF)
            HJN = (CGJ, QXT)
            PGV = (RXT, DQP)
            TPN = (TQR, LJR)
            BHV = (TGL, GJH)
            DDF = (XLH, TDQ)
            XMK = (XVN, RJP)
            HXH = (JVM, CVB)
            SFX = (VNH, BFS)
            TRF = (HVJ, DKF)
            GGQ = (NNP, PBL)
            KQX = (VXK, FSF)
            KGL = (QSJ, CBM)
            CLC = (MCJ, JGQ)
            GFF = (JBG, TVR)
            FQT = (CMR, CKG)
            HVJ = (FXB, GBP)
            KTF = (PKG, JCL)
            BLF = (QQL, JVK)
            TVN = (QNN, DPQ)
            KVX = (XNV, CJF)
            GDK = (DVX, RKS)
            CHS = (VCL, PSG)
            LFS = (SNS, NTG)
            NCR = (LFV, DRN)
            NLJ = (RCR, XCF)
            SRD = (LGT, PRS)
            FQC = (GBX, RGQ)
            SJH = (CKG, CMR)
            BQP = (PPP, HGT)
            LJR = (FPV, FQD)
            XTP = (PDT, MTX)
            RDG = (JRL, MFF)
            TFF = (MJQ, MVB)
            NGS = (BDG, KHS)
            GXT = (QSJ, CBM)
            VVD = (HJJ, RNK)
            FRL = (CHS, JNV)
            RQS = (CFM, SKM)
            PRS = (VTG, PRR)
            FCD = (VTN, DJQ)
            PDT = (DST, DST)
            MND = (MFV, GDR)
            GJG = (TMJ, HPJ)
            JSL = (DDN, JPZ)
            DNX = (RHD, LKM)
            BGM = (GFC, JTD)
            BPC = (BMN, BKQ)
            PPB = (BFT, PVH)
            VRK = (TCL, JDS)
            MBT = (CBB, JMM)
            JGQ = (GGQ, DFH)
            BGP = (MGH, VHG)
            GGR = (TCX, QLG)
            NCD = (XDT, SSK)
            TDQ = (VPK, HCF)
            PND = (BKV, THD)
            RJP = (KRV, FQN)
            MFZ = (MRL, MFK)
            TCM = (RMM, CLB)
            SDF = (LTS, RVQ)
            KGS = (CTR, SJQ)
            SFK = (SDF, HPF)
            DJC = (MKF, PNR)
            DPF = (KBH, QQX)
            VQJ = (FVB, XPK)
            CGX = (MLQ, BLF)
            GBS = (DJC, XXQ)
            JSV = (RMR, QFK)
            KHS = (HSQ, PTD)
            MKG = (NLJ, MHQ)
            CXQ = (BDG, KHS)
            RRQ = (FCT, CDT)
            JSK = (LBC, CPT)
            VSM = (RGM, VMR)
            NNP = (SRD, VNQ)
            PRR = (GMX, KQX)
            HNP = (GQJ, DGS)
            PKB = (KBL, HXJ)
            MFS = (RMK, JBX)
            RMM = (MFG, BPS)
            PJM = (SFK, HLG)
            BCH = (SRK, LSG)
            VNQ = (LGT, PRS)
            LTC = (TJX, DQD)
            CKG = (NJG, GMJ)
            RPS = (RXT, DQP)
            CCV = (DPB, JQT)
            JDF = (CFF, XFB)
            LQX = (KBD, TVD)
            VLL = (FMK, LCD)
            RTB = (NTG, SNS)
            FBF = (QTH, QFV)
            CBB = (VJK, BHB)
            BCL = (LJR, TQR)
            JDS = (SPS, HRL)
            HHB = (RHD, LKM)
            PLG = (RBV, NJD)
            RNB = (VMR, RGM)
            CJT = (HJJ, RNK)
            JVK = (VBD, CPM)
            HXJ = (JTL, PFD)
            JGX = (XMV, RHF)
            FGT = (LFR, JSK)
            MJQ = (BVP, BXM)
            DFJ = (MRS, LTC)
            GNG = (DPB, JQT)
            VCA = (XFL, JSV)
            KLR = (LTN, BXH)
            VGN = (DGS, GQJ)
            DVX = (JXX, XSH)
            BTN = (PFP, FRL)
            DTM = (DVD, FCF)
            SVN = (PBF, GXR)
            RCC = (BTB, CBD)
            GMJ = (FCH, CSP)
            DVS = (FSV, TVP)
            RLG = (QML, XGD)
            CVV = (HHB, DNX)
            NRG = (NFG, DNL)
            PQC = (RNG, KTF)
            KGG = (DMD, HQG)
            JNV = (PSG, VCL)
            SNS = (CGX, MBK)
            FRA = (MFK, MRL)
            BPN = (QQX, KBH)
            HCQ = (XMK, JDV)
            RDD = (JGB, VHQ)
            HTF = (VLX, RQV)
            XFH = (DPH, RGG)
            LBC = (JTV, DTK)
            RBP = (LLL, MND)
            GDV = (SHJ, GMF)
            MJV = (JGV, JGV)
            BQR = (FPK, HSS)
            XDT = (BTN, FXF)
            NGM = (NTF, BDN)
            HPP = (FQX, FGT)
            JPC = (JHC, PPH)
            GCV = (CCS, TCM)
            VHQ = (PBR, GVP)
            MDD = (GGR, LXC)
            HSQ = (CKV, KGS)
            PPP = (DLP, HPP)
            SNA = (BKK, FNM)
            VLS = (DPH, RGG)
            JGB = (PBR, GVP)
            FPK = (RGS, XKQ)
            LVB = (XMC, MNX)
            FDP = (PFR, GFP)
            NKS = (PCH, TJR)
            VLX = (TLH, KFD)
            DLT = (HGV, XJR)
            MBK = (MLQ, BLF)
            RNG = (PKG, PKG)
            BKV = (DXB, GDQ)
            LLL = (GDR, MFV)
            LNN = (MVG, CKJ)
            FXH = (TCM, CCS)
            TPQ = (BFT, PVH)
            MRH = (CJR, TFF)
            MVG = (BQP, DXC)
            LLN = (VTN, DJQ)
            MLS = (THD, BKV)
            HFR = (HNP, VGN)
            XNF = (PVL, TPD)
            JQT = (DVS, PST)
            LNH = (FHQ, SPG)
            MBR = (LQR, VPM)
            KNV = (SKG, CKF)
            JCV = (XMV, RHF)
            JQJ = (TCQ, BGM)
            SQF = (NRG, HDK)
            FHF = (NNQ, PKB)
            BDG = (HSQ, PTD)
            PBT = (JRL, MFF)
            LNS = (TCQ, BGM)
            PTD = (CKV, KGS)
            LHX = (GRM, XJQ)
            NXN = (SFX, NQC)
            VSZ = (XFS, DHL)
            DPG = (JTS, VBG)
            QTH = (DLT, JNS)
            PMG = (TCL, JDS)
            CCD = (FCG, GPJ)
            SSP = (HTF, MNV)
            STX = (HPC, DFJ)
            KSR = (GKB, TSX)
            KDP = (XGR, LLK)
            NNQ = (HXJ, KBL)
            TPM = (PDT, PDT)
            SJQ = (KCV, SXS)
            PJH = (BPN, DPF)
            JBG = (FPN, XBP)
            XQQ = (TLR, TLR)
            XJL = (FTX, DXR)
            RXT = (RMD, KVX)
            CLD = (NTK, NTK)
            SDM = (MRH, TGC)
            RQV = (TLH, KFD)
            NDL = (VDT, VDT)
            CCT = (QFV, QTH)
            LXL = (VGH, FRM)
            TJR = (KGL, GXT)
            VBD = (RSG, NCR)
            XBG = (BHV, NPX)
            JTS = (QDH, CST)
            BFT = (JDF, MXT)
            XLH = (HCF, VPK)
            XBP = (GCV, FXH)
            JPF = (RNG, KTF)
            HHN = (TMJ, HPJ)
            FSV = (GMC, HJN)
            XFB = (JRN, RDD)
            JPZ = (FNM, BKK)
            BBP = (KDP, KKM)
            TGL = (TGX, XRF)
            JCL = (JDT, JDP)
            RRS = (XPK, FVB)
            NSB = (MCJ, JGQ)
            DMD = (GFG, FDP)
            FFX = (VBG, JTS)
            XRF = (XFH, VLS)
            LSG = (MFX, CVC)
            BJZ = (FNK, QKX)
            DLP = (FGT, FQX)
            JDV = (RJP, XVN)
            HDK = (DNL, NFG)
            GQP = (NQC, SFX)
            NFG = (PMG, VRK)
            CSP = (GDP, NDV)
            BKK = (FLD, KHG)
            SCK = (KKM, KDP)
            DXR = (SCK, BBP)
            JVG = (PBT, RDG)
            GSV = (QTK, JNT)
            QXT = (BPC, NXQ)
            GDQ = (LFJ, KSF)
            NHG = (VVD, CJT)
            DHL = (LNH, RPP)
            NFS = (JGV, MFZ)
            FCS = (BTB, CBD)
            JGH = (VHP, RMG)
            VQC = (GDC, VKQ)
            PCH = (KGL, GXT)
            LGT = (PRR, VTG)
            PFV = (QCC, VSZ)
            QQX = (FTV, LBD)
            QFV = (JNS, DLT)
            SCN = (RVX, RBP)
            QRH = (BCL, TPN)
            GBX = (VRH, CPG)
            NTF = (RBK, RRN)
            NDQ = (MBR, RDL)
            KCP = (GFF, DDG)
            JBX = (JPF, PQC)
            GMF = (KLR, VTD)
            JVM = (TXL, XTR)
            BLC = (MNJ, VFF)
            VTH = (TGC, MRH)
            JHB = (BPN, DPF)
            TMJ = (PND, MLS)
            PFH = (HSS, FPK)
            TDG = (KJV, QTR)
            TGC = (TFF, CJR)
            TVD = (CCT, FBF)
            TKX = (FCT, CDT)
            BKS = (HLG, SFK)
            CGJ = (NXQ, BPC)
            QHN = (SKG, CKF)
            CVJ = (DMD, HQG)
            BMN = (JLD, NHG)
            GRP = (NDL, NDL)
            FTX = (BBP, SCK)
            DXC = (PPP, HGT)
            NJD = (XSP, KSC)
            CST = (RRQ, TKX)
            SVH = (JHC, PPH)
            JTV = (GCM, RLG)
            BXJ = (DVD, FCF)
            HCV = (XDT, SSK)
            RDL = (LQR, VPM)
            PSG = (MFS, MFC)
            MVQ = (DRH, QBX)
            XCF = (FVM, VVS)
            DXB = (KSF, LFJ)
            GHN = (JGH, FGR)
            KLJ = (LSL, QJJ)
            DFH = (NNP, PBL)
            CDL = (XBG, FGD)
            VFF = (KGR, FCJ)
            KBD = (FBF, CCT)
            NJL = (JGH, FGR)
            VHG = (MBT, XPT)
            GKB = (GJB, JKK)
            KQP = (CXQ, NGS)
            VSX = (GDC, VKQ)
            RHX = (CDL, RGD)
            NTK = (QCC, QCC)
            KFD = (SKK, HGC)
            ZZZ = (VFF, MNJ)
            JLK = (HPL, MDF)
            BTB = (PFT, CCD)
            HQG = (GFG, FDP)
            FVM = (VHC, NGC)
            CVD = (NQP, FXM)
            VGH = (CCV, GNG)
            LSV = (NLJ, MHQ)
            PVX = (KGG, CVJ)
            THL = (NJL, GHN)
            KKM = (XGR, LLK)
            XGR = (LRT, DFP)
            RRN = (TPM, XTP)
            GBP = (GTD, QSL)
            KJV = (MDD, QKK)
            TBN = (TLV, JLK)
            LDG = (TPN, BCL)
            JLD = (CJT, VVD)
            DKN = (CXQ, NGS)
            DGV = (HCV, NCD)
            HRL = (QHN, KNV)
            RRM = (CLD, TQC)
            RJS = (MGH, VHG)
            MFF = (QTV, GJF)
            PNR = (BTT, TVN)
            JKK = (RVV, XPG)
            XKQ = (PQT, FJD)
            RMK = (JPF, PQC)
            LCD = (RJS, BGP)
            QTK = (GJG, HHN)
            TBK = (CVB, JVM)
            VTG = (GMX, KQX)
            GFG = (PFR, GFP)
            RSG = (LFV, LFV)
            VCS = (PCH, TJR)
            LJC = (QXF, XQR)
            QHD = (XFM, LQM)
            TSD = (PPB, TPQ)
            RHP = (MXX, MTC)
            GLZ = (JSV, XFL)
            NXD = (VQJ, RRS)
            MTJ = (QJJ, LSL)
            XQH = (NQP, FXM)
            GLK = (XCX, NDQ)
            LSL = (NVS, TSD)
            QGC = (LHX, LHT)
            RHF = (GHM, TBT)
            TQR = (FQD, FPV)
            QSC = (XCX, NDQ)
            RKS = (JXX, XSH)
            HGC = (DCG, GDD)
            XNV = (VQG, PVR)
            CCS = (RMM, CLB)
            RVR = (SJH, FQT)
            JCM = (BKS, PJM)
            GHM = (FCS, RCC)
            PFT = (FCG, GPJ)
            XDJ = (DTS, JVG)
            RVQ = (FQC, PLV)
            LQM = (RMH, XDJ)
            CKV = (SJQ, CTR)
            HPH = (TLX, RQG)
            MTC = (FFX, DPG)
            CKJ = (BQP, DXC)
            MXT = (CFF, XFB)
            VHT = (MQG, GTH)
            QJJ = (TSD, NVS)
            HNA = (DHL, XFS)
            PVS = (TDG, SLR)
            FPV = (GMD, GTK)
            DDG = (TVR, JBG)
            BHD = (LLN, FCD)
            LDF = (NNQ, PKB)
            CKF = (XXD, MJL)
            TJF = (NRG, HDK)
            JDT = (BLC, BLC)
            GXR = (MGP, FNX)
            BPS = (XNF, MXR)
            FXB = (QSL, GTD)
            TLH = (HGC, SKK)
            PKV = (NCD, HCV)
            CBM = (NXD, GTR)
            JNT = (GJG, HHN)
            TCQ = (JTD, GFC)
            MRS = (TJX, DQD)
            FBP = (VGN, HNP)
            HPC = (MRS, LTC)
            TJX = (PKV, DGV)
            LFV = (MJV, MJV)
            XVM = (SQF, TJF)
            VVF = (PGV, RPS)
            XPG = (DGF, DJK)
            RGD = (XBG, FGD)
            GMC = (QXT, CGJ)
            CFM = (VVF, QPN)
            SPS = (QHN, KNV)
            JTL = (MNM, PTS)
            MNM = (SXH, BDT)
            RGG = (LNS, JQJ)
            FPN = (GCV, FXH)
            XJR = (KCP, HJS)
            FQN = (LQX, MVF)
            CFF = (JRN, RDD)
            KSC = (QGH, LPG)
            BHB = (DMR, JTX)
            TBT = (RCC, FCS)
            SKM = (VVF, QPN)
            PVR = (PVS, PQQ)
            QDN = (XMK, JDV)
            JXX = (STX, QST)
            TXL = (LKK, NSD)
            XTR = (NSD, LKK)
            VKQ = (HXH, TBK)
            FQX = (JSK, LFR)
            FRM = (CCV, GNG)
            AAA = (MNJ, VFF)
            BKQ = (NHG, JLD)
            DPQ = (MGT, LXL)
            KXL = (VQC, VSX)
            RVV = (DGF, DGF)
            TQC = (NTK, PFV)
            NPX = (GJH, TGL)
            MGH = (XPT, MBT)
            VMR = (HGG, RHX)
            DCG = (CLF, GBS)
            CVB = (TXL, XTR)
            HPJ = (MLS, PND)
            NNR = (GDV, TVB)
            RVX = (MND, LLL)
            BVL = (SKM, CFM)
            RFS = (XQR, QXF)
            TVR = (XBP, FPN)
            VTD = (LTN, BXH)
            GPC = (XHK, BMP)
            QGH = (RNB, VSM)
            GDR = (PJH, JHB)
            RMG = (KXL, TBV)
            PST = (TVP, FSV)
            GPJ = (GXC, PLG)
            LBD = (KTN, GVD)
            LLK = (LRT, DFP)
            KGR = (MVQ, LKQ)
            MQG = (XJL, NHN)
            QXF = (NSH, STD)
            GMD = (PFH, BQR)
            BFS = (KGN, QHD)
            RCR = (FVM, VVS)
            RPP = (SPG, FHQ)
            FMK = (BGP, RJS)
            FGR = (RMG, VHP)
            SXH = (RTB, LFS)
            GVD = (GRP, TCF)
            TGX = (XFH, VLS)
            JTD = (NCJ, TBN)
            MFV = (PJH, JHB)
            HGV = (KCP, HJS)
            HSS = (XKQ, RGS)
            PTS = (BDT, SXH)
            XSP = (LPG, QGH)
            TCX = (PVX, XVF)
            LKQ = (QBX, DRH)
            FSF = (LSV, MKG)
            XJQ = (RHP, NXM)
            NHN = (FTX, DXR)
            GQJ = (KQP, DKN)
            TLX = (XQH, CVD)
            HJJ = (VCS, NKS)
            GTR = (VQJ, RRS)
            RHD = (FJR, RVR)
            VXK = (LSV, MKG)
            MNX = (HBT, CLM)
            PPH = (LVB, MRB)
            GDP = (LCB, GDK)
            DJQ = (BVL, RQS)
            FCJ = (MVQ, LKQ)
            VHC = (VHT, BSP)
            PVL = (PPR, SSP)
            LCB = (DVX, RKS)
            PFD = (MNM, PTS)
            MVF = (KBD, TVD)
            DJK = (XQQ, TVF)
            QSL = (GSV, KCF)
            NXM = (MXX, MTC)
            TJT = (CKJ, MVG)
            GTH = (NHN, XJL)
            SQK = (SPP, JCM)
            DPH = (LNS, JQJ)
            QPN = (RPS, PGV)
            SRK = (MFX, CVC)
            RFJ = (GKB, TSX)
            QLG = (XVF, PVX)
            QTV = (HLR, VLL)
            PLV = (GBX, RGQ)
            GHR = (SVH, JPC)
            XMV = (GHM, TBT)
            PKG = (JDT, JDT)
            MGP = (RPG, QGC)
            QDH = (TKX, RRQ)
            HJR = (RBP, RVX)
            NDV = (LCB, GDK)
            KRV = (MVF, LQX)
            NTM = (TJF, SQF)
            NXQ = (BKQ, BMN)
            HFF = (VDT, JSL)
            SLR = (QTR, KJV)
            DDN = (BKK, FNM)
            LHT = (XJQ, GRM)
            DST = (QKX, FNK)
            PPR = (MNV, HTF)
            JHC = (LVB, MRB)
            MXX = (DPG, FFX)
            VDT = (DDN, DDN)
            XMC = (HBT, CLM)
            TPD = (SSP, PPR)
            BSP = (GTH, MQG)
            NJG = (FCH, CSP)
            MGT = (VGH, FRM)
            NCJ = (TLV, JLK)
            VCN = (NSB, CLC)
            CBD = (CCD, PFT)
            NQB = (XHK, BMP)
            MFG = (XNF, MXR)
            XFL = (RMR, QFK)
            KCF = (JNT, QTK)
            JTX = (MKB, NGM)
            NTG = (MBK, CGX)
            XCX = (MBR, RDL)
            HGT = (HPP, DLP)
            FJD = (GHP, SQK)
            FXF = (PFP, FRL)
            GFC = (TBN, NCJ)
            NSD = (HFR, FBP)
            HJS = (DDG, GFF)
            MNV = (RQV, VLX)
            VRH = (MTJ, KLJ)
            GJH = (XRF, TGX)
            JMM = (BHB, VJK)
            BDN = (RBK, RRN)
            JDP = (BLC, ZZZ)
            GJK = (HHB, DNX)
            TCF = (NDL, HFF)
            JGV = (MFK, MRL)
            LPG = (VSM, RNB)
            KBH = (FTV, LBD)
            CDT = (NXN, GQP)
            QKK = (GGR, LXC)
            RMD = (CJF, XNV)
            MKF = (TVN, BTT)
            RBV = (XSP, KSC)
            RMH = (JVG, DTS)
            RPG = (LHT, LHX)
            FCH = (NDV, GDP)
            HPF = (LTS, RVQ)
            DRH = (BTM, HPH)
            PFR = (RJR, DBR)
            RJR = (SVN, VXJ)
            MFK = (HCQ, QDN)
            RGQ = (VRH, CPG)
            BSX = (GHN, NJL)
            TLR = (XFL, JSV)
            KCV = (NQF, BCH)
            PJC = (JGX, JCV)
            XVF = (KGG, CVJ)
            DKF = (GBP, FXB)
            SKG = (XXD, MJL)
            MVB = (BVP, BXM)
            MJL = (GJK, CVV)
            NSH = (VCN, VXF)
            DVD = (BCQ, PJC)
            VPR = (LLN, FCD)
            HLG = (SDF, HPF)
            FLD = (BXJ, DTM)
            SKK = (GDD, DCG)
            NQF = (SRK, LSG)
            QNN = (LXL, MGT)
            DMR = (MKB, NGM)
            FVB = (NNR, PBH)
            MXR = (TPD, PVL)
            CLF = (DJC, XXQ)
            FCT = (GQP, NXN)
            RPA = (QKX, FNK)
            MHQ = (XCF, RCR)
            XPK = (PBH, NNR)
            RBK = (TPM, TPM)
            LVX = (TDQ, XLH)
            RMR = (SDM, VTH)
            PBF = (FNX, MGP)
            GCM = (QML, XGD)
            KSF = (BSX, THL)
            XXD = (GJK, CVV)
            DBR = (VXJ, SVN)
            THD = (DXB, GDQ)
            LFR = (LBC, CPT)
            LKK = (FBP, HFR)
            GFP = (RJR, DBR)
            RNK = (VCS, NKS)
            PBL = (VNQ, SRD)
            FXM = (DDF, LVX)
            KGN = (XFM, LQM)
            VPK = (GPC, NQB)
            JNS = (HGV, XJR)
            GTK = (BQR, PFH)
            FTV = (KTN, GVD)
            MCJ = (DFH, GGQ)
            MDF = (LJC, RFS)
            JRL = (GJF, QTV)
            MFC = (RMK, JBX)
            VVS = (NGC, VHC)
            TVF = (TLR, GLZ)
            FCF = (BCQ, PJC)
            SXS = (NQF, BCH)
            GDC = (HXH, TBK)
            XXQ = (MKF, PNR)
            SPG = (GMR, TRF)
            GVP = (LNN, TJT)
            PQQ = (SLR, TDG)
            HBT = (QRH, LDG)
            XGD = (KSR, RFJ)
            QML = (KSR, RFJ)
            LKM = (RVR, FJR)
            DRN = (MJV, NFS)
            MKB = (NTF, BDN)
            GHP = (JCM, SPP)
            XPT = (JMM, CBB)
            KTN = (GRP, TCF)
            LRT = (SCN, HJR)
            BVP = (QKT, GHR)
            FNK = (VPR, BHD)
            GRM = (RHP, NXM)
            BXM = (QKT, GHR)
            CPM = (RSG, NCR)
            MRL = (HCQ, QDN)
            VQG = (PVS, PQQ)
            STD = (VXF, VCN)
            DQD = (DGV, PKV)
            TSX = (GJB, JKK)
            GTD = (KCF, GSV)
            FNX = (RPG, QGC)
            BXH = (LDF, FHF)
            CVC = (GLK, QSC)
            TLV = (MDF, HPL)
            DNL = (PMG, VRK)
            FQD = (GTK, GMD)
            CPG = (MTJ, KLJ)
            SPP = (BKS, PJM)
            GJB = (RVV, XPG)
            SSK = (FXF, BTN)
            PVH = (MXT, JDF)
            XVN = (FQN, KRV)
            LFJ = (BSX, THL)
            VNH = (KGN, QHD)
            HLR = (FMK, LCD)
            KBL = (JTL, PFD)
            BTM = (TLX, RQG)
            DPB = (PST, DVS)
            LTS = (FQC, PLV)
            RQG = (CVD, XQH)
            PBR = (LNN, TJT)
            CLB = (MFG, BPS)
            XFM = (RMH, XDJ)
            CJR = (MJQ, MVB)
            VTN = (BVL, RQS)
            VBG = (QDH, CST)
            GMR = (HVJ, DKF)
            KHG = (BXJ, DTM)
            GDD = (CLF, GBS)
            QTR = (QKK, MDD)
            VCL = (MFS, MFC)
            TBV = (VQC, VSX)
            BCQ = (JCV, JGX)
            NGC = (VHT, BSP)
            GJF = (HLR, VLL)
            FGD = (NPX, BHV)
            RGS = (PQT, FJD)
            VXJ = (PBF, GXR)
            FJR = (SJH, FQT)
            VXF = (CLC, NSB)
            HCF = (GPC, NQB)
            DTK = (RLG, GCM)
            MRB = (XMC, MNX)
            MFX = (QSC, GLK)
            GMX = (VXK, FSF)
            BDT = (LFS, RTB)
            JRN = (VHQ, JGB)
            SHJ = (KLR, VTD)
            TCL = (HRL, SPS)
            CPT = (DTK, JTV)
            VPM = (TFH, RRM)
            DQP = (RMD, KVX)
            CJF = (VQG, PVR)
            PBH = (GDV, TVB)
            LXC = (QLG, TCX)
            FHQ = (GMR, TRF)
            BMP = (XVM, NTM)
            XHK = (NTM, XVM)
            NQP = (LVX, DDF)
            TVP = (GMC, HJN)
            XFS = (LNH, RPP)
            RGM = (RHX, HGG)
            NQC = (VNH, BFS)
            GXC = (RBV, NJD)
            XQR = (NSH, STD)
            BTT = (QNN, DPQ)
            PFP = (CHS, JNV)
            QKT = (SVH, JPC)
            QCC = (DHL, XFS)
            LTN = (LDF, FHF)
            CMR = (GMJ, NJG)
            DGF = (XQQ, XQQ)
            MTX = (DST, BJZ)
            QSJ = (GTR, NXD)
            DFP = (HJR, SCN)
            MNJ = (FCJ, KGR)
            XSH = (QST, STX)
            VHP = (KXL, TBV)
            DGS = (KQP, DKN)
            HPL = (LJC, RFS)
            DTS = (RDG, PBT)
            VJK = (JTX, DMR)
            CLM = (LDG, QRH)
            QFK = (SDM, VTH)
            HGG = (CDL, RGD)
            """.split("\n\n");
}
