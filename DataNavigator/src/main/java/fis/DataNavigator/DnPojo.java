package fis.DataNavigator;

public class DnPojo {

	public static DnPojo dnPojo=null;

	private DnPojo() {

	}

	public static DnPojo getInstance() {
		if(dnPojo==null)
			dnPojo=new DnPojo();
		return dnPojo;
	}



	String             UNIQUENESS_KEY;	
	String           TSTAMP_TRANS	  ;

	//BBL  Tab:

	String                RECV_PROXY_ID;	     
	String                SENDER_PROXY_ID	; 
	String                RECV_PROXY_TYPE	; 
	String                SENDER_PROXY_TYPE	 ;
	String                SENDER_TAX_ID	     ;
	String                RECV_TAX_ID	     ;
	String                VAT_RATE	         ;
	String            VAT	;
	String                WHT_TAX_RATE	 ;    
	String               WHT_TAX;
	String                WHT_TAX_COND;	     
	String                SENDER_REF_NO;	     
	String                TRAN_REF_NO	;     
	String                REF_NO	     ;        
	String                BBL_REF_NO      ;   
	String             FROM_ACCT_NAME	   ; 
	String             TO_ACCT_NAME	    ;
	String             TO_ACCT_DISP_NAME;	
	String             BBL_FILLER_1	    ;
	String             BBL_FILLER_2	    ;
	String             TAX_INVOICE	    ;
	String           TYPE_OF_INCOME	  ;
	String           EDC_NUMBER	      ;

	String           PRODUCT_CODE	  ;
	String           SERV_TYPE_CODE	  ;
	String           BILL_REFERENCE	  ;
	String         BPDUE_RTPEXP_DATE	;
	String         CREDIT_NOTIF_REF	;
	String      BP_URL;
	String         SENDER_COMP_TAX_ID	;
	String         SENDER_COMP_ACCT_NO;
	String         RECV_COMP_TAX_ID	;
	String         RECV_COMP_ACCT_NO;
	String         COMPANY_CODE	    ; 
	String         SERVICE_CODE	    ;
	String          FLAGS;
	String         BILL_REFERENCE2   ; 
	String         USER_DATA_1	    ;
	String         USER_DATA_2	    ;
	String         USER_DATA_3	    ;
	String         USER_DATA_4	    ;
	String         USER_DATA_5	    ;
	String         PAYMENT_1	     ;   
	String         PAYMENT_2	      ;  
	String         PAYMENT_3	       ; 
	String         SMS_FEE	        ;
	String         SMS_MOBILE	     ;   
	String         OTP	;
	String         ACCT_INFO_1	  ;  
	String         ACCT_INFO_2	   ; 
	String         BBL_FILLER_3	    ;
	String         FRM_FUND_CODE	 ;   
	String         TO_FUND_CODE	    ;
	String         UNIT	            ;
	String         UNIT_PRICE	     ;   
	String         BOND_YIELD	      ;  
	String         SURCHARGE_FEE	   ; 
	String         EXT_FROM_ACCT_TYPE	;
	String         EXT_TO_ACCT_TYPE	;
	String         FROM_ACCT_DISP_NAME;
	String         PRIVATE_DATA	    ;
	String         TERMINAL_TRACE	 ;   
	String         QRC_VOUCHER	    ;
	String         BBL_FILLER_4	    ;
	String         CDM_DATA	        ;
	String         BBL_FILLER_5	    ;
	String         POS_DATA	        ;



	//EMV BUFF: long circuit data Tab

	String               EMV_TSTAMP_TRANS;
	String               EMV_UNIQUENESS_KEY;
	String               AMOUNT_OTHER;	            
	String               APPL_CRYPTOGRAM;	            
	String               APPL_INTRCHG_PROF	;    
	String               APPL_TRAN_COUNTER;	    
	String               APPL_VERSION_NO;	        
	String               APPL_ID;	                
	String               CARDH_VER_RESULT;	        
	String               COPAC_CCS_CRYPTO;	        
	String               CRYPT_INFO_DATA;	        
	String               CRYPTOGRAM_AMOUNT;	

	String               DEDICATED_FILE_NAM;

	String               TERM_CAPABILITIES	;    
	String               TERM_COUNTRY_CODE	;    
	String               TERM_SERIAL_NO	;        
	String               TERM_VERIFY_RESULT	;

	String               TERMINAL_TYPE	;
	String               TRAN_CATEGORY_CODE;	    
	String               TRAN_CURRENCY_CODE	;    
	String               TRAN_DATE	;            
	String               TRAN_SEQ_COUNTER;	        
	String               TRAN_TYPE;


	String               UNPREDICTABLE_NO	;        
	String               DERIVATION_KEY_IDX	;    
	String               ARPC_CRYPTOGRAM;	        
	String               ARPC_RESPCODE;	        
	String               DEDICATED_FNAME	; 
	String               CARDHOLDER_INFO;

	String               ISS_APPL_DATA;	        
	String               ISS_AUTH_DATA;	        
	String               ISS_DISCR_DATA;	        
	String               ISS_SCRIPT_RESULT;	    
	String               ISS_SCRIPT1_DATA	;        
	String               ISS_SCRIPT2_DATA	;        
	String               FORM_FACTOR_IND	; 



	//Transaction Detail Tab



	String              PAN	  ;             
	String               TRAN_TYPE_ID;	       
	String               trans_AMT_RECON_NET	; 
	String               trans_CUR_RECON_NET ;
	String               SYS_TRACE_AUDIT_NO;	   
	String               TSTAMP_LOCAL	;  
	String               trans_FUNC_CODE;

	String               INST_ID_RECON_ACQ;
	String               INST_ID_RECN_ACQ_B;

	String               RETRIEVAL_REF_NO	  ; 
	String               APPROVAL_CODE	;       
	String               ACT_CODE	;

	String               CARD_ACPT_TERM_ID	;  
	String               NET_TERM_ID;                 
	String               RPT_LVL_ID_B;	      
	String               PROC_GRP_ID_ACQ_B	;
	String               PROC_GRP_ID_ISS_B;   
	String               PROC_ID_ACQ_B;      
	String               PROC_ID_ISS_B	;    
	String               INST_ID_ISS	;          
	String               INST_ID_ACQ	;          
	String               INST_ID_RECN_ISS_B;	   
	String               INST_ID_RECON_ISS	  ; 
	String               trans_ACCT_ID_1	  ;  
	String               AUTH_BY	;               
	String               TRAN_CLASS;	           
	String               PAN_PREFIX;       
	String               PAN_SUFFIX;      
	String               trans_PAN_TOKEN	;          
	String               PAN_TOKEN_PREFIX	;	   
	String               PAN_TOKEN_SUFFIX	;	   
	String               PROC_ID_ACQ	;           
	String               PROC_ID_ISS	;           
	String               trans_MERCH_TYPE	;    
	String               INV_ORDER_NO	;   
	String               FIN_TYPE	    ;
	String               SUBSCRIBER_IND	 ;      
	String               trans_DATE_RECON_ACQ	;       
	String               trans_DATE_RECON_ISS	;       
	String               MAPPED_DUP_DATA	;



	//Additional data : record table



	String                        PARTITION_KEY	;       
	String                        INSERT_SEQUENCE_NO	;   

	String                          MTI	 ;                  
	String                        AMT_TRAN	;           
	String                        CUR_TRAN	 ;          
	String                        AMT_RECON_NET;	       
	String                        CUR_RECON_NET	;       
	String                        AMT_CARD_BILL	 ;      
	String                        CUR_CARD_BILL	  ;     
	String                        CNV_RCN_NET_RATE	;   
	String                        CNV_RCN_NET_DE_POS	 ;  
	String                        CNV_RCN_ACQ_RATE	  ; 
	String                        CNV_RCN_ACQ_DE_POS	   ;
	String                        CNV_RCN_ISS_RATE	   ;
	String                        CNV_RCN_ISS_DE_POS	   ;
	String                        CNV_CRD_BIL_RATE	   ;
	String                        CNV_CRD_BIL_DE_POS	   ;
	String                        DATE_EFFECTIVE	       ;
	String                        DATE_EXP	           ;
	String                        DATE_RECON_NET	       ;
	String                        DATE_CNV_ACQ	       ;
	String                        DATE_CNV_ISS	       ;
	String                        DATE_CAPTURE	       ;
	String                        COUNTRY_ACQ_INST	   ;
	String                        COUNTRY_ISS_INST	   ;
	String                        POS_CRD_DAT_IN_MOD	   ;
	String                        POS_CRDHLDR_A_METH	   ;
	String                        POS_OPER_ENV	       ;
	String                        POS_CRDHLDR_PRESNT	   ;
	String                        POS_CARD_PRES	       ;
	String                        POS_CRDHLDR_AUTH	   ;
	String                        CARD_SEQ_NO	           ;
	String                        FUNC_CODE	           ;
	String                        MSG_RESON_CODE_ACQ	   ;
	String                        CARD_ACPT_BUS_CODE	   ;
	String                        POS_CRD_DAT_IN_CAP	   ;
	String                        POS_CRDHLDR_AUTH_C	   ;
	String                        POS_TERM_OUT_CAP	   ;
	String                        POS_CRD_DAT_OT_CAP	   ;
	String                        POS_CARD_CAPT_CAP	   ;
	String                        POS_PIN_CAPT_CAP	   ;
	String                        DATE_RECON_ACQ	       ;
	String                        DATE_RECON_ISS	       ;
	String                        O_AMT_TRAN	           ;
	String                        O_AMT_RECON_NET	       ;
	String                        SRV_GRP_StringCHG_IND	;   
	String                        SRV_GRP_SERV_CODE	   ;
	String                        CARD_ACPT_ID	       ;
	String                        CLERK_ID	           ;
	String                        CARD_ACPT_COUNTRY	   ;
	String                        CARD_ACPT_PST_CODE	   ;
	String                        CARD_ACPT_REGION	   ;
	String                        MULTI_CLEAR_SEQ_NO	   ;
	String                        MULTI_CLEAR_COUNT	   ;
	String                        F_TYPE0	            ;   
	String                        F_TYPE1	             ;  
	String                        F_TYPE2	              ; 
	String                        F_TYPE3	               ;
	String                        F_TYPE4	               ;
	String                        F_TYPE5	               ;
	String                        F_INITIATOR0	       ;
	String                        F_INITIATOR1	       ;
	String                        F_INITIATOR2	       ;
	String                        F_INITIATOR3	       ;
	String                        F_INITIATOR4	       ;
	String                        F_INITIATOR5	       ;
	String                        F_MEMO0	            ;   
	String                        F_MEMO1	             ;  
	String                        F_MEMO2	              ; 
	String                        F_MEMO3	               ;
	String                        F_MEMO4	               ;
	String                        F_MEMO5	               ;
	String                        F_AMT0	               ;
	String                        F_AMT1	               ;
	String                        F_AMT2	               ;
	String                        F_AMT3	               ;
	String                        F_AMT4	               ;
	String                        F_AMT5	               ;
	String                        F_CUR_CODE0	        ;   
	String                        F_CUR_CODE1	         ;  
	String                        F_CUR_CODE2	         ;  
	String                        F_CUR_CODE3	          ; 
	String                        F_CUR_CODE4	           ;
	String                        F_CUR_CODE5	           ;
	String                        F_ADL_DEC_POS0	       ;
	String                        F_ADL_DEC_POS1	       ;
	String                        F_ADL_DEC_POS2	       ;
	String                        F_ADL_DEC_POS3	       ;
	String                        F_ADL_DEC_POS4	       ;
	String                        F_ADL_DEC_POS5	       ;
	String                        F_CNV_ACQ_RATE0	    ;   
	String                        F_CNV_ACQ_RATE1	     ;  
	String                        F_CNV_ACQ_RATE2	      ; 
	String                        F_CNV_ACQ_RATE3	       ;
	String                        F_CNV_ACQ_RATE4	       ;
	String                        F_CNV_ACQ_RATE5	       ;
	String                        F_CNV_ACQ_DEC_POS0	   ;
	String                        F_CNV_ACQ_DEC_POS1	   ;
	String                        F_CNV_ACQ_DEC_POS2	   ;
	String                        F_CNV_ACQ_DEC_POS3	   ;
	String                        F_CNV_ACQ_DEC_POS4	   ;
	String                        F_CNV_ACQ_DEC_POS5	   ;
	String                        F_AMT_RECON_ACQ0	   ;
	String                        F_AMT_RECON_ACQ1	   ;
	String                        F_AMT_RECON_ACQ2	   ;
	String                        F_AMT_RECON_ACQ3	   ;
	String                        F_AMT_RECON_ACQ4	   ;
	String                        F_AMT_RECON_ACQ5	   ;
	String                        F_CUR_RECON_ACQ0	   ;
	String                        F_CUR_RECON_ACQ1	   ;
	String                        F_CUR_RECON_ACQ2	   ;
	String                        F_CUR_RECON_ACQ3	   ;
	String                        F_CUR_RECON_ACQ4	   ;
	String                        F_CUR_RECON_ACQ5	   ;
	String                        F_CNV_ISS_RATE0	    ;   
	String                        F_CNV_ISS_RATE1	     ;  
	String                        F_CNV_ISS_RATE2	      ; 
	String                        F_CNV_ISS_RATE3	       ;
	String                        F_CNV_ISS_RATE4	       ;
	String                        F_CNV_ISS_RATE5	       ;
	String                        F_CNV_ISS_DEC_POS0	   ;
	String                        F_CNV_ISS_DEC_POS1	   ;
	String                        F_CNV_ISS_DEC_POS2	   ;
	String                        F_CNV_ISS_DEC_POS3	   ;
	String                        F_CNV_ISS_DEC_POS4	   ;
	String                        F_CNV_ISS_DEC_POS5	   ;
	String                        F_AMT_RECON_ISS0	   ;
	String                        F_AMT_RECON_ISS1	   ;
	String                        F_AMT_RECON_ISS2	   ;
	String                        F_AMT_RECON_ISS3	   ;
	String                        F_AMT_RECON_ISS4	   ;
	String                        F_AMT_RECON_ISS5	   ;
	String                        F_CUR_RECON_ISS0	   ;
	String                        F_CUR_RECON_ISS1	   ;
	String                        F_CUR_RECON_ISS2	   ;
	String                        F_CUR_RECON_ISS3	   ;
	String                        F_CUR_RECON_ISS4	   ;
	String                        F_CUR_RECON_ISS5	   ;
	String                        F_AMT_RECON_NET0	   ;
	String                        F_AMT_RECON_NET1	   ;
	String                        F_AMT_RECON_NET2	   ;
	String                        F_AMT_RECON_NET3	   ;
	String                        F_AMT_RECON_NET4	   ;
	String                        F_AMT_RECON_NET5	   ;
	String                        CVV_CVC_RESULT	       ;
	String                        CVV2_CVC2_RESULT	   ;
	String                        CAVV_RESULT	        ;   
	String                        ADL_RQST_AMT0	       ;
	String                        ADL_RQST_AMT1	       ;
	String                        ADL_RQST_AMT2	       ;
	String                        ADL_RQST_AMT3	       ;
	String                        ADL_RQST_AMT4	       ;
	String                        ADL_RQST_AMT5	       ;
	String                        ADL_RQST_CUR_CODE0	;   
	String                        ADL_RQST_CUR_CODE1	 ;  
	String                        ADL_RQST_CUR_CODE2	  ; 
	String                        ADL_RQST_CUR_CODE3	   ;
	String                        ADL_RQST_CUR_CODE4	   ;
	String                        ADL_RQST_CUR_CODE5	   ;
	String                        ADL_RQST_AMT_TYP0	   ;
	String                        ADL_RQST_AMT_TYP1	   ;
	String                        ADL_RQST_AMT_TYP2	   ;
	String                        ADL_RQST_AMT_TYP3	   ;
	String                        ADL_RQST_AMT_TYP4	   ;
	String                        ADL_RQST_AMT_TYP5	   ;
	String                        ADL_RQST_ACCT_IDX0	   ;
	String                        ADL_RQST_ACCT_IDX1	   ;
	String                        ADL_RQST_ACCT_IDX2	   ;
	String                        ADL_RQST_ACCT_IDX3	   ;
	String                        ADL_RQST_ACCT_IDX4	   ;
	String                        ADL_RQST_ACCT_IDX5	   ;
	String                        ADL_RQST_ACCT_TYP0	   ;
	String                        ADL_RQST_ACCT_TYP1	   ;
	String                        ADL_RQST_ACCT_TYP2	   ;
	String                        ADL_RQST_ACCT_TYP3	   ;
	String                        ADL_RQST_ACCT_TYP4	   ;
	String                        ADL_RQST_ACCT_TYP5	   ;
	String                        ODE_MTI	           ;
	String                        ODE_SYS_TRA_AUD_NO	;   
	String                        ODE_TSTAMP_LOCL_TR	 ;  
	String                        ODE_INST_ID_ACQ	  ;     
	String                        AUTH_LCYCLE_TCODE	   ;
	String                        AUTH_LIFECYCLE_String	;   
	String                        NET_ID_ACQ	           ;
	String                        NET_ID_ISS	           ;
	String                        FO_TYPE0	           ;
	String                        FO_TYPE1	           ;
	String                        FO_TYPE2	           ;
	String                        FO_TYPE3	           ;
	String                        FO_TYPE4	           ;
	String                        FO_TYPE5	           ;
	String                        FO_INITIATOR0	       ;
	String                        FO_INITIATOR1	       ;
	String                        FO_INITIATOR2	       ;
	String                        FO_INITIATOR3	       ;
	String                        FO_INITIATOR4	       ;
	String                        FO_INITIATOR5	       ;
	String                        FO_MEMO0	           ;
	String                        FO_MEMO1	           ;
	String                        FO_MEMO2	           ;
	String                        FO_MEMO3	           ;
	String                        FO_MEMO4	           ;
	String                        FO_MEMO5	           ;
	String                        FO_AMT0	            ;   
	String                        FO_AMT1	             ; 
	String                        FO_AMT2	              ;
	String                        FO_AMT3	               ;
	String                        FO_AMT4	               ;
	String                        FO_AMT5	               ;
	String                        FO_CUR_CODE0	       ;
	String                        FO_CUR_CODE1	       ;
	String                        FO_CUR_CODE2	       ;
	String                        FO_CUR_CODE3	       ;
	String                        FO_CUR_CODE4	       ;
	String                        FO_CUR_CODE5	       ;
	String                        FO_CUR_RECON_ACQ0	   ;
	String                        FO_CUR_RECON_ACQ1	   ;
	String                        FO_CUR_RECON_ACQ2	   ;
	String                        FO_CUR_RECON_ACQ3	   ;
	String                        FO_CUR_RECON_ACQ4	   ;
	String                        FO_CUR_RECON_ACQ5	   ;
	String                        FO_CUR_RECON_ISS0	   ;
	String                        FO_CUR_RECON_ISS1	   ;
	String                        FO_CUR_RECON_ISS2	   ;
	String                        FO_CUR_RECON_ISS3	   ;
	String                        FO_CUR_RECON_ISS4	   ;
	String                        FO_CUR_RECON_ISS5	   ;
	String                        FO_DEC_POS0	        ;   
	String                        FO_DEC_POS1	         ;  
	String                        FO_DEC_POS2	          ; 
	String                        FO_DEC_POS3	           ;
	String                        FO_DEC_POS4	           ;
	String                        FO_DEC_POS5	           ;
	String                        FO_CNV_ACQ_RATE0	   ;
	String                        FO_CNV_ACQ_RATE1	   ;
	String                        FO_CNV_ACQ_RATE2	   ;
	String                        FO_CNV_ACQ_RATE3	   ;
	String                        FO_CNV_ACQ_RATE4	   ;
	String                        FO_CNV_ACQ_RATE5	   ;
	String                        FO_CNV_ACQ_DE_POS0	   ;
	String                        FO_CNV_ACQ_DE_POS1	   ;
	String                        FO_CNV_ACQ_DE_POS2	   ;
	String                        FO_CNV_ACQ_DE_POS3	   ;
	String                        FO_CNV_ACQ_DE_POS4	   ;
	String                        FO_CNV_ACQ_DE_POS5	   ;
	String                        FO_AMT_RECON_ACQ0	   ;
	String                        FO_AMT_RECON_ACQ1	   ;
	String                        FO_AMT_RECON_ACQ2	   ;
	String                        FO_AMT_RECON_ACQ3	   ;
	String                        FO_AMT_RECON_ACQ4	   ;
	String                        FO_AMT_RECON_ACQ5	   ;
	String                        FO_CNV_ISS_RATE0	   ;
	String                        FO_CNV_ISS_RATE1	   ;
	String                        FO_CNV_ISS_RATE2	   ;
	String                        FO_CNV_ISS_RATE3	   ;
	String                        FO_CNV_ISS_RATE4	   ;
	String                        FO_CNV_ISS_RATE5	   ;
	String                        FO_CNV_ISS_DE_POS0	   ;
	String                        FO_CNV_ISS_DE_POS1	   ;
	String                        FO_CNV_ISS_DE_POS2	   ;
	String                        FO_CNV_ISS_DE_POS3	   ;
	String                        FO_CNV_ISS_DE_POS4	   ;
	String                        FO_CNV_ISS_DE_POS5	   ;
	String                        FO_AMT_RECON_ISS0	   ;
	String                        FO_AMT_RECON_ISS1	   ;
	String                        FO_AMT_RECON_ISS2	   ;
	String                        FO_AMT_RECON_ISS3	   ;
	String                        FO_AMT_RECON_ISS4	   ;
	String                        FO_AMT_RECON_ISS5	   ;
	String                        FO_AMT_RECON_NET0	   ;
	String                        FO_AMT_RECON_NET1	   ;
	String                        FO_AMT_RECON_NET2	   ;
	String                        FO_AMT_RECON_NET3	   ;
	String                        FO_AMT_RECON_NET4	   ;
	String                        FO_AMT_RECON_NET5	   ;
	String                        EXTENDED_PAY_DATA	   ;
	String                        DATE_ACTION	        ;  
	String                        AMT_RECON_ACQ	       ;
	String                        CUR_RECON_ACQ	       ;
	String                        AMT_RECON_ISS	      ;
	String                        CUR_RECON_ISS	       ;
	String                        PAYEE	               ;
	String                        ACCT_ID_1	           ;
	String                        ACCT_ID_2	           ;
	String                        TRAN_DISPOSITION	   ;
	String                        TERM_CLASS	        ;   
	String                        CARD_OWNER	         ;  
	String                        CARD_TYPE	          ; 
	String                        MSG_RESON_CODE_ISS	   ;
	String                        ACCT_ID_3	           ;
	String                        ACQ_PLAT_PROD_ID	   ;
	String                        REIMBURSEMENT_ATTR	;   
	String                        REV_BY	             ;  
	String                        ACCT_TYPES_ISS	      ; 
	String                        PIN_RESULT	           ;
	String                        MCI_AAV_RESULT_COD	   ;
	String                        MCI_ECS_LVL_IND	       ;
	String                        CARD_ACPT_SPNSR_ID	   ;
	String                        PAN_TOKEN	           ;
	String                        ADL_RESP_AMT0	       ;
	String                        ADL_RESP_AMT1	       ;
	String                        ADL_RESP_AMT2	       ;
	String                        ADL_RESP_AMT3	       ;
	String                        ADL_RESP_AMT4	       ;
	String                        ADL_RESP_AMT5	       ;
	String                        ADL_RESP_CUR_CODE0	;   
	String                        ADL_RESP_CUR_CODE1	 ;  
	String                        ADL_RESP_CUR_CODE2	  ; 
	String                        ADL_RESP_CUR_CODE3	   ;
	String                        ADL_RESP_CUR_CODE4	   ;
	String                        ADL_RESP_CUR_CODE5	   ;
	String                        ADL_RESP_AMT_TYP0	   ;
	String                        ADL_RESP_AMT_TYP1	   ;
	String                        ADL_RESP_AMT_TYP2	   ;
	String                        ADL_RESP_AMT_TYP3	   ;
	String                        ADL_RESP_AMT_TYP4	   ;
	String                        ADL_RESP_AMT_TYP5	   ;
	String                        ADL_RESP_ACCT_IDX0	;   
	String                        ADL_RESP_ACCT_IDX1	 ;  
	String                        ADL_RESP_ACCT_IDX2	  ; 
	String                        ADL_RESP_ACCT_IDX3	   ;
	String                        ADL_RESP_ACCT_IDX4	   ;
	String                        ADL_RESP_ACCT_IDX5	   ;
	String                        ADL_RESP_ACCT_TYP0	   ;
	String                        ADL_RESP_ACCT_TYP1	   ;
	String                        ADL_RESP_ACCT_TYP2	   ;
	String                        ADL_RESP_ACCT_TYP3	   ;
	String                        ADL_RESP_ACCT_TYP4	   ;
	String                        ADL_RESP_ACCT_TYP5	   ;
	String                        CAN_ITEM_VALUE0	       ;
	String                        CAN_ITEM_VALUE1	       ;
	String                        CAN_ITEM_VALUE2	       ;
	String                        CAN_ITEM_VALUE3	       ;
	String                        CAN_ITEM_VALUE4	       ;
	String                        CAN_ITEM_VALUE5	       ;
	String                        CAN_ITEM_VALUE6	       ;
	String                        CAN_ITEM_VALUE7	       ;
	String                        CAN_NO_ITEMS_DISP0	   ;
	String                        CAN_NO_ITEMS_DISP1	   ;
	String                        CAN_NO_ITEMS_DISP2	   ;
	String                        CAN_NO_ITEMS_DISP3	   ;
	String                        CAN_NO_ITEMS_DISP4	   ;
	String                        CAN_NO_ITEMS_DISP5	   ;
	String                        CAN_NO_ITEMS_DISP6	   ;
	String                        CAN_NO_ITEMS_DISP7	   ;
	String                        CAN_ORIG_NO_ITEMS0	   ;
	String                        CAN_ORIG_NO_ITEMS1	   ;
	String                        CAN_ORIG_NO_ITEMS2	   ;
	String                        CAN_ORIG_NO_ITEMS3	   ;
	String                        CAN_ORIG_NO_ITEMS4	   ;
	String                        CAN_ORIG_NO_ITEMS5	   ;
	String                        CAN_ORIG_NO_ITEMS6	   ;
	String                        CAN_ORIG_NO_ITEMS7	   ;
	String                        CED_BUILD_NO	       ;
	String                        CUR_TYPE	           ;
	String                        TIME_AT_AP	        ;   
	String                        TIME_AT_ISS	         ;  
	String                        TIME_AT_RESP_QUE	   ;
	String                        TIME_AT_RESP_SWTCH	;   
	String                        TIME_AT_RQST_QUE	   ;
	String                        TIME_AT_RQST_SWTCH	;   
	String                        O_AMT_CARD_BILL	     ;  
	String                        O_AMT_RECON_ACQ	      ; 
	String                        O_AMT_RECON_ISS	       ;
	String                        AP_ERROR_NO	           ;
	String                        AP_ERROR_TRACE_LOC	   ;
	String                        AP_REJ_REASON_CODE	   ;
	String                        AUTH_RQST_TIMEOUT	   ;
	String                        PIN_DATA_FMT	       ;
	String                        PMC_ERROR	        ;   
	String                        PREAUTH_COMP_OPT	   ;
	String                        USAGE_UPDATE_BITS	;   
	String                        ORIG_AMT_TRAN_ADJ	 ;  
	String                        CIRC_ID_ACQ	          ; 
	String                        CIRC_ID_ISS	           ;
	String                        MERCH_TYPE	           ;
	String                        ACCT_QUAL_1	           ;
	String                        ACCT_QUAL_2	           ;
	String                        AP_FLG	               ;
	String                        DRAFT_CAPTURE_FLG	   ;
	String                        EXCHG_MASTER	       ;
	String                        EXCHG_SETL	        ;   
	String                        HOST_RECV_FLG	       ;
	String                        HOST_SENT_FLG	       ;
	String                        OAR_RQST_FLG	       ;
	String                        PRString_MASK_ID	    ;   
	String                        TSTAMP_REV_CREATED	 ;  
	String                        ACCT_TYPE_1	          ; 
	String                        ACCT_TYPE_2	           ;
	String                        ACCT_TYPE_3	           ;
	String                        ALT_ROUTE_FLG	       ;
	String                        AP_APPROVAL_CODE	   ;
	String                        AP_CARD_GRP	        ;   
	String                        AP_DATA	               ;
	String                        CNTRY_RCN_ACQ_INST	   ;
	String                        CNTRY_RCN_ISS_INST	   ;
	String                        CARD_ACPT_COUNTY	   ;
	String                        CARD_CAPT_FLG	       ;
	String                        DEPOSIT_ONLY_FLG	   ;
	String                        TRAN_FROM_ACCT_FLG	   ;
	String                        TRAN_TO_ACCT_FLG	   ;
	String                        RECON_IND_ACQ	       ;
	String                        RESTRIC_StringCHG_GRP	;   
	String                        SOURCE_ROUTE_ID	       ;
	String                        STANDIN_ACT	           ;
	String                        STANDIN_OPTION	       ;
	String                        TRACK_INFO_KEY_ID	   ;
	String                        TRACINF_KEYTRAC_NO	   ;
	String                        CNTRY_REC_INST_ADJ	   ;
	String                        CNTRY_REQ_INST_ADJ	   ;
	String                        BRANCH_ID_ACQ	       ;
	String                        INST_ID_REC_ADJ	       ;
	String                        INST_ID_REQ_ADJ	       ;
	String                        NET_IND_ADJ	           ;
	String                        TSTAMP_LOCAL_ADJ	   ;
	String                        TSTAMP_TRANS_ADJ	   ;
	String                        REQ_ACQ_ISS_IND	    ;   
	String                        TRACE_DATA_ADJ	       ;
	String                        ISS_ACQ_TYPE_FEE	   ;
	String                        MCI_UCAF_DATA	       ;
	String                        MERCH_TIER_ID	       ;
	String                        TRAN_UNIQ_DATA_FMT	   ;
	String                        BIN_EXCLUSION_GRP	   ;
	String                        CARD_LOGO_ID	       ;
	String                        NET_StringRCHG_TIER	   ;
	String                        INST_TIER	           ;
	String                        CARD_StringRCHG_ID	    ;   
	String                        PROGRAM_ID	           ;
	String                        PIN_FLG	               ;
	String                        NETWORK_PROGRAM	       ;
	String                        WEIGHTED_AVE_FLG	   ;
	String                        TOKEN_ASSURANCE	;       
	String                        TOKEN_REQUESTOR_ID	 ;  
	String                        PAN_RANGE	          ; 
	String                        PAN_INDICATOR	       ;
	String                        TOKEN_EXP_DATE	       ;
	String                        TOKEN_REF_NUMBER	   ;
	String                        TOKEN_SER_PROVIDER	   ;
	String                        TOKEN_STATUS	       ;
	String                        TOKEN_TYPE	           ;
	String                        HCE_ACTIVATE_RESULT	   ;
	String                        AAM_VELOCITY_RESULT	   ;
	String                        LUK_ELAPSED_TIME	   ;
	String                        LUK_TRAN_COUNT	       ;
	String                        LUK_AMT_TRAN	       ;
	String                        TOKEN_DEVICE_TYPE	;   
	String                        TOKEN_DEVICE_LOC	 ;  
	String                        TOKEN_REF_NUMBER_EXT	;
	String                        TOKEN_VERSION	     ;  
	String                        TOKEN_CARD_SEQ_NO	  ; 
	String                        TOKEN_ACT_CODE	       ;
	String                        TOKEN_STATUS_CODE	   ;
	String                        TOKEN_ISSUER_PROC	   ;
	String                        TOKEN_REQ_TSTAMP	   ;
	String                        TOKEN_RESP_TSTAMP	   ;
	String                        TOKEN_TIME_AT_TSP	   ;
	String                        ACQ_ROUTING_NO	       ;
	String                        ISS_ROUTING_NO	       ;
	String                        TRANS_ROUTING_NO      ; 
	String                        DEST_ROUTING_NO	     ;  
	String                        AUTH_LCYCLE_TRACE	   ;
	String                        ADDL_TRAN_DISP	    ;   
	String                        SWIFT_CODE	         ;  
	String                        IFSC_CODE	           ;
	String                        LOCAL_RETRIEVAL_REF_NO	;
	String                        VISA_ATM_TRAN_ID	 ;  
	String                        DOMAIN_CTL_RESTR	 ;  
	String                        DATA_PRIV_ACQ_FMT	  ; 
	String                        REF_DATA_ACQ_FMT	   ;
	String                        DATA_PRIV_ISS_FMT	   ;
	String                        REF_DATA_ISS_FMT	   ;
	String                        PROC_FLGS1	           ;
	String                        PROC_FLGS2	           ;
	String                        PROC_FLGS3	           ;
	String                        PROC_FLGS4	           ;
	String                        PROC_BILLING_FLGS1	   ;
	String                        PROC_BILLING_FLGS2	   ;
	String                        PROC_BILLING_FLGS3	   ;
	String                        PROC_BILLING_FLGS4	   ;
	String                        TRACK_2_DATA	       ;
	String                        CARD_ACPT_NAME_LOC	   ;
	String                        CRD_ACP_NAM_FMTFLG	   ;
	String                        ADL_RESP_DATA	       ;
	String                        ADL_DATA_PRIV_ACQ	   ;
	String                        ADL_DATA_PRIV_ISS	   ;
	String                        REF_DATA_ISS	       ;
	String                        TRAN_DESC	           ;
	String                        ADL_DATA_NATIONAL	   ;
	String                        DATA_PRIV_ACQ	       ;
	String                        REF_DATA_ACQ	       ;
	String                        DATA_PRIV_ISS	       ;
	String                        TRAN_UNIQUE_DATA	   ;
	String                        NET_UNIQUE_DAT_FEE	   ;
	String                        ADTL_DATA_FEE	       ;
	String                        EXTENSION_DATA_ADJ	   ;
	String                        TOKEN_TRANID	       ;
	String                        UNFORMATTED_MICR_DATA;	
	String                        ADDL_TRAN_RESULT	;   
	String                        BRIDGE_ACQ_FLG	     ;  
	String                        BRIDGE_ISS_FLG	      ; 
	String                        PGRM_PROTOCOL	       ;
	String                        DIR_SERV_TRAN_ID	   ;
	String                        TRAN_String_CLASS	;

	//missed long data tab
	String REF_DATA_ACQ_PreLongData;
	String DATA_PRIV_ACQ_PreLongData;
	String ADL_DATA_PRIV_ACQ_PreLongData;
	String REF_DATA_ISS_PreLongData;
	String DATA_PRIV_ISS_PreLongData;
	String ADL_DATA_PRIV_ISS_PreLongData;
	String TRACK_2_DATA_PreLongData;
	String TRAN_UNIQUE_DATA_PreLongData;
	String TRAN_DESC_PreLongData;
	String UNFORMATTED_MICR_DATA_PreLongData;
	String PAYEE_PreLongData;
	String ADL_RESP_DATA_PreLongData;





	//field separation


	String card_scheme;
	String card_location;
	String txn_service;
	String bbl_private;
	String ATCResult;
	String CVV2IssuerResult;
	String CVV2PresenceIndicator;
	String CVV2ResponseIndicator;

	String cardBrand;
	String Card_Owner_BranchCode;
	String AcqRoutingNo;
	String IssRoutingNo;          
	String TraRoutingNo;          
	String DestRoutingNo;
	String ATM_Terminal_ID;
	String bblATM_Terminal_ID;
	String DCC_Home_CCY_Name;
	String deviceTypeChannel;
	String FrAcct_Owner_Branch;
	String IR_Counter;
	String IR_Flag;
	String Original_Card_Owner;
	String Original_Terminal_Owner;
	String Oth_Bank_Use_Counter;
	String Partial_Reverse_Amount;
	String Terminal_Owner_BranchCode;
	String Terminal_Provice_RegionID;
	String Terminal_State;
	String ToAcct_Owner_Branch;
	String WHTTaxCon;
	String WHTTax;
	String CVV2AcquirerResult;
	
	//Additional tab (newly created)
	
	//Terminal Authorization Indicators

	//card
	String 	TAI_Present_L	;
	String 	TAI_Capture_Capability	;
	String 	TAI_Input_Capability	;
	String 	TAI_Input_Mode	;
	String 	TAI_Output_Capability	;
	String 	TAI_PIN_Capture_Capability	;

	//Cardholder
	String 	TAI_Present_R	;
	String 	TAI_Authentication_Capability	;
	String 	TAI_Authentication_Entity	;
	String 	TAI_Authentication_Method	;
	String 	TAI_TerminalOutput_Capability	;
	String 	TAI_Operating_Environment	;

	//Card Identifier Information

	String 	CII_AccountQualifier1	;
	String 	CII_AccountQualifier2	;
	String 	CII_MessageTypeIdentifier	;
	String 	CII_FinancialType	;
	String 	CII_CardType	;
	String 	CII_CardOwnerID	;
	String 	CII_ServiceCode	;
	String 	CII_ProgramID	;

	//Flag Information

	String 	FI_HostReceived	;
	String 	FI_HostSent	;
	String 	FI_APFlag	;
	String 	FI_ReversedBy	;
	String 	FI_PlatformProductID	;
	String 	FI_OARRequest	;
	String 	FI_CardAcceptorNameLocation_Formatted	;

	//Additional Flags

	String 	AF_PinDataFormat	;
	String 	AF_PINResults	;
	String 	AF_PMCError	;
	String 	AF_StandinOption	;
	String 	AF_StandinAction	;

	//AP Fields

	String 	APApprovalCode	;
	String 	APCardGroup	;
	String 	APData	;
	String 	APError	;
	String 	APErrorTraceLocal	;
	String 	APRejectReason	;

	//Settlement Business Values

	String 	SBA_ACQ_ReconInstID	;
	String 	SBA_ACQ_ProcessorGroupID	;
	String 	SBA_ACQ_ProcessorID	;
	String 	SBA_ACQ_ReportingLevelID	;
	String 	SBA_ACQ_MerchantTierID	;
	String 	SBA_ISS_ReconInstID	;
	String 	SBA_ISS_ProcessorGroupID	;
	String 	SBA_ISS_ProcessorID	;

	//Cross Border Fees

	//Unique Transaction Data
	String 	UTA_DynamicCVVResult	;
	String 	UTA_ATCResults	;
	String 	UTA_CVV2_CVC2Result	;
	String 	UTA_Track1_NameMatching	;
	String 	UTA_CVV1_CVC1Result	;
	String 	UTA_AVSResult	;

	//Fee 1 Information

	String 	F1_ACQ_ReconAmount	;
	String 	F1_ACQ_ReconCurrency	;
	String 	F1_ACQ_ConversionRate	;
	String 	F1_ISS_ReconAmount	;
	String 	F1_ISS_ReconCurrency	;
	String 	F1_ISS_ConversionRate	;
	String 	F1_Amount	;
	String 	F1_Currency	;
	String 	F1_Type	;
	String 	F1_Indicator	;
	String 	F1_Memo	;
	String 	F1_NetworkReconAmount	;


	//Fee 2 Information
	String 	F2_ACQ_ReconAmount	;
	String 	F2_ACQ_ReconCurrency	;
	String 	F2_ACQ_ConversionRate	;
	String 	F2_ISS_ReconAmount	;
	String 	F2_ISS_ReconCurrency	;
	String 	F2_ISS_ConversionRate	;
	String 	F2_Amount	;
	String 	F2_Currency	;
	String 	F2_Type	;
	String 	F2_Indicator	;
	String 	F2_Memo	;
	String 	F2_NetworkReconAmount	;

	//Fee 3 Information
	String 	F3_ACQ_ReconAmount	;
	String 	F3_ACQ_ReconCurrency	;
	String 	F3_ACQ_ConversionRate	;
	String 	F3_ISS_ReconAmount	;
	String 	F3_ISS_ReconCurrency	;
	String 	F3_ISS_ConversionRate	;
	String 	F3_Amount	;
	String 	F3_Currency	;
	String 	F3_Type	;
	String 	F3_Indicator	;
	String 	F3_Memo	;
	String 	F3_NetworkReconAmount	;

	//Milestone Time Information
	String 	TimeSpentRqstSwitch	;
	String 	TimeSpentRespSwitch	;
	String 	TimeSpentIssuer	;
	String 	TimeSpentRqstQueued	;
	String 	TimeSpentRespQueued	;
	String 	TimeSpentAP	;

	//Canister Management
	String MediaType;
	String 	Denomination_C1	;
	String 	Denomination_C2	;
	String 	Denomination_C3	;
	String 	Denomination_C4	;
	String 	Denomination_C5	;
	String 	Denomination_C6	;
	String 	Denomination_C7	;
	String 	Denomination_C8	;
	String 	Original_Items_C1	;
	String 	Original_Items_C2	;
	String 	Original_Items_C3	;
	String 	Original_Items_C4	;
	String 	Original_Items_C5	;
	String 	Original_Items_C6	;
	String 	Original_Items_C7	;
	String 	Original_Items_C8	;
	String 	Dispensed_C1	;
	String 	Dispensed_C2	;
	String 	Dispensed_C3	;
	String 	Dispensed_C4	;
	String 	Dispensed_C5	;
	String 	Dispensed_C6	;
	String 	Dispensed_C7	;
	String 	Dispensed_C8	;


	public String getTAI_Present_L() {
		return TAI_Present_L;
	}

	public void setTAI_Present_L(String tAI_Present_L) {
		TAI_Present_L = tAI_Present_L;
	}

	public String getTAI_Capture_Capability() {
		return TAI_Capture_Capability;
	}

	public void setTAI_Capture_Capability(String tAI_Capture_Capability) {
		TAI_Capture_Capability = tAI_Capture_Capability;
	}

	public String getTAI_Input_Capability() {
		return TAI_Input_Capability;
	}

	public void setTAI_Input_Capability(String tAI_Input_Capability) {
		TAI_Input_Capability = tAI_Input_Capability;
	}

	public String getTAI_Input_Mode() {
		return TAI_Input_Mode;
	}

	public void setTAI_Input_Mode(String tAI_Input_Mode) {
		TAI_Input_Mode = tAI_Input_Mode;
	}

	public String getTAI_Output_Capability() {
		return TAI_Output_Capability;
	}

	public void setTAI_Output_Capability(String tAI_Output_Capability) {
		TAI_Output_Capability = tAI_Output_Capability;
	}

	public String getTAI_PIN_Capture_Capability() {
		return TAI_PIN_Capture_Capability;
	}

	public void setTAI_PIN_Capture_Capability(String tAI_PIN_Capture_Capability) {
		TAI_PIN_Capture_Capability = tAI_PIN_Capture_Capability;
	}

	public String getTAI_Present_R() {
		return TAI_Present_R;
	}

	public void setTAI_Present_R(String tAI_Present_R) {
		TAI_Present_R = tAI_Present_R;
	}

	public String getTAI_Authentication_Capability() {
		return TAI_Authentication_Capability;
	}

	public void setTAI_Authentication_Capability(String tAI_Authentication_Capability) {
		TAI_Authentication_Capability = tAI_Authentication_Capability;
	}

	public String getTAI_Authentication_Entity() {
		return TAI_Authentication_Entity;
	}

	public void setTAI_Authentication_Entity(String tAI_Authentication_Entity) {
		TAI_Authentication_Entity = tAI_Authentication_Entity;
	}

	public String getTAI_Authentication_Method() {
		return TAI_Authentication_Method;
	}

	public void setTAI_Authentication_Method(String tAI_Authentication_Method) {
		TAI_Authentication_Method = tAI_Authentication_Method;
	}

	public String getTAI_TerminalOutput_Capability() {
		return TAI_TerminalOutput_Capability;
	}

	public void setTAI_TerminalOutput_Capability(String tAI_TerminalOutput_Capability) {
		TAI_TerminalOutput_Capability = tAI_TerminalOutput_Capability;
	}

	public String getTAI_Operating_Environment() {
		return TAI_Operating_Environment;
	}

	public void setTAI_Operating_Environment(String tAI_Operating_Environment) {
		TAI_Operating_Environment = tAI_Operating_Environment;
	}

	public String getCII_AccountQualifier1() {
		return CII_AccountQualifier1;
	}

	public void setCII_AccountQualifier1(String cII_AccountQualifier1) {
		CII_AccountQualifier1 = cII_AccountQualifier1;
	}

	public String getCII_AccountQualifier2() {
		return CII_AccountQualifier2;
	}

	public void setCII_AccountQualifier2(String cII_AccountQualifier2) {
		CII_AccountQualifier2 = cII_AccountQualifier2;
	}

	public String getCII_MessageTypeIdentifier() {
		return CII_MessageTypeIdentifier;
	}

	public void setCII_MessageTypeIdentifier(String cII_MessageTypeIdentifier) {
		CII_MessageTypeIdentifier = cII_MessageTypeIdentifier;
	}

	public String getCII_FinancialType() {
		return CII_FinancialType;
	}

	public void setCII_FinancialType(String cII_FinancialType) {
		CII_FinancialType = cII_FinancialType;
	}

	public String getCII_CardType() {
		return CII_CardType;
	}

	public void setCII_CardType(String cII_CardType) {
		CII_CardType = cII_CardType;
	}

	public String getCII_CardOwnerID() {
		return CII_CardOwnerID;
	}

	public void setCII_CardOwnerID(String cII_CardOwnerID) {
		CII_CardOwnerID = cII_CardOwnerID;
	}

	public String getCII_ServiceCode() {
		return CII_ServiceCode;
	}

	public void setCII_ServiceCode(String cII_ServiceCode) {
		CII_ServiceCode = cII_ServiceCode;
	}

	public String getCII_ProgramID() {
		return CII_ProgramID;
	}

	public void setCII_ProgramID(String cII_ProgramID) {
		CII_ProgramID = cII_ProgramID;
	}

	public String getFI_HostReceived() {
		return FI_HostReceived;
	}

	public void setFI_HostReceived(String fI_HostReceived) {
		FI_HostReceived = fI_HostReceived;
	}

	public String getFI_HostSent() {
		return FI_HostSent;
	}

	public void setFI_HostSent(String fI_HostSent) {
		FI_HostSent = fI_HostSent;
	}

	public String getFI_APFlag() {
		return FI_APFlag;
	}

	public void setFI_APFlag(String fI_APFlag) {
		FI_APFlag = fI_APFlag;
	}

	public String getFI_ReversedBy() {
		return FI_ReversedBy;
	}

	public void setFI_ReversedBy(String fI_ReversedBy) {
		FI_ReversedBy = fI_ReversedBy;
	}

	public String getFI_PlatformProductID() {
		return FI_PlatformProductID;
	}

	public void setFI_PlatformProductID(String fI_PlatformProductID) {
		FI_PlatformProductID = fI_PlatformProductID;
	}

	public String getFI_OARRequest() {
		return FI_OARRequest;
	}

	public void setFI_OARRequest(String fI_OARRequest) {
		FI_OARRequest = fI_OARRequest;
	}

	public String getFI_CardAcceptorNameLocation_Formatted() {
		return FI_CardAcceptorNameLocation_Formatted;
	}

	public void setFI_CardAcceptorNameLocation_Formatted(String fI_CardAcceptorNameLocation_Formatted) {
		FI_CardAcceptorNameLocation_Formatted = fI_CardAcceptorNameLocation_Formatted;
	}

	public String getAF_PinDataFormat() {
		return AF_PinDataFormat;
	}

	public void setAF_PinDataFormat(String aF_PinDataFormat) {
		AF_PinDataFormat = aF_PinDataFormat;
	}

	public String getAF_PINResults() {
		return AF_PINResults;
	}

	public void setAF_PINResults(String aF_PINResults) {
		AF_PINResults = aF_PINResults;
	}

	public String getAF_PMCError() {
		return AF_PMCError;
	}

	public void setAF_PMCError(String aF_PMCError) {
		AF_PMCError = aF_PMCError;
	}

	public String getAF_StandinOption() {
		return AF_StandinOption;
	}

	public void setAF_StandinOption(String aF_StandinOption) {
		AF_StandinOption = aF_StandinOption;
	}

	public String getAF_StandinAction() {
		return AF_StandinAction;
	}

	public void setAF_StandinAction(String aF_StandinAction) {
		AF_StandinAction = aF_StandinAction;
	}

	public String getAPApprovalCode() {
		return APApprovalCode;
	}

	public void setAPApprovalCode(String aPApprovalCode) {
		APApprovalCode = aPApprovalCode;
	}

	public String getAPCardGroup() {
		return APCardGroup;
	}

	public void setAPCardGroup(String aPCardGroup) {
		APCardGroup = aPCardGroup;
	}

	public String getAPData() {
		return APData;
	}

	public void setAPData(String aPData) {
		APData = aPData;
	}

	public String getAPError() {
		return APError;
	}

	public void setAPError(String aPError) {
		APError = aPError;
	}

	public String getAPErrorTraceLocal() {
		return APErrorTraceLocal;
	}

	public void setAPErrorTraceLocal(String aPErrorTraceLocal) {
		APErrorTraceLocal = aPErrorTraceLocal;
	}

	public String getAPRejectReason() {
		return APRejectReason;
	}

	public void setAPRejectReason(String aPRejectReason) {
		APRejectReason = aPRejectReason;
	}

	public String getSBA_ACQ_ReconInstID() {
		return SBA_ACQ_ReconInstID;
	}

	public void setSBA_ACQ_ReconInstID(String sBA_ACQ_ReconInstID) {
		SBA_ACQ_ReconInstID = sBA_ACQ_ReconInstID;
	}

	public String getSBA_ACQ_ProcessorGroupID() {
		return SBA_ACQ_ProcessorGroupID;
	}

	public void setSBA_ACQ_ProcessorGroupID(String sBA_ACQ_ProcessorGroupID) {
		SBA_ACQ_ProcessorGroupID = sBA_ACQ_ProcessorGroupID;
	}

	public String getSBA_ACQ_ProcessorID() {
		return SBA_ACQ_ProcessorID;
	}

	public void setSBA_ACQ_ProcessorID(String sBA_ACQ_ProcessorID) {
		SBA_ACQ_ProcessorID = sBA_ACQ_ProcessorID;
	}

	public String getSBA_ACQ_ReportingLevelID() {
		return SBA_ACQ_ReportingLevelID;
	}

	public void setSBA_ACQ_ReportingLevelID(String sBA_ACQ_ReportingLevelID) {
		SBA_ACQ_ReportingLevelID = sBA_ACQ_ReportingLevelID;
	}

	public String getSBA_ACQ_MerchantTierID() {
		return SBA_ACQ_MerchantTierID;
	}

	public void setSBA_ACQ_MerchantTierID(String sBA_ACQ_MerchantTierID) {
		SBA_ACQ_MerchantTierID = sBA_ACQ_MerchantTierID;
	}

	public String getSBA_ISS_ReconInstID() {
		return SBA_ISS_ReconInstID;
	}

	public void setSBA_ISS_ReconInstID(String sBA_ISS_ReconInstID) {
		SBA_ISS_ReconInstID = sBA_ISS_ReconInstID;
	}

	public String getSBA_ISS_ProcessorGroupID() {
		return SBA_ISS_ProcessorGroupID;
	}

	public void setSBA_ISS_ProcessorGroupID(String sBA_ISS_ProcessorGroupID) {
		SBA_ISS_ProcessorGroupID = sBA_ISS_ProcessorGroupID;
	}

	public String getSBA_ISS_ProcessorID() {
		return SBA_ISS_ProcessorID;
	}

	public void setSBA_ISS_ProcessorID(String sBA_ISS_ProcessorID) {
		SBA_ISS_ProcessorID = sBA_ISS_ProcessorID;
	}

	public String getUTA_DynamicCVVResult() {
		return UTA_DynamicCVVResult;
	}

	public void setUTA_DynamicCVVResult(String uTA_DynamicCVVResult) {
		UTA_DynamicCVVResult = uTA_DynamicCVVResult;
	}

	public String getUTA_ATCResults() {
		return UTA_ATCResults;
	}

	public void setUTA_ATCResults(String uTA_ATCResults) {
		UTA_ATCResults = uTA_ATCResults;
	}

	public String getUTA_CVV2_CVC2Result() {
		return UTA_CVV2_CVC2Result;
	}

	public void setUTA_CVV2_CVC2Result(String uTA_CVV2_CVC2Result) {
		UTA_CVV2_CVC2Result = uTA_CVV2_CVC2Result;
	}

	public String getUTA_Track1_NameMatching() {
		return UTA_Track1_NameMatching;
	}

	public void setUTA_Track1_NameMatching(String uTA_Track1_NameMatching) {
		UTA_Track1_NameMatching = uTA_Track1_NameMatching;
	}

	public String getUTA_CVV1_CVC1Result() {
		return UTA_CVV1_CVC1Result;
	}

	public void setUTA_CVV1_CVC1Result(String uTA_CVV1_CVC1Result) {
		UTA_CVV1_CVC1Result = uTA_CVV1_CVC1Result;
	}

	public String getUTA_AVSResult() {
		return UTA_AVSResult;
	}

	public void setUTA_AVSResult(String uTA_AVSResult) {
		UTA_AVSResult = uTA_AVSResult;
	}

	public String getF1_ACQ_ReconAmount() {
		return F1_ACQ_ReconAmount;
	}

	public void setF1_ACQ_ReconAmount(String f1_ACQ_ReconAmount) {
		F1_ACQ_ReconAmount = f1_ACQ_ReconAmount;
	}

	public String getF1_ACQ_ReconCurrency() {
		return F1_ACQ_ReconCurrency;
	}

	public void setF1_ACQ_ReconCurrency(String f1_ACQ_ReconCurrency) {
		F1_ACQ_ReconCurrency = f1_ACQ_ReconCurrency;
	}

	public String getF1_ACQ_ConversionRate() {
		return F1_ACQ_ConversionRate;
	}

	public void setF1_ACQ_ConversionRate(String f1_ACQ_ConversionRate) {
		F1_ACQ_ConversionRate = f1_ACQ_ConversionRate;
	}

	public String getF1_ISS_ReconAmount() {
		return F1_ISS_ReconAmount;
	}

	public void setF1_ISS_ReconAmount(String f1_ISS_ReconAmount) {
		F1_ISS_ReconAmount = f1_ISS_ReconAmount;
	}

	public String getF1_ISS_ReconCurrency() {
		return F1_ISS_ReconCurrency;
	}

	public void setF1_ISS_ReconCurrency(String f1_ISS_ReconCurrency) {
		F1_ISS_ReconCurrency = f1_ISS_ReconCurrency;
	}

	public String getF1_ISS_ConversionRate() {
		return F1_ISS_ConversionRate;
	}

	public void setF1_ISS_ConversionRate(String f1_ISS_ConversionRate) {
		F1_ISS_ConversionRate = f1_ISS_ConversionRate;
	}

	public String getF1_Amount() {
		return F1_Amount;
	}

	public void setF1_Amount(String f1_Amount) {
		F1_Amount = f1_Amount;
	}

	public String getF1_Currency() {
		return F1_Currency;
	}

	public void setF1_Currency(String f1_Currency) {
		F1_Currency = f1_Currency;
	}

	public String getF1_Type() {
		return F1_Type;
	}

	public void setF1_Type(String f1_Type) {
		F1_Type = f1_Type;
	}

	public String getF1_Indicator() {
		return F1_Indicator;
	}

	public void setF1_Indicator(String f1_Indicator) {
		F1_Indicator = f1_Indicator;
	}

	public String getF1_Memo() {
		return F1_Memo;
	}

	public void setF1_Memo(String f1_Memo) {
		F1_Memo = f1_Memo;
	}

	public String getF1_NetworkReconAmount() {
		return F1_NetworkReconAmount;
	}

	public void setF1_NetworkReconAmount(String f1_NetworkReconAmount) {
		F1_NetworkReconAmount = f1_NetworkReconAmount;
	}

	public String getF2_ACQ_ReconAmount() {
		return F2_ACQ_ReconAmount;
	}

	public void setF2_ACQ_ReconAmount(String f2_ACQ_ReconAmount) {
		F2_ACQ_ReconAmount = f2_ACQ_ReconAmount;
	}

	public String getF2_ACQ_ReconCurrency() {
		return F2_ACQ_ReconCurrency;
	}

	public void setF2_ACQ_ReconCurrency(String f2_ACQ_ReconCurrency) {
		F2_ACQ_ReconCurrency = f2_ACQ_ReconCurrency;
	}

	public String getF2_ACQ_ConversionRate() {
		return F2_ACQ_ConversionRate;
	}

	public void setF2_ACQ_ConversionRate(String f2_ACQ_ConversionRate) {
		F2_ACQ_ConversionRate = f2_ACQ_ConversionRate;
	}

	public String getF2_ISS_ReconAmount() {
		return F2_ISS_ReconAmount;
	}

	public void setF2_ISS_ReconAmount(String f2_ISS_ReconAmount) {
		F2_ISS_ReconAmount = f2_ISS_ReconAmount;
	}

	public String getF2_ISS_ReconCurrency() {
		return F2_ISS_ReconCurrency;
	}

	public void setF2_ISS_ReconCurrency(String f2_ISS_ReconCurrency) {
		F2_ISS_ReconCurrency = f2_ISS_ReconCurrency;
	}

	public String getF2_ISS_ConversionRate() {
		return F2_ISS_ConversionRate;
	}

	public void setF2_ISS_ConversionRate(String f2_ISS_ConversionRate) {
		F2_ISS_ConversionRate = f2_ISS_ConversionRate;
	}

	public String getF2_Amount() {
		return F2_Amount;
	}

	public void setF2_Amount(String f2_Amount) {
		F2_Amount = f2_Amount;
	}

	public String getF2_Currency() {
		return F2_Currency;
	}

	public void setF2_Currency(String f2_Currency) {
		F2_Currency = f2_Currency;
	}

	public String getF2_Type() {
		return F2_Type;
	}

	public void setF2_Type(String f2_Type) {
		F2_Type = f2_Type;
	}

	public String getF2_Indicator() {
		return F2_Indicator;
	}

	public void setF2_Indicator(String f2_Indicator) {
		F2_Indicator = f2_Indicator;
	}

	public String getF2_Memo() {
		return F2_Memo;
	}

	public void setF2_Memo(String f2_Memo) {
		F2_Memo = f2_Memo;
	}

	public String getF2_NetworkReconAmount() {
		return F2_NetworkReconAmount;
	}

	public void setF2_NetworkReconAmount(String f2_NetworkReconAmount) {
		F2_NetworkReconAmount = f2_NetworkReconAmount;
	}

	public String getF3_ACQ_ReconAmount() {
		return F3_ACQ_ReconAmount;
	}

	public void setF3_ACQ_ReconAmount(String f3_ACQ_ReconAmount) {
		F3_ACQ_ReconAmount = f3_ACQ_ReconAmount;
	}

	public String getF3_ACQ_ReconCurrency() {
		return F3_ACQ_ReconCurrency;
	}

	public void setF3_ACQ_ReconCurrency(String f3_ACQ_ReconCurrency) {
		F3_ACQ_ReconCurrency = f3_ACQ_ReconCurrency;
	}

	public String getF3_ACQ_ConversionRate() {
		return F3_ACQ_ConversionRate;
	}

	public void setF3_ACQ_ConversionRate(String f3_ACQ_ConversionRate) {
		F3_ACQ_ConversionRate = f3_ACQ_ConversionRate;
	}

	public String getF3_ISS_ReconAmount() {
		return F3_ISS_ReconAmount;
	}

	public void setF3_ISS_ReconAmount(String f3_ISS_ReconAmount) {
		F3_ISS_ReconAmount = f3_ISS_ReconAmount;
	}

	public String getF3_ISS_ReconCurrency() {
		return F3_ISS_ReconCurrency;
	}

	public void setF3_ISS_ReconCurrency(String f3_ISS_ReconCurrency) {
		F3_ISS_ReconCurrency = f3_ISS_ReconCurrency;
	}

	public String getF3_ISS_ConversionRate() {
		return F3_ISS_ConversionRate;
	}

	public void setF3_ISS_ConversionRate(String f3_ISS_ConversionRate) {
		F3_ISS_ConversionRate = f3_ISS_ConversionRate;
	}

	public String getF3_Amount() {
		return F3_Amount;
	}

	public void setF3_Amount(String f3_Amount) {
		F3_Amount = f3_Amount;
	}

	public String getF3_Currency() {
		return F3_Currency;
	}

	public void setF3_Currency(String f3_Currency) {
		F3_Currency = f3_Currency;
	}

	public String getF3_Type() {
		return F3_Type;
	}

	public void setF3_Type(String f3_Type) {
		F3_Type = f3_Type;
	}

	public String getF3_Indicator() {
		return F3_Indicator;
	}

	public void setF3_Indicator(String f3_Indicator) {
		F3_Indicator = f3_Indicator;
	}

	public String getF3_Memo() {
		return F3_Memo;
	}

	public void setF3_Memo(String f3_Memo) {
		F3_Memo = f3_Memo;
	}

	public String getF3_NetworkReconAmount() {
		return F3_NetworkReconAmount;
	}

	public void setF3_NetworkReconAmount(String f3_NetworkReconAmount) {
		F3_NetworkReconAmount = f3_NetworkReconAmount;
	}

	public String getTimeSpentRqstSwitch() {
		return TimeSpentRqstSwitch;
	}

	public void setTimeSpentRqstSwitch(String timeSpentRqstSwitch) {
		TimeSpentRqstSwitch = timeSpentRqstSwitch;
	}

	public String getTimeSpentRespSwitch() {
		return TimeSpentRespSwitch;
	}

	public void setTimeSpentRespSwitch(String timeSpentRespSwitch) {
		TimeSpentRespSwitch = timeSpentRespSwitch;
	}

	public String getTimeSpentIssuer() {
		return TimeSpentIssuer;
	}

	public void setTimeSpentIssuer(String timeSpentIssuer) {
		TimeSpentIssuer = timeSpentIssuer;
	}

	public String getTimeSpentRqstQueued() {
		return TimeSpentRqstQueued;
	}

	public void setTimeSpentRqstQueued(String timeSpentRqstQueued) {
		TimeSpentRqstQueued = timeSpentRqstQueued;
	}

	public String getTimeSpentRespQueued() {
		return TimeSpentRespQueued;
	}

	public void setTimeSpentRespQueued(String timeSpentRespQueued) {
		TimeSpentRespQueued = timeSpentRespQueued;
	}

	public String getTimeSpentAP() {
		return TimeSpentAP;
	}

	public void setTimeSpentAP(String timeSpentAP) {
		TimeSpentAP = timeSpentAP;
	}

	public String getMediaType() {
		return MediaType;
	}

	public void setMediaType(String mediaType) {
		MediaType = mediaType;
	}

	public String getDenomination_C1() {
		return Denomination_C1;
	}

	public void setDenomination_C1(String denomination_C1) {
		Denomination_C1 = denomination_C1;
	}

	public String getDenomination_C2() {
		return Denomination_C2;
	}

	public void setDenomination_C2(String denomination_C2) {
		Denomination_C2 = denomination_C2;
	}

	public String getDenomination_C3() {
		return Denomination_C3;
	}

	public void setDenomination_C3(String denomination_C3) {
		Denomination_C3 = denomination_C3;
	}

	public String getDenomination_C4() {
		return Denomination_C4;
	}

	public void setDenomination_C4(String denomination_C4) {
		Denomination_C4 = denomination_C4;
	}

	public String getDenomination_C5() {
		return Denomination_C5;
	}

	public void setDenomination_C5(String denomination_C5) {
		Denomination_C5 = denomination_C5;
	}

	public String getDenomination_C6() {
		return Denomination_C6;
	}

	public void setDenomination_C6(String denomination_C6) {
		Denomination_C6 = denomination_C6;
	}

	public String getDenomination_C7() {
		return Denomination_C7;
	}

	public void setDenomination_C7(String denomination_C7) {
		Denomination_C7 = denomination_C7;
	}

	public String getDenomination_C8() {
		return Denomination_C8;
	}

	public void setDenomination_C8(String denomination_C8) {
		Denomination_C8 = denomination_C8;
	}

	public String getOriginal_Items_C1() {
		return Original_Items_C1;
	}

	public void setOriginal_Items_C1(String original_Items_C1) {
		Original_Items_C1 = original_Items_C1;
	}

	public String getOriginal_Items_C2() {
		return Original_Items_C2;
	}

	public void setOriginal_Items_C2(String original_Items_C2) {
		Original_Items_C2 = original_Items_C2;
	}

	public String getOriginal_Items_C3() {
		return Original_Items_C3;
	}

	public void setOriginal_Items_C3(String original_Items_C3) {
		Original_Items_C3 = original_Items_C3;
	}

	public String getOriginal_Items_C4() {
		return Original_Items_C4;
	}

	public void setOriginal_Items_C4(String original_Items_C4) {
		Original_Items_C4 = original_Items_C4;
	}

	public String getOriginal_Items_C5() {
		return Original_Items_C5;
	}

	public void setOriginal_Items_C5(String original_Items_C5) {
		Original_Items_C5 = original_Items_C5;
	}

	public String getOriginal_Items_C6() {
		return Original_Items_C6;
	}

	public void setOriginal_Items_C6(String original_Items_C6) {
		Original_Items_C6 = original_Items_C6;
	}

	public String getOriginal_Items_C7() {
		return Original_Items_C7;
	}

	public void setOriginal_Items_C7(String original_Items_C7) {
		Original_Items_C7 = original_Items_C7;
	}

	public String getOriginal_Items_C8() {
		return Original_Items_C8;
	}

	public void setOriginal_Items_C8(String original_Items_C8) {
		Original_Items_C8 = original_Items_C8;
	}

	public String getDispensed_C1() {
		return Dispensed_C1;
	}

	public void setDispensed_C1(String dispensed_C1) {
		Dispensed_C1 = dispensed_C1;
	}

	public String getDispensed_C2() {
		return Dispensed_C2;
	}

	public void setDispensed_C2(String dispensed_C2) {
		Dispensed_C2 = dispensed_C2;
	}

	public String getDispensed_C3() {
		return Dispensed_C3;
	}

	public void setDispensed_C3(String dispensed_C3) {
		Dispensed_C3 = dispensed_C3;
	}

	public String getDispensed_C4() {
		return Dispensed_C4;
	}

	public void setDispensed_C4(String dispensed_C4) {
		Dispensed_C4 = dispensed_C4;
	}

	public String getDispensed_C5() {
		return Dispensed_C5;
	}

	public void setDispensed_C5(String dispensed_C5) {
		Dispensed_C5 = dispensed_C5;
	}

	public String getDispensed_C6() {
		return Dispensed_C6;
	}

	public void setDispensed_C6(String dispensed_C6) {
		Dispensed_C6 = dispensed_C6;
	}

	public String getDispensed_C7() {
		return Dispensed_C7;
	}

	public void setDispensed_C7(String dispensed_C7) {
		Dispensed_C7 = dispensed_C7;
	}

	public String getDispensed_C8() {
		return Dispensed_C8;
	}

	public void setDispensed_C8(String dispensed_C8) {
		Dispensed_C8 = dispensed_C8;
	}

	public String getCARDHOLDER_INFO() {
		return CARDHOLDER_INFO;
	}

	public void setCARDHOLDER_INFO(String cARDHOLDER_INFO) {
		CARDHOLDER_INFO = cARDHOLDER_INFO;
	}

	public String getADL_RESP_DATA_PreLongData() {
		return ADL_RESP_DATA_PreLongData;
	}

	public void setADL_RESP_DATA_PreLongData(String aDL_RESP_DATA_PreLongData) {
		ADL_RESP_DATA_PreLongData = aDL_RESP_DATA_PreLongData;
	}	


	public String getREF_DATA_ACQ_PreLongData() {
		return REF_DATA_ACQ_PreLongData;
	}

	public void setREF_DATA_ACQ_PreLongData(String rEF_DATA_ACQ_PreLongData) {
		REF_DATA_ACQ_PreLongData = rEF_DATA_ACQ_PreLongData;
	}

	public String getDATA_PRIV_ACQ_PreLongData() {
		return DATA_PRIV_ACQ_PreLongData;
	}

	public void setDATA_PRIV_ACQ_PreLongData(String dATA_PRIV_ACQ_PreLongData) {
		DATA_PRIV_ACQ_PreLongData = dATA_PRIV_ACQ_PreLongData;
	}

	public String getADL_DATA_PRIV_ACQ_PreLongData() {
		return ADL_DATA_PRIV_ACQ_PreLongData;
	}

	public void setADL_DATA_PRIV_ACQ_PreLongData(String aDL_DATA_PRIV_ACQ_PreLongData) {
		ADL_DATA_PRIV_ACQ_PreLongData = aDL_DATA_PRIV_ACQ_PreLongData;
	}

	public String getREF_DATA_ISS_PreLongData() {
		return REF_DATA_ISS_PreLongData;
	}

	public void setREF_DATA_ISS_PreLongData(String rEF_DATA_ISS_PreLongData) {
		REF_DATA_ISS_PreLongData = rEF_DATA_ISS_PreLongData;
	}

	public String getDATA_PRIV_ISS_PreLongData() {
		return DATA_PRIV_ISS_PreLongData;
	}

	public void setDATA_PRIV_ISS_PreLongData(String dATA_PRIV_ISS_PreLongData) {
		DATA_PRIV_ISS_PreLongData = dATA_PRIV_ISS_PreLongData;
	}

	public String getADL_DATA_PRIV_ISS_PreLongData() {
		return ADL_DATA_PRIV_ISS_PreLongData;
	}

	public void setADL_DATA_PRIV_ISS_PreLongData(String aDL_DATA_PRIV_ISS_PreLongData) {
		ADL_DATA_PRIV_ISS_PreLongData = aDL_DATA_PRIV_ISS_PreLongData;
	}

	public String getTRACK_2_DATA_PreLongData() {
		return TRACK_2_DATA_PreLongData;
	}

	public void setTRACK_2_DATA_PreLongData(String tRACK_2_DATA_PreLongData) {
		TRACK_2_DATA_PreLongData = tRACK_2_DATA_PreLongData;
	}

	public String getTRAN_UNIQUE_DATA_PreLongData() {
		return TRAN_UNIQUE_DATA_PreLongData;
	}

	public void setTRAN_UNIQUE_DATA_PreLongData(String tRAN_UNIQUE_DATA_PreLongData) {
		TRAN_UNIQUE_DATA_PreLongData = tRAN_UNIQUE_DATA_PreLongData;
	}

	public String getTRAN_DESC_PreLongData() {
		return TRAN_DESC_PreLongData;
	}

	public void setTRAN_DESC_PreLongData(String tRAN_DESC_PreLongData) {
		TRAN_DESC_PreLongData = tRAN_DESC_PreLongData;
	}

	public String getUNFORMATTED_MICR_DATA_PreLongData() {
		return UNFORMATTED_MICR_DATA_PreLongData;
	}

	public void setUNFORMATTED_MICR_DATA_PreLongData(String uNFORMATTED_MICR_DATA_PreLongData) {
		UNFORMATTED_MICR_DATA_PreLongData = uNFORMATTED_MICR_DATA_PreLongData;
	}

	public String getPAYEE_PreLongData() {
		return PAYEE_PreLongData;
	}

	public void setPAYEE_PreLongData(String pAYEE_PreLongData) {
		PAYEE_PreLongData = pAYEE_PreLongData;
	}










	public String getCVV2AcquirerResult() {
		return CVV2AcquirerResult;
	}

	public void setCVV2AcquirerResult(String cVV2AcquirerResult) {
		CVV2AcquirerResult = cVV2AcquirerResult;
	}

	public String getWHTTaxCon() {
		return WHTTaxCon;
	}

	public void setWHTTaxCon(String wHTTaxCon) {
		WHTTaxCon = wHTTaxCon;
	}

	public String getWHTTax() {
		return WHTTax;
	}

	public void setWHTTax(String wHTTax) {
		WHTTax = wHTTax;
	}









	public String getToAcct_Owner_Branch() {
		return ToAcct_Owner_Branch;
	}

	public void setToAcct_Owner_Branch(String toAcct_Owner_Branch) {
		ToAcct_Owner_Branch = toAcct_Owner_Branch;
	}

	public String getTerminal_State() {
		return Terminal_State;
	}

	public void setTerminal_State(String terminal_State) {
		Terminal_State = terminal_State;
	}

	public String getTerminal_Provice_RegionID() {
		return Terminal_Provice_RegionID;
	}

	public void setTerminal_Provice_RegionID(String terminal_Provice_RegionID) {
		Terminal_Provice_RegionID = terminal_Provice_RegionID;
	}

	public String getTerminal_Owner_BranchCode() {
		return Terminal_Owner_BranchCode;
	}

	public void setTerminal_Owner_BranchCode(String terminal_Owner_BranchCode) {
		Terminal_Owner_BranchCode = terminal_Owner_BranchCode;
	}

	public String getPartial_Reverse_Amount() {
		return Partial_Reverse_Amount;
	}

	public void setPartial_Reverse_Amount(String partial_Reverse_Amount) {
		Partial_Reverse_Amount = partial_Reverse_Amount;
	}

	public String getOth_Bank_Use_Counter() {
		return Oth_Bank_Use_Counter;
	}

	public void setOth_Bank_Use_Counter(String oth_Bank_Use_Counter) {
		Oth_Bank_Use_Counter = oth_Bank_Use_Counter;
	}

	public String getOriginal_Terminal_Owner() {
		return Original_Terminal_Owner;
	}

	public void setOriginal_Terminal_Owner(String original_Terminal_Owner) {
		Original_Terminal_Owner = original_Terminal_Owner;
	}

	public String getOriginal_Card_Owner() {
		return Original_Card_Owner;
	}

	public void setOriginal_Card_Owner(String original_Card_Owner) {
		Original_Card_Owner = original_Card_Owner;
	}

	public String getIR_Flag() {
		return IR_Flag;
	}

	public void setIR_Flag(String iR_Flag) {
		IR_Flag = iR_Flag;
	}

	public String getIR_Counter() {
		return IR_Counter;
	}

	public void setIR_Counter(String iR_Counter) {
		IR_Counter = iR_Counter;
	}

	public String getFrAcct_Owner_Branch() {
		return FrAcct_Owner_Branch;
	}

	public void setFrAcct_Owner_Branch(String frAcct_Owner_Branch) {
		FrAcct_Owner_Branch = frAcct_Owner_Branch;
	}

	public String getDeviceTypeChannel() {
		return deviceTypeChannel;
	}

	public void setDeviceTypeChannel(String deviceTypeChannel) {
		this.deviceTypeChannel = deviceTypeChannel;
	}

	public String getDCC_Home_CCY_Name() {
		return DCC_Home_CCY_Name;
	}

	public void setDCC_Home_CCY_Name(String dCC_Home_CCY_Name) {
		DCC_Home_CCY_Name = dCC_Home_CCY_Name;
	}

	public String getBblATM_Terminal_ID() {
		return bblATM_Terminal_ID;
	}

	public void setBblATM_Terminal_ID(String bblATM_Terminal_ID) {
		this.bblATM_Terminal_ID = bblATM_Terminal_ID;
	}

	public String getATM_Terminal_ID() {
		return ATM_Terminal_ID;
	}

	public void setATM_Terminal_ID(String aTM_Terminal_ID) {
		ATM_Terminal_ID = aTM_Terminal_ID;
	}

	public String getAcqRoutingNo() {
		return AcqRoutingNo;
	}

	public void setAcqRoutingNo(String acqRoutingNo) {
		AcqRoutingNo = acqRoutingNo;
	}

	public String getIssRoutingNo() {
		return IssRoutingNo;
	}

	public void setIssRoutingNo(String issRoutingNo) {
		IssRoutingNo = issRoutingNo;
	}

	public String getTraRoutingNo() {
		return TraRoutingNo;
	}

	public void setTraRoutingNo(String traRoutingNo) {
		TraRoutingNo = traRoutingNo;
	}

	public String getDestRoutingNo() {
		return DestRoutingNo;
	}

	public void setDestRoutingNo(String destRoutingNo) {
		DestRoutingNo = destRoutingNo;
	}








	public String getCard_Owner_BranchCode() {
		return Card_Owner_BranchCode;
	}

	public void setCard_Owner_BranchCode(String card_Owner_BranchCode) {
		Card_Owner_BranchCode = card_Owner_BranchCode;
	}

	public String getCardBrand() {
		return cardBrand;
	}

	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}

	public String getUNIQUENESS_KEY() {
		return UNIQUENESS_KEY;
	}
	public void setUNIQUENESS_KEY(String uNIQUENESS_KEY) {
		UNIQUENESS_KEY = uNIQUENESS_KEY;
	}
	public String getTSTAMP_TRANS() {
		return TSTAMP_TRANS;
	}
	public void setTSTAMP_TRANS(String tSTAMP_TRANS) {
		TSTAMP_TRANS = tSTAMP_TRANS;
	}
	public String getRECV_PROXY_ID() {
		return RECV_PROXY_ID;
	}
	public void setRECV_PROXY_ID(String rECV_PROXY_ID) {
		RECV_PROXY_ID = rECV_PROXY_ID;
	}
	public String getSENDER_PROXY_ID() {
		return SENDER_PROXY_ID;
	}
	public void setSENDER_PROXY_ID(String sENDER_PROXY_ID) {
		SENDER_PROXY_ID = sENDER_PROXY_ID;
	}
	public String getRECV_PROXY_TYPE() {
		return RECV_PROXY_TYPE;
	}
	public void setRECV_PROXY_TYPE(String rECV_PROXY_TYPE) {
		RECV_PROXY_TYPE = rECV_PROXY_TYPE;
	}
	public String getSENDER_PROXY_TYPE() {
		return SENDER_PROXY_TYPE;
	}
	public void setSENDER_PROXY_TYPE(String sENDER_PROXY_TYPE) {
		SENDER_PROXY_TYPE = sENDER_PROXY_TYPE;
	}
	public String getSENDER_TAX_ID() {
		return SENDER_TAX_ID;
	}
	public void setSENDER_TAX_ID(String sENDER_TAX_ID) {
		SENDER_TAX_ID = sENDER_TAX_ID;
	}
	public String getRECV_TAX_ID() {
		return RECV_TAX_ID;
	}
	public void setRECV_TAX_ID(String rECV_TAX_ID) {
		RECV_TAX_ID = rECV_TAX_ID;
	}
	public String getVAT_RATE() {
		return VAT_RATE;
	}
	public void setVAT_RATE(String vAT_RATE) {
		VAT_RATE = vAT_RATE;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vAT) {
		VAT = vAT;
	}
	public String getWHT_TAX_RATE() {
		return WHT_TAX_RATE;
	}
	public void setWHT_TAX_RATE(String wHT_TAX_RATE) {
		WHT_TAX_RATE = wHT_TAX_RATE;
	}
	public String getWHT_TAX() {
		return WHT_TAX;
	}
	public void setWHT_TAX(String wHT_TAX) {
		WHT_TAX = wHT_TAX;
	}
	public String getWHT_TAX_COND() {
		return WHT_TAX_COND;
	}
	public void setWHT_TAX_COND(String wHT_TAX_COND) {
		WHT_TAX_COND = wHT_TAX_COND;
	}
	public String getSENDER_REF_NO() {
		return SENDER_REF_NO;
	}
	public void setSENDER_REF_NO(String sENDER_REF_NO) {
		SENDER_REF_NO = sENDER_REF_NO;
	}
	public String getTRAN_REF_NO() {
		return TRAN_REF_NO;
	}
	public void setTRAN_REF_NO(String tRAN_REF_NO) {
		TRAN_REF_NO = tRAN_REF_NO;
	}
	public String getREF_NO() {
		return REF_NO;
	}
	public void setREF_NO(String rEF_NO) {
		REF_NO = rEF_NO;
	}
	public String getBBL_REF_NO() {
		return BBL_REF_NO;
	}
	public void setBBL_REF_NO(String bBL_REF_NO) {
		BBL_REF_NO = bBL_REF_NO;
	}
	public String getFROM_ACCT_NAME() {
		return FROM_ACCT_NAME;
	}
	public void setFROM_ACCT_NAME(String fROM_ACCT_NAME) {
		FROM_ACCT_NAME = fROM_ACCT_NAME;
	}
	public String getTO_ACCT_NAME() {
		return TO_ACCT_NAME;
	}
	public void setTO_ACCT_NAME(String tO_ACCT_NAME) {
		TO_ACCT_NAME = tO_ACCT_NAME;
	}
	public String getTO_ACCT_DISP_NAME() {
		return TO_ACCT_DISP_NAME;
	}
	public void setTO_ACCT_DISP_NAME(String tO_ACCT_DISP_NAME) {
		TO_ACCT_DISP_NAME = tO_ACCT_DISP_NAME;
	}
	public String getBBL_FILLER_1() {
		return BBL_FILLER_1;
	}
	public void setBBL_FILLER_1(String bBL_FILLER_1) {
		BBL_FILLER_1 = bBL_FILLER_1;
	}
	public String getBBL_FILLER_2() {
		return BBL_FILLER_2;
	}
	public void setBBL_FILLER_2(String bBL_FILLER_2) {
		BBL_FILLER_2 = bBL_FILLER_2;
	}
	public String getTAX_INVOICE() {
		return TAX_INVOICE;
	}
	public void setTAX_INVOICE(String tAX_INVOICE) {
		TAX_INVOICE = tAX_INVOICE;
	}
	public String getTYPE_OF_INCOME() {
		return TYPE_OF_INCOME;
	}
	public void setTYPE_OF_INCOME(String tYPE_OF_INCOME) {
		TYPE_OF_INCOME = tYPE_OF_INCOME;
	}
	public String getEDC_NUMBER() {
		return EDC_NUMBER;
	}
	public void setEDC_NUMBER(String eDC_NUMBER) {
		EDC_NUMBER = eDC_NUMBER;
	}
	public String getPRODUCT_CODE() {
		return PRODUCT_CODE;
	}
	public void setPRODUCT_CODE(String pRODUCT_CODE) {
		PRODUCT_CODE = pRODUCT_CODE;
	}
	public String getSERV_TYPE_CODE() {
		return SERV_TYPE_CODE;
	}
	public void setSERV_TYPE_CODE(String sERV_TYPE_CODE) {
		SERV_TYPE_CODE = sERV_TYPE_CODE;
	}
	public String getBILL_REFERENCE() {
		return BILL_REFERENCE;
	}
	public void setBILL_REFERENCE(String bILL_REFERENCE) {
		BILL_REFERENCE = bILL_REFERENCE;
	}
	public String getBPDUE_RTPEXP_DATE() {
		return BPDUE_RTPEXP_DATE;
	}
	public void setBPDUE_RTPEXP_DATE(String bPDUE_RTPEXP_DATE) {
		BPDUE_RTPEXP_DATE = bPDUE_RTPEXP_DATE;
	}
	public String getCREDIT_NOTIF_REF() {
		return CREDIT_NOTIF_REF;
	}
	public void setCREDIT_NOTIF_REF(String cREDIT_NOTIF_REF) {
		CREDIT_NOTIF_REF = cREDIT_NOTIF_REF;
	}
	public String getBP_URL() {
		return BP_URL;
	}
	public void setBP_URL(String bP_URL) {
		BP_URL = bP_URL;
	}
	public String getSENDER_COMP_TAX_ID() {
		return SENDER_COMP_TAX_ID;
	}
	public void setSENDER_COMP_TAX_ID(String sENDER_COMP_TAX_ID) {
		SENDER_COMP_TAX_ID = sENDER_COMP_TAX_ID;
	}
	public String getSENDER_COMP_ACCT_NO() {
		return SENDER_COMP_ACCT_NO;
	}
	public void setSENDER_COMP_ACCT_NO(String sENDER_COMP_ACCT_NO) {
		SENDER_COMP_ACCT_NO = sENDER_COMP_ACCT_NO;
	}
	public String getRECV_COMP_TAX_ID() {
		return RECV_COMP_TAX_ID;
	}
	public void setRECV_COMP_TAX_ID(String rECV_COMP_TAX_ID) {
		RECV_COMP_TAX_ID = rECV_COMP_TAX_ID;
	}
	public String getRECV_COMP_ACCT_NO() {
		return RECV_COMP_ACCT_NO;
	}
	public void setRECV_COMP_ACCT_NO(String rECV_COMP_ACCT_NO) {
		RECV_COMP_ACCT_NO = rECV_COMP_ACCT_NO;
	}
	public String getCOMPANY_CODE() {
		return COMPANY_CODE;
	}
	public void setCOMPANY_CODE(String cOMPANY_CODE) {
		COMPANY_CODE = cOMPANY_CODE;
	}
	public String getSERVICE_CODE() {
		return SERVICE_CODE;
	}
	public void setSERVICE_CODE(String sERVICE_CODE) {
		SERVICE_CODE = sERVICE_CODE;
	}
	public String getFLAGS() {
		return FLAGS;
	}
	public void setFLAGS(String fLAGS) {
		FLAGS = fLAGS;
	}
	public String getBILL_REFERENCE2() {
		return BILL_REFERENCE2;
	}
	public void setBILL_REFERENCE2(String bILL_REFERENCE2) {
		BILL_REFERENCE2 = bILL_REFERENCE2;
	}
	public String getUSER_DATA_1() {
		return USER_DATA_1;
	}
	public void setUSER_DATA_1(String uSER_DATA_1) {
		USER_DATA_1 = uSER_DATA_1;
	}
	public String getUSER_DATA_2() {
		return USER_DATA_2;
	}
	public void setUSER_DATA_2(String uSER_DATA_2) {
		USER_DATA_2 = uSER_DATA_2;
	}
	public String getUSER_DATA_3() {
		return USER_DATA_3;
	}
	public void setUSER_DATA_3(String uSER_DATA_3) {
		USER_DATA_3 = uSER_DATA_3;
	}
	public String getUSER_DATA_4() {
		return USER_DATA_4;
	}
	public void setUSER_DATA_4(String uSER_DATA_4) {
		USER_DATA_4 = uSER_DATA_4;
	}
	public String getUSER_DATA_5() {
		return USER_DATA_5;
	}
	public void setUSER_DATA_5(String uSER_DATA_5) {
		USER_DATA_5 = uSER_DATA_5;
	}
	public String getPAYMENT_1() {
		return PAYMENT_1;
	}
	public void setPAYMENT_1(String pAYMENT_1) {
		PAYMENT_1 = pAYMENT_1;
	}
	public String getPAYMENT_2() {
		return PAYMENT_2;
	}
	public void setPAYMENT_2(String pAYMENT_2) {
		PAYMENT_2 = pAYMENT_2;
	}
	public String getPAYMENT_3() {
		return PAYMENT_3;
	}
	public void setPAYMENT_3(String pAYMENT_3) {
		PAYMENT_3 = pAYMENT_3;
	}
	public String getSMS_FEE() {
		return SMS_FEE;
	}
	public void setSMS_FEE(String sMS_FEE) {
		SMS_FEE = sMS_FEE;
	}
	public String getSMS_MOBILE() {
		return SMS_MOBILE;
	}
	public void setSMS_MOBILE(String sMS_MOBILE) {
		SMS_MOBILE = sMS_MOBILE;
	}
	public String getOTP() {
		return OTP;
	}
	public void setOTP(String oTP) {
		OTP = oTP;
	}
	public String getACCT_INFO_1() {
		return ACCT_INFO_1;
	}
	public void setACCT_INFO_1(String aCCT_INFO_1) {
		ACCT_INFO_1 = aCCT_INFO_1;
	}
	public String getACCT_INFO_2() {
		return ACCT_INFO_2;
	}
	public void setACCT_INFO_2(String aCCT_INFO_2) {
		ACCT_INFO_2 = aCCT_INFO_2;
	}
	public String getBBL_FILLER_3() {
		return BBL_FILLER_3;
	}
	public void setBBL_FILLER_3(String bBL_FILLER_3) {
		BBL_FILLER_3 = bBL_FILLER_3;
	}
	public String getFRM_FUND_CODE() {
		return FRM_FUND_CODE;
	}
	public void setFRM_FUND_CODE(String fRM_FUND_CODE) {
		FRM_FUND_CODE = fRM_FUND_CODE;
	}
	public String getTO_FUND_CODE() {
		return TO_FUND_CODE;
	}
	public void setTO_FUND_CODE(String tO_FUND_CODE) {
		TO_FUND_CODE = tO_FUND_CODE;
	}
	public String getUNIT() {
		return UNIT;
	}
	public void setUNIT(String uNIT) {
		UNIT = uNIT;
	}
	public String getUNIT_PRICE() {
		return UNIT_PRICE;
	}
	public void setUNIT_PRICE(String uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}
	public String getBOND_YIELD() {
		return BOND_YIELD;
	}
	public void setBOND_YIELD(String bOND_YIELD) {
		BOND_YIELD = bOND_YIELD;
	}
	public String getSURCHARGE_FEE() {
		return SURCHARGE_FEE;
	}
	public void setSURCHARGE_FEE(String sURCHARGE_FEE) {
		SURCHARGE_FEE = sURCHARGE_FEE;
	}
	public String getEXT_FROM_ACCT_TYPE() {
		return EXT_FROM_ACCT_TYPE;
	}
	public void setEXT_FROM_ACCT_TYPE(String eXT_FROM_ACCT_TYPE) {
		EXT_FROM_ACCT_TYPE = eXT_FROM_ACCT_TYPE;
	}
	public String getEXT_TO_ACCT_TYPE() {
		return EXT_TO_ACCT_TYPE;
	}
	public void setEXT_TO_ACCT_TYPE(String eXT_TO_ACCT_TYPE) {
		EXT_TO_ACCT_TYPE = eXT_TO_ACCT_TYPE;
	}
	public String getFROM_ACCT_DISP_NAME() {
		return FROM_ACCT_DISP_NAME;
	}
	public void setFROM_ACCT_DISP_NAME(String fROM_ACCT_DISP_NAME) {
		FROM_ACCT_DISP_NAME = fROM_ACCT_DISP_NAME;
	}
	public String getPRIVATE_DATA() {
		return PRIVATE_DATA;
	}
	public void setPRIVATE_DATA(String pRIVATE_DATA) {
		PRIVATE_DATA = pRIVATE_DATA;
	}
	public String getTERMINAL_TRACE() {
		return TERMINAL_TRACE;
	}
	public void setTERMINAL_TRACE(String tERMINAL_TRACE) {
		TERMINAL_TRACE = tERMINAL_TRACE;
	}
	public String getQRC_VOUCHER() {
		return QRC_VOUCHER;
	}
	public void setQRC_VOUCHER(String qRC_VOUCHER) {
		QRC_VOUCHER = qRC_VOUCHER;
	}
	public String getBBL_FILLER_4() {
		return BBL_FILLER_4;
	}
	public void setBBL_FILLER_4(String bBL_FILLER_4) {
		BBL_FILLER_4 = bBL_FILLER_4;
	}
	public String getCDM_DATA() {
		return CDM_DATA;
	}
	public void setCDM_DATA(String cDM_DATA) {
		CDM_DATA = cDM_DATA;
	}
	public String getBBL_FILLER_5() {
		return BBL_FILLER_5;
	}
	public void setBBL_FILLER_5(String bBL_FILLER_5) {
		BBL_FILLER_5 = bBL_FILLER_5;
	}
	public String getPOS_DATA() {
		return POS_DATA;
	}
	public void setPOS_DATA(String pOS_DATA) {
		POS_DATA = pOS_DATA;
	}
	public String getEMV_TSTAMP_TRANS() {
		return EMV_TSTAMP_TRANS;
	}
	public void setEMV_TSTAMP_TRANS(String eMV_TSTAMP_TRANS) {
		EMV_TSTAMP_TRANS = eMV_TSTAMP_TRANS;
	}
	public String getEMV_UNIQUENESS_KEY() {
		return EMV_UNIQUENESS_KEY;
	}
	public void setEMV_UNIQUENESS_KEY(String eMV_UNIQUENESS_KEY) {
		EMV_UNIQUENESS_KEY = eMV_UNIQUENESS_KEY;
	}
	public String getAMOUNT_OTHER() {
		return AMOUNT_OTHER;
	}
	public void setAMOUNT_OTHER(String aMOUNT_OTHER) {
		AMOUNT_OTHER = aMOUNT_OTHER;
	}
	public String getAPPL_CRYPTOGRAM() {
		return APPL_CRYPTOGRAM;
	}
	public void setAPPL_CRYPTOGRAM(String aPPL_CRYPTOGRAM) {
		APPL_CRYPTOGRAM = aPPL_CRYPTOGRAM;
	}
	public String getAPPL_INTRCHG_PROF() {
		return APPL_INTRCHG_PROF;
	}
	public void setAPPL_INTRCHG_PROF(String aPPL_INTRCHG_PROF) {
		APPL_INTRCHG_PROF = aPPL_INTRCHG_PROF;
	}
	public String getAPPL_TRAN_COUNTER() {
		return APPL_TRAN_COUNTER;
	}
	public void setAPPL_TRAN_COUNTER(String aPPL_TRAN_COUNTER) {
		APPL_TRAN_COUNTER = aPPL_TRAN_COUNTER;
	}
	public String getAPPL_VERSION_NO() {
		return APPL_VERSION_NO;
	}
	public void setAPPL_VERSION_NO(String aPPL_VERSION_NO) {
		APPL_VERSION_NO = aPPL_VERSION_NO;
	}
	public String getAPPL_ID() {
		return APPL_ID;
	}
	public void setAPPL_ID(String aPPL_ID) {
		APPL_ID = aPPL_ID;
	}
	public String getCARDH_VER_RESULT() {
		return CARDH_VER_RESULT;
	}
	public void setCARDH_VER_RESULT(String cARDH_VER_RESULT) {
		CARDH_VER_RESULT = cARDH_VER_RESULT;
	}
	public String getCOPAC_CCS_CRYPTO() {
		return COPAC_CCS_CRYPTO;
	}
	public void setCOPAC_CCS_CRYPTO(String cOPAC_CCS_CRYPTO) {
		COPAC_CCS_CRYPTO = cOPAC_CCS_CRYPTO;
	}
	public String getCRYPT_INFO_DATA() {
		return CRYPT_INFO_DATA;
	}
	public void setCRYPT_INFO_DATA(String cRYPT_INFO_DATA) {
		CRYPT_INFO_DATA = cRYPT_INFO_DATA;
	}
	public String getCRYPTOGRAM_AMOUNT() {
		return CRYPTOGRAM_AMOUNT;
	}
	public void setCRYPTOGRAM_AMOUNT(String cRYPTOGRAM_AMOUNT) {
		CRYPTOGRAM_AMOUNT = cRYPTOGRAM_AMOUNT;
	}
	public String getDEDICATED_FILE_NAM() {
		return DEDICATED_FILE_NAM;
	}
	public void setDEDICATED_FILE_NAM(String dEDICATED_FILE_NAM) {
		DEDICATED_FILE_NAM = dEDICATED_FILE_NAM;
	}
	public String getTERM_CAPABILITIES() {
		return TERM_CAPABILITIES;
	}
	public void setTERM_CAPABILITIES(String tERM_CAPABILITIES) {
		TERM_CAPABILITIES = tERM_CAPABILITIES;
	}
	public String getTERM_COUNTRY_CODE() {
		return TERM_COUNTRY_CODE;
	}
	public void setTERM_COUNTRY_CODE(String tERM_COUNTRY_CODE) {
		TERM_COUNTRY_CODE = tERM_COUNTRY_CODE;
	}
	public String getTERM_SERIAL_NO() {
		return TERM_SERIAL_NO;
	}
	public void setTERM_SERIAL_NO(String tERM_SERIAL_NO) {
		TERM_SERIAL_NO = tERM_SERIAL_NO;
	}
	public String getTERM_VERIFY_RESULT() {
		return TERM_VERIFY_RESULT;
	}
	public void setTERM_VERIFY_RESULT(String tERM_VERIFY_RESULT) {
		TERM_VERIFY_RESULT = tERM_VERIFY_RESULT;
	}
	public String getTERMINAL_TYPE() {
		return TERMINAL_TYPE;
	}
	public void setTERMINAL_TYPE(String tERMINAL_TYPE) {
		TERMINAL_TYPE = tERMINAL_TYPE;
	}
	public String getTRAN_CATEGORY_CODE() {
		return TRAN_CATEGORY_CODE;
	}
	public void setTRAN_CATEGORY_CODE(String tRAN_CATEGORY_CODE) {
		TRAN_CATEGORY_CODE = tRAN_CATEGORY_CODE;
	}
	public String getTRAN_CURRENCY_CODE() {
		return TRAN_CURRENCY_CODE;
	}
	public void setTRAN_CURRENCY_CODE(String tRAN_CURRENCY_CODE) {
		TRAN_CURRENCY_CODE = tRAN_CURRENCY_CODE;
	}
	public String getTRAN_DATE() {
		return TRAN_DATE;
	}
	public void setTRAN_DATE(String tRAN_DATE) {
		TRAN_DATE = tRAN_DATE;
	}
	public String getTRAN_SEQ_COUNTER() {
		return TRAN_SEQ_COUNTER;
	}
	public void setTRAN_SEQ_COUNTER(String tRAN_SEQ_COUNTER) {
		TRAN_SEQ_COUNTER = tRAN_SEQ_COUNTER;
	}
	public String getTRAN_TYPE() {
		return TRAN_TYPE;
	}
	public void setTRAN_TYPE(String tRAN_TYPE) {
		TRAN_TYPE = tRAN_TYPE;
	}
	public String getUNPREDICTABLE_NO() {
		return UNPREDICTABLE_NO;
	}
	public void setUNPREDICTABLE_NO(String uNPREDICTABLE_NO) {
		UNPREDICTABLE_NO = uNPREDICTABLE_NO;
	}
	public String getDERIVATION_KEY_IDX() {
		return DERIVATION_KEY_IDX;
	}
	public void setDERIVATION_KEY_IDX(String dERIVATION_KEY_IDX) {
		DERIVATION_KEY_IDX = dERIVATION_KEY_IDX;
	}
	public String getARPC_CRYPTOGRAM() {
		return ARPC_CRYPTOGRAM;
	}
	public void setARPC_CRYPTOGRAM(String aRPC_CRYPTOGRAM) {
		ARPC_CRYPTOGRAM = aRPC_CRYPTOGRAM;
	}
	public String getARPC_RESPCODE() {
		return ARPC_RESPCODE;
	}
	public void setARPC_RESPCODE(String aRPC_RESPCODE) {
		ARPC_RESPCODE = aRPC_RESPCODE;
	}
	public String getDEDICATED_FNAME() {
		return DEDICATED_FNAME;
	}
	public void setDEDICATED_FNAME(String dEDICATED_FNAME) {
		DEDICATED_FNAME = dEDICATED_FNAME;
	}
	public String getISS_APPL_DATA() {
		return ISS_APPL_DATA;
	}
	public void setISS_APPL_DATA(String iSS_APPL_DATA) {
		ISS_APPL_DATA = iSS_APPL_DATA;
	}
	public String getISS_AUTH_DATA() {
		return ISS_AUTH_DATA;
	}
	public void setISS_AUTH_DATA(String iSS_AUTH_DATA) {
		ISS_AUTH_DATA = iSS_AUTH_DATA;
	}
	public String getISS_DISCR_DATA() {
		return ISS_DISCR_DATA;
	}
	public void setISS_DISCR_DATA(String iSS_DISCR_DATA) {
		ISS_DISCR_DATA = iSS_DISCR_DATA;
	}
	public String getISS_SCRIPT_RESULT() {
		return ISS_SCRIPT_RESULT;
	}
	public void setISS_SCRIPT_RESULT(String iSS_SCRIPT_RESULT) {
		ISS_SCRIPT_RESULT = iSS_SCRIPT_RESULT;
	}
	public String getISS_SCRIPT1_DATA() {
		return ISS_SCRIPT1_DATA;
	}
	public void setISS_SCRIPT1_DATA(String iSS_SCRIPT1_DATA) {
		ISS_SCRIPT1_DATA = iSS_SCRIPT1_DATA;
	}
	public String getISS_SCRIPT2_DATA() {
		return ISS_SCRIPT2_DATA;
	}
	public void setISS_SCRIPT2_DATA(String iSS_SCRIPT2_DATA) {
		ISS_SCRIPT2_DATA = iSS_SCRIPT2_DATA;
	}
	public String getFORM_FACTOR_IND() {
		return FORM_FACTOR_IND;
	}
	public void setFORM_FACTOR_IND(String fORM_FACTOR_IND) {
		FORM_FACTOR_IND = fORM_FACTOR_IND;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getTRAN_TYPE_ID() {
		return TRAN_TYPE_ID;
	}
	public void setTRAN_TYPE_ID(String tRAN_TYPE_ID) {
		TRAN_TYPE_ID = tRAN_TYPE_ID;
	}
	public String getTrans_AMT_RECON_NET() {
		return trans_AMT_RECON_NET;
	}
	public void setTrans_AMT_RECON_NET(String trans_AMT_RECON_NET) {
		this.trans_AMT_RECON_NET = trans_AMT_RECON_NET;
	}
	public String getTrans_CUR_RECON_NET() {
		return trans_CUR_RECON_NET;
	}
	public void setTrans_CUR_RECON_NET(String trans_CUR_RECON_NET) {
		this.trans_CUR_RECON_NET = trans_CUR_RECON_NET;
	}
	public String getSYS_TRACE_AUDIT_NO() {
		return SYS_TRACE_AUDIT_NO;
	}
	public void setSYS_TRACE_AUDIT_NO(String sYS_TRACE_AUDIT_NO) {
		SYS_TRACE_AUDIT_NO = sYS_TRACE_AUDIT_NO;
	}
	public String getTSTAMP_LOCAL() {
		return TSTAMP_LOCAL;
	}
	public void setTSTAMP_LOCAL(String tSTAMP_LOCAL) {
		TSTAMP_LOCAL = tSTAMP_LOCAL;
	}
	public String getTrans_FUNC_CODE() {
		return trans_FUNC_CODE;
	}
	public void setTrans_FUNC_CODE(String trans_FUNC_CODE) {
		this.trans_FUNC_CODE = trans_FUNC_CODE;
	}
	public String getINST_ID_RECON_ACQ() {
		return INST_ID_RECON_ACQ;
	}
	public void setINST_ID_RECON_ACQ(String iNST_ID_RECON_ACQ) {
		INST_ID_RECON_ACQ = iNST_ID_RECON_ACQ;
	}
	public String getINST_ID_RECN_ACQ_B() {
		return INST_ID_RECN_ACQ_B;
	}
	public void setINST_ID_RECN_ACQ_B(String iNST_ID_RECN_ACQ_B) {
		INST_ID_RECN_ACQ_B = iNST_ID_RECN_ACQ_B;
	}
	public String getRETRIEVAL_REF_NO() {
		return RETRIEVAL_REF_NO;
	}
	public void setRETRIEVAL_REF_NO(String rETRIEVAL_REF_NO) {
		RETRIEVAL_REF_NO = rETRIEVAL_REF_NO;
	}
	public String getAPPROVAL_CODE() {
		return APPROVAL_CODE;
	}
	public void setAPPROVAL_CODE(String aPPROVAL_CODE) {
		APPROVAL_CODE = aPPROVAL_CODE;
	}
	public String getACT_CODE() {
		return ACT_CODE;
	}
	public void setACT_CODE(String aCT_CODE) {
		ACT_CODE = aCT_CODE;
	}
	public String getCARD_ACPT_TERM_ID() {
		return CARD_ACPT_TERM_ID;
	}
	public void setCARD_ACPT_TERM_ID(String cARD_ACPT_TERM_ID) {
		CARD_ACPT_TERM_ID = cARD_ACPT_TERM_ID;
	}
	public String getNET_TERM_ID() {
		return NET_TERM_ID;
	}
	public void setNET_TERM_ID(String nET_TERM_ID) {
		NET_TERM_ID = nET_TERM_ID;
	}
	public String getRPT_LVL_ID_B() {
		return RPT_LVL_ID_B;
	}
	public void setRPT_LVL_ID_B(String rPT_LVL_ID_B) {
		RPT_LVL_ID_B = rPT_LVL_ID_B;
	}
	public String getPROC_GRP_ID_ACQ_B() {
		return PROC_GRP_ID_ACQ_B;
	}
	public void setPROC_GRP_ID_ACQ_B(String pROC_GRP_ID_ACQ_B) {
		PROC_GRP_ID_ACQ_B = pROC_GRP_ID_ACQ_B;
	}
	public String getPROC_GRP_ID_ISS_B() {
		return PROC_GRP_ID_ISS_B;
	}
	public void setPROC_GRP_ID_ISS_B(String pROC_GRP_ID_ISS_B) {
		PROC_GRP_ID_ISS_B = pROC_GRP_ID_ISS_B;
	}
	public String getPROC_ID_ACQ_B() {
		return PROC_ID_ACQ_B;
	}
	public void setPROC_ID_ACQ_B(String pROC_ID_ACQ_B) {
		PROC_ID_ACQ_B = pROC_ID_ACQ_B;
	}
	public String getPROC_ID_ISS_B() {
		return PROC_ID_ISS_B;
	}
	public void setPROC_ID_ISS_B(String pROC_ID_ISS_B) {
		PROC_ID_ISS_B = pROC_ID_ISS_B;
	}
	public String getINST_ID_ISS() {
		return INST_ID_ISS;
	}
	public void setINST_ID_ISS(String iNST_ID_ISS) {
		INST_ID_ISS = iNST_ID_ISS;
	}
	public String getINST_ID_ACQ() {
		return INST_ID_ACQ;
	}
	public void setINST_ID_ACQ(String iNST_ID_ACQ) {
		INST_ID_ACQ = iNST_ID_ACQ;
	}
	public String getINST_ID_RECN_ISS_B() {
		return INST_ID_RECN_ISS_B;
	}
	public void setINST_ID_RECN_ISS_B(String iNST_ID_RECN_ISS_B) {
		INST_ID_RECN_ISS_B = iNST_ID_RECN_ISS_B;
	}
	public String getINST_ID_RECON_ISS() {
		return INST_ID_RECON_ISS;
	}
	public void setINST_ID_RECON_ISS(String iNST_ID_RECON_ISS) {
		INST_ID_RECON_ISS = iNST_ID_RECON_ISS;
	}
	public String getTrans_ACCT_ID_1() {
		return trans_ACCT_ID_1;
	}
	public void setTrans_ACCT_ID_1(String trans_ACCT_ID_1) {
		this.trans_ACCT_ID_1 = trans_ACCT_ID_1;
	}
	public String getAUTH_BY() {
		return AUTH_BY;
	}
	public void setAUTH_BY(String aUTH_BY) {
		AUTH_BY = aUTH_BY;
	}
	public String getTRAN_CLASS() {
		return TRAN_CLASS;
	}
	public void setTRAN_CLASS(String tRAN_CLASS) {
		TRAN_CLASS = tRAN_CLASS;
	}
	public String getPAN_PREFIX() {
		return PAN_PREFIX;
	}
	public void setPAN_PREFIX(String pAN_PREFIX) {
		PAN_PREFIX = pAN_PREFIX;
	}
	public String getPAN_SUFFIX() {
		return PAN_SUFFIX;
	}
	public void setPAN_SUFFIX(String pAN_SUFFIX) {
		PAN_SUFFIX = pAN_SUFFIX;
	}
	public String getTrans_PAN_TOKEN() {
		return trans_PAN_TOKEN;
	}
	public void setTrans_PAN_TOKEN(String trans_PAN_TOKEN) {
		this.trans_PAN_TOKEN = trans_PAN_TOKEN;
	}
	public String getPAN_TOKEN_PREFIX() {
		return PAN_TOKEN_PREFIX;
	}
	public void setPAN_TOKEN_PREFIX(String pAN_TOKEN_PREFIX) {
		PAN_TOKEN_PREFIX = pAN_TOKEN_PREFIX;
	}
	public String getPAN_TOKEN_SUFFIX() {
		return PAN_TOKEN_SUFFIX;
	}
	public void setPAN_TOKEN_SUFFIX(String pAN_TOKEN_SUFFIX) {
		PAN_TOKEN_SUFFIX = pAN_TOKEN_SUFFIX;
	}
	public String getPROC_ID_ACQ() {
		return PROC_ID_ACQ;
	}
	public void setPROC_ID_ACQ(String pROC_ID_ACQ) {
		PROC_ID_ACQ = pROC_ID_ACQ;
	}
	public String getPROC_ID_ISS() {
		return PROC_ID_ISS;
	}
	public void setPROC_ID_ISS(String pROC_ID_ISS) {
		PROC_ID_ISS = pROC_ID_ISS;
	}
	public String getTrans_MERCH_TYPE() {
		return trans_MERCH_TYPE;
	}
	public void setTrans_MERCH_TYPE(String trans_MERCH_TYPE) {
		this.trans_MERCH_TYPE = trans_MERCH_TYPE;
	}
	public String getINV_ORDER_NO() {
		return INV_ORDER_NO;
	}
	public void setINV_ORDER_NO(String iNV_ORDER_NO) {
		INV_ORDER_NO = iNV_ORDER_NO;
	}
	public String getFIN_TYPE() {
		return FIN_TYPE;
	}
	public void setFIN_TYPE(String fIN_TYPE) {
		FIN_TYPE = fIN_TYPE;
	}
	public String getSUBSCRIBER_IND() {
		return SUBSCRIBER_IND;
	}
	public void setSUBSCRIBER_IND(String sUBSCRIBER_IND) {
		SUBSCRIBER_IND = sUBSCRIBER_IND;
	}
	public String getTrans_DATE_RECON_ACQ() {
		return trans_DATE_RECON_ACQ;
	}
	public void setTrans_DATE_RECON_ACQ(String trans_DATE_RECON_ACQ) {
		this.trans_DATE_RECON_ACQ = trans_DATE_RECON_ACQ;
	}
	public String getTrans_DATE_RECON_ISS() {
		return trans_DATE_RECON_ISS;
	}
	public void setTrans_DATE_RECON_ISS(String trans_DATE_RECON_ISS) {
		this.trans_DATE_RECON_ISS = trans_DATE_RECON_ISS;
	}
	public String getMAPPED_DUP_DATA() {
		return MAPPED_DUP_DATA;
	}
	public void setMAPPED_DUP_DATA(String mAPPED_DUP_DATA) {
		MAPPED_DUP_DATA = mAPPED_DUP_DATA;
	}
	public String getPARTITION_KEY() {
		return PARTITION_KEY;
	}
	public void setPARTITION_KEY(String pARTITION_KEY) {
		PARTITION_KEY = pARTITION_KEY;
	}
	public String getINSERT_SEQUENCE_NO() {
		return INSERT_SEQUENCE_NO;
	}
	public void setINSERT_SEQUENCE_NO(String iNSERT_SEQUENCE_NO) {
		INSERT_SEQUENCE_NO = iNSERT_SEQUENCE_NO;
	}
	public String getMTI() {
		return MTI;
	}
	public void setMTI(String mTI) {
		MTI = mTI;
	}
	public String getAMT_TRAN() {
		return AMT_TRAN;
	}
	public void setAMT_TRAN(String aMT_TRAN) {
		AMT_TRAN = aMT_TRAN;
	}
	public String getCUR_TRAN() {
		return CUR_TRAN;
	}
	public void setCUR_TRAN(String cUR_TRAN) {
		CUR_TRAN = cUR_TRAN;
	}
	public String getAMT_RECON_NET() {
		return AMT_RECON_NET;
	}
	public void setAMT_RECON_NET(String aMT_RECON_NET) {
		AMT_RECON_NET = aMT_RECON_NET;
	}
	public String getCUR_RECON_NET() {
		return CUR_RECON_NET;
	}
	public void setCUR_RECON_NET(String cUR_RECON_NET) {
		CUR_RECON_NET = cUR_RECON_NET;
	}
	public String getAMT_CARD_BILL() {
		return AMT_CARD_BILL;
	}
	public void setAMT_CARD_BILL(String aMT_CARD_BILL) {
		AMT_CARD_BILL = aMT_CARD_BILL;
	}
	public String getCUR_CARD_BILL() {
		return CUR_CARD_BILL;
	}
	public void setCUR_CARD_BILL(String cUR_CARD_BILL) {
		CUR_CARD_BILL = cUR_CARD_BILL;
	}
	public String getCNV_RCN_NET_RATE() {
		return CNV_RCN_NET_RATE;
	}
	public void setCNV_RCN_NET_RATE(String cNV_RCN_NET_RATE) {
		CNV_RCN_NET_RATE = cNV_RCN_NET_RATE;
	}
	public String getCNV_RCN_NET_DE_POS() {
		return CNV_RCN_NET_DE_POS;
	}
	public void setCNV_RCN_NET_DE_POS(String cNV_RCN_NET_DE_POS) {
		CNV_RCN_NET_DE_POS = cNV_RCN_NET_DE_POS;
	}
	public String getCNV_RCN_ACQ_RATE() {
		return CNV_RCN_ACQ_RATE;
	}
	public void setCNV_RCN_ACQ_RATE(String cNV_RCN_ACQ_RATE) {
		CNV_RCN_ACQ_RATE = cNV_RCN_ACQ_RATE;
	}
	public String getCNV_RCN_ACQ_DE_POS() {
		return CNV_RCN_ACQ_DE_POS;
	}
	public void setCNV_RCN_ACQ_DE_POS(String cNV_RCN_ACQ_DE_POS) {
		CNV_RCN_ACQ_DE_POS = cNV_RCN_ACQ_DE_POS;
	}
	public String getCNV_RCN_ISS_RATE() {
		return CNV_RCN_ISS_RATE;
	}
	public void setCNV_RCN_ISS_RATE(String cNV_RCN_ISS_RATE) {
		CNV_RCN_ISS_RATE = cNV_RCN_ISS_RATE;
	}
	public String getCNV_RCN_ISS_DE_POS() {
		return CNV_RCN_ISS_DE_POS;
	}
	public void setCNV_RCN_ISS_DE_POS(String cNV_RCN_ISS_DE_POS) {
		CNV_RCN_ISS_DE_POS = cNV_RCN_ISS_DE_POS;
	}
	public String getCNV_CRD_BIL_RATE() {
		return CNV_CRD_BIL_RATE;
	}
	public void setCNV_CRD_BIL_RATE(String cNV_CRD_BIL_RATE) {
		CNV_CRD_BIL_RATE = cNV_CRD_BIL_RATE;
	}
	public String getCNV_CRD_BIL_DE_POS() {
		return CNV_CRD_BIL_DE_POS;
	}
	public void setCNV_CRD_BIL_DE_POS(String cNV_CRD_BIL_DE_POS) {
		CNV_CRD_BIL_DE_POS = cNV_CRD_BIL_DE_POS;
	}
	public String getDATE_EFFECTIVE() {
		return DATE_EFFECTIVE;
	}
	public void setDATE_EFFECTIVE(String dATE_EFFECTIVE) {
		DATE_EFFECTIVE = dATE_EFFECTIVE;
	}
	public String getDATE_EXP() {
		return DATE_EXP;
	}
	public void setDATE_EXP(String dATE_EXP) {
		DATE_EXP = dATE_EXP;
	}
	public String getDATE_RECON_NET() {
		return DATE_RECON_NET;
	}
	public void setDATE_RECON_NET(String dATE_RECON_NET) {
		DATE_RECON_NET = dATE_RECON_NET;
	}
	public String getDATE_CNV_ACQ() {
		return DATE_CNV_ACQ;
	}
	public void setDATE_CNV_ACQ(String dATE_CNV_ACQ) {
		DATE_CNV_ACQ = dATE_CNV_ACQ;
	}
	public String getDATE_CNV_ISS() {
		return DATE_CNV_ISS;
	}
	public void setDATE_CNV_ISS(String dATE_CNV_ISS) {
		DATE_CNV_ISS = dATE_CNV_ISS;
	}
	public String getDATE_CAPTURE() {
		return DATE_CAPTURE;
	}
	public void setDATE_CAPTURE(String dATE_CAPTURE) {
		DATE_CAPTURE = dATE_CAPTURE;
	}
	public String getCOUNTRY_ACQ_INST() {
		return COUNTRY_ACQ_INST;
	}
	public void setCOUNTRY_ACQ_INST(String cOUNTRY_ACQ_INST) {
		COUNTRY_ACQ_INST = cOUNTRY_ACQ_INST;
	}
	public String getCOUNTRY_ISS_INST() {
		return COUNTRY_ISS_INST;
	}
	public void setCOUNTRY_ISS_INST(String cOUNTRY_ISS_INST) {
		COUNTRY_ISS_INST = cOUNTRY_ISS_INST;
	}
	public String getPOS_CRD_DAT_IN_MOD() {
		return POS_CRD_DAT_IN_MOD;
	}
	public void setPOS_CRD_DAT_IN_MOD(String pOS_CRD_DAT_IN_MOD) {
		POS_CRD_DAT_IN_MOD = pOS_CRD_DAT_IN_MOD;
	}
	public String getPOS_CRDHLDR_A_METH() {
		return POS_CRDHLDR_A_METH;
	}
	public void setPOS_CRDHLDR_A_METH(String pOS_CRDHLDR_A_METH) {
		POS_CRDHLDR_A_METH = pOS_CRDHLDR_A_METH;
	}
	public String getPOS_OPER_ENV() {
		return POS_OPER_ENV;
	}
	public void setPOS_OPER_ENV(String pOS_OPER_ENV) {
		POS_OPER_ENV = pOS_OPER_ENV;
	}
	public String getPOS_CRDHLDR_PRESNT() {
		return POS_CRDHLDR_PRESNT;
	}
	public void setPOS_CRDHLDR_PRESNT(String pOS_CRDHLDR_PRESNT) {
		POS_CRDHLDR_PRESNT = pOS_CRDHLDR_PRESNT;
	}
	public String getPOS_CARD_PRES() {
		return POS_CARD_PRES;
	}
	public void setPOS_CARD_PRES(String pOS_CARD_PRES) {
		POS_CARD_PRES = pOS_CARD_PRES;
	}
	public String getPOS_CRDHLDR_AUTH() {
		return POS_CRDHLDR_AUTH;
	}
	public void setPOS_CRDHLDR_AUTH(String pOS_CRDHLDR_AUTH) {
		POS_CRDHLDR_AUTH = pOS_CRDHLDR_AUTH;
	}
	public String getCARD_SEQ_NO() {
		return CARD_SEQ_NO;
	}
	public void setCARD_SEQ_NO(String cARD_SEQ_NO) {
		CARD_SEQ_NO = cARD_SEQ_NO;
	}
	public String getFUNC_CODE() {
		return FUNC_CODE;
	}
	public void setFUNC_CODE(String fUNC_CODE) {
		FUNC_CODE = fUNC_CODE;
	}
	public String getMSG_RESON_CODE_ACQ() {
		return MSG_RESON_CODE_ACQ;
	}
	public void setMSG_RESON_CODE_ACQ(String mSG_RESON_CODE_ACQ) {
		MSG_RESON_CODE_ACQ = mSG_RESON_CODE_ACQ;
	}
	public String getCARD_ACPT_BUS_CODE() {
		return CARD_ACPT_BUS_CODE;
	}
	public void setCARD_ACPT_BUS_CODE(String cARD_ACPT_BUS_CODE) {
		CARD_ACPT_BUS_CODE = cARD_ACPT_BUS_CODE;
	}
	public String getPOS_CRD_DAT_IN_CAP() {
		return POS_CRD_DAT_IN_CAP;
	}
	public void setPOS_CRD_DAT_IN_CAP(String pOS_CRD_DAT_IN_CAP) {
		POS_CRD_DAT_IN_CAP = pOS_CRD_DAT_IN_CAP;
	}
	public String getPOS_CRDHLDR_AUTH_C() {
		return POS_CRDHLDR_AUTH_C;
	}
	public void setPOS_CRDHLDR_AUTH_C(String pOS_CRDHLDR_AUTH_C) {
		POS_CRDHLDR_AUTH_C = pOS_CRDHLDR_AUTH_C;
	}
	public String getPOS_TERM_OUT_CAP() {
		return POS_TERM_OUT_CAP;
	}
	public void setPOS_TERM_OUT_CAP(String pOS_TERM_OUT_CAP) {
		POS_TERM_OUT_CAP = pOS_TERM_OUT_CAP;
	}
	public String getPOS_CRD_DAT_OT_CAP() {
		return POS_CRD_DAT_OT_CAP;
	}
	public void setPOS_CRD_DAT_OT_CAP(String pOS_CRD_DAT_OT_CAP) {
		POS_CRD_DAT_OT_CAP = pOS_CRD_DAT_OT_CAP;
	}
	public String getPOS_CARD_CAPT_CAP() {
		return POS_CARD_CAPT_CAP;
	}
	public void setPOS_CARD_CAPT_CAP(String pOS_CARD_CAPT_CAP) {
		POS_CARD_CAPT_CAP = pOS_CARD_CAPT_CAP;
	}
	public String getPOS_PIN_CAPT_CAP() {
		return POS_PIN_CAPT_CAP;
	}
	public void setPOS_PIN_CAPT_CAP(String pOS_PIN_CAPT_CAP) {
		POS_PIN_CAPT_CAP = pOS_PIN_CAPT_CAP;
	}
	public String getDATE_RECON_ACQ() {
		return DATE_RECON_ACQ;
	}
	public void setDATE_RECON_ACQ(String dATE_RECON_ACQ) {
		DATE_RECON_ACQ = dATE_RECON_ACQ;
	}
	public String getDATE_RECON_ISS() {
		return DATE_RECON_ISS;
	}
	public void setDATE_RECON_ISS(String dATE_RECON_ISS) {
		DATE_RECON_ISS = dATE_RECON_ISS;
	}
	public String getO_AMT_TRAN() {
		return O_AMT_TRAN;
	}
	public void setO_AMT_TRAN(String o_AMT_TRAN) {
		O_AMT_TRAN = o_AMT_TRAN;
	}
	public String getO_AMT_RECON_NET() {
		return O_AMT_RECON_NET;
	}
	public void setO_AMT_RECON_NET(String o_AMT_RECON_NET) {
		O_AMT_RECON_NET = o_AMT_RECON_NET;
	}
	public String getSRV_GRP_StringCHG_IND() {
		return SRV_GRP_StringCHG_IND;
	}
	public void setSRV_GRP_StringCHG_IND(String sRV_GRP_StringCHG_IND) {
		SRV_GRP_StringCHG_IND = sRV_GRP_StringCHG_IND;
	}
	public String getSRV_GRP_SERV_CODE() {
		return SRV_GRP_SERV_CODE;
	}
	public void setSRV_GRP_SERV_CODE(String sRV_GRP_SERV_CODE) {
		SRV_GRP_SERV_CODE = sRV_GRP_SERV_CODE;
	}
	public String getCARD_ACPT_ID() {
		return CARD_ACPT_ID;
	}
	public void setCARD_ACPT_ID(String cARD_ACPT_ID) {
		CARD_ACPT_ID = cARD_ACPT_ID;
	}
	public String getCLERK_ID() {
		return CLERK_ID;
	}
	public void setCLERK_ID(String cLERK_ID) {
		CLERK_ID = cLERK_ID;
	}
	public String getCARD_ACPT_COUNTRY() {
		return CARD_ACPT_COUNTRY;
	}
	public void setCARD_ACPT_COUNTRY(String cARD_ACPT_COUNTRY) {
		CARD_ACPT_COUNTRY = cARD_ACPT_COUNTRY;
	}
	public String getCARD_ACPT_PST_CODE() {
		return CARD_ACPT_PST_CODE;
	}
	public void setCARD_ACPT_PST_CODE(String cARD_ACPT_PST_CODE) {
		CARD_ACPT_PST_CODE = cARD_ACPT_PST_CODE;
	}
	public String getCARD_ACPT_REGION() {
		return CARD_ACPT_REGION;
	}
	public void setCARD_ACPT_REGION(String cARD_ACPT_REGION) {
		CARD_ACPT_REGION = cARD_ACPT_REGION;
	}
	public String getMULTI_CLEAR_SEQ_NO() {
		return MULTI_CLEAR_SEQ_NO;
	}
	public void setMULTI_CLEAR_SEQ_NO(String mULTI_CLEAR_SEQ_NO) {
		MULTI_CLEAR_SEQ_NO = mULTI_CLEAR_SEQ_NO;
	}
	public String getMULTI_CLEAR_COUNT() {
		return MULTI_CLEAR_COUNT;
	}
	public void setMULTI_CLEAR_COUNT(String mULTI_CLEAR_COUNT) {
		MULTI_CLEAR_COUNT = mULTI_CLEAR_COUNT;
	}
	public String getF_TYPE0() {
		return F_TYPE0;
	}
	public void setF_TYPE0(String f_TYPE0) {
		F_TYPE0 = f_TYPE0;
	}
	public String getF_TYPE1() {
		return F_TYPE1;
	}
	public void setF_TYPE1(String f_TYPE1) {
		F_TYPE1 = f_TYPE1;
	}
	public String getF_TYPE2() {
		return F_TYPE2;
	}
	public void setF_TYPE2(String f_TYPE2) {
		F_TYPE2 = f_TYPE2;
	}
	public String getF_TYPE3() {
		return F_TYPE3;
	}
	public void setF_TYPE3(String f_TYPE3) {
		F_TYPE3 = f_TYPE3;
	}
	public String getF_TYPE4() {
		return F_TYPE4;
	}
	public void setF_TYPE4(String f_TYPE4) {
		F_TYPE4 = f_TYPE4;
	}
	public String getF_TYPE5() {
		return F_TYPE5;
	}
	public void setF_TYPE5(String f_TYPE5) {
		F_TYPE5 = f_TYPE5;
	}
	public String getF_INITIATOR0() {
		return F_INITIATOR0;
	}
	public void setF_INITIATOR0(String f_INITIATOR0) {
		F_INITIATOR0 = f_INITIATOR0;
	}
	public String getF_INITIATOR1() {
		return F_INITIATOR1;
	}
	public void setF_INITIATOR1(String f_INITIATOR1) {
		F_INITIATOR1 = f_INITIATOR1;
	}
	public String getF_INITIATOR2() {
		return F_INITIATOR2;
	}
	public void setF_INITIATOR2(String f_INITIATOR2) {
		F_INITIATOR2 = f_INITIATOR2;
	}
	public String getF_INITIATOR3() {
		return F_INITIATOR3;
	}
	public void setF_INITIATOR3(String f_INITIATOR3) {
		F_INITIATOR3 = f_INITIATOR3;
	}
	public String getF_INITIATOR4() {
		return F_INITIATOR4;
	}
	public void setF_INITIATOR4(String f_INITIATOR4) {
		F_INITIATOR4 = f_INITIATOR4;
	}
	public String getF_INITIATOR5() {
		return F_INITIATOR5;
	}
	public void setF_INITIATOR5(String f_INITIATOR5) {
		F_INITIATOR5 = f_INITIATOR5;
	}
	public String getF_MEMO0() {
		return F_MEMO0;
	}
	public void setF_MEMO0(String f_MEMO0) {
		F_MEMO0 = f_MEMO0;
	}
	public String getF_MEMO1() {
		return F_MEMO1;
	}
	public void setF_MEMO1(String f_MEMO1) {
		F_MEMO1 = f_MEMO1;
	}
	public String getF_MEMO2() {
		return F_MEMO2;
	}
	public void setF_MEMO2(String f_MEMO2) {
		F_MEMO2 = f_MEMO2;
	}
	public String getF_MEMO3() {
		return F_MEMO3;
	}
	public void setF_MEMO3(String f_MEMO3) {
		F_MEMO3 = f_MEMO3;
	}
	public String getF_MEMO4() {
		return F_MEMO4;
	}
	public void setF_MEMO4(String f_MEMO4) {
		F_MEMO4 = f_MEMO4;
	}
	public String getF_MEMO5() {
		return F_MEMO5;
	}
	public void setF_MEMO5(String f_MEMO5) {
		F_MEMO5 = f_MEMO5;
	}
	public String getF_AMT0() {
		return F_AMT0;
	}
	public void setF_AMT0(String f_AMT0) {
		F_AMT0 = f_AMT0;
	}
	public String getF_AMT1() {
		return F_AMT1;
	}
	public void setF_AMT1(String f_AMT1) {
		F_AMT1 = f_AMT1;
	}
	public String getF_AMT2() {
		return F_AMT2;
	}
	public void setF_AMT2(String f_AMT2) {
		F_AMT2 = f_AMT2;
	}
	public String getF_AMT3() {
		return F_AMT3;
	}
	public void setF_AMT3(String f_AMT3) {
		F_AMT3 = f_AMT3;
	}
	public String getF_AMT4() {
		return F_AMT4;
	}
	public void setF_AMT4(String f_AMT4) {
		F_AMT4 = f_AMT4;
	}
	public String getF_AMT5() {
		return F_AMT5;
	}
	public void setF_AMT5(String f_AMT5) {
		F_AMT5 = f_AMT5;
	}
	public String getF_CUR_CODE0() {
		return F_CUR_CODE0;
	}
	public void setF_CUR_CODE0(String f_CUR_CODE0) {
		F_CUR_CODE0 = f_CUR_CODE0;
	}
	public String getF_CUR_CODE1() {
		return F_CUR_CODE1;
	}
	public void setF_CUR_CODE1(String f_CUR_CODE1) {
		F_CUR_CODE1 = f_CUR_CODE1;
	}
	public String getF_CUR_CODE2() {
		return F_CUR_CODE2;
	}
	public void setF_CUR_CODE2(String f_CUR_CODE2) {
		F_CUR_CODE2 = f_CUR_CODE2;
	}
	public String getF_CUR_CODE3() {
		return F_CUR_CODE3;
	}
	public void setF_CUR_CODE3(String f_CUR_CODE3) {
		F_CUR_CODE3 = f_CUR_CODE3;
	}
	public String getF_CUR_CODE4() {
		return F_CUR_CODE4;
	}
	public void setF_CUR_CODE4(String f_CUR_CODE4) {
		F_CUR_CODE4 = f_CUR_CODE4;
	}
	public String getF_CUR_CODE5() {
		return F_CUR_CODE5;
	}
	public void setF_CUR_CODE5(String f_CUR_CODE5) {
		F_CUR_CODE5 = f_CUR_CODE5;
	}
	public String getF_ADL_DEC_POS0() {
		return F_ADL_DEC_POS0;
	}
	public void setF_ADL_DEC_POS0(String f_ADL_DEC_POS0) {
		F_ADL_DEC_POS0 = f_ADL_DEC_POS0;
	}
	public String getF_ADL_DEC_POS1() {
		return F_ADL_DEC_POS1;
	}
	public void setF_ADL_DEC_POS1(String f_ADL_DEC_POS1) {
		F_ADL_DEC_POS1 = f_ADL_DEC_POS1;
	}
	public String getF_ADL_DEC_POS2() {
		return F_ADL_DEC_POS2;
	}
	public void setF_ADL_DEC_POS2(String f_ADL_DEC_POS2) {
		F_ADL_DEC_POS2 = f_ADL_DEC_POS2;
	}
	public String getF_ADL_DEC_POS3() {
		return F_ADL_DEC_POS3;
	}
	public void setF_ADL_DEC_POS3(String f_ADL_DEC_POS3) {
		F_ADL_DEC_POS3 = f_ADL_DEC_POS3;
	}
	public String getF_ADL_DEC_POS4() {
		return F_ADL_DEC_POS4;
	}
	public void setF_ADL_DEC_POS4(String f_ADL_DEC_POS4) {
		F_ADL_DEC_POS4 = f_ADL_DEC_POS4;
	}
	public String getF_ADL_DEC_POS5() {
		return F_ADL_DEC_POS5;
	}
	public void setF_ADL_DEC_POS5(String f_ADL_DEC_POS5) {
		F_ADL_DEC_POS5 = f_ADL_DEC_POS5;
	}
	public String getF_CNV_ACQ_RATE0() {
		return F_CNV_ACQ_RATE0;
	}
	public void setF_CNV_ACQ_RATE0(String f_CNV_ACQ_RATE0) {
		F_CNV_ACQ_RATE0 = f_CNV_ACQ_RATE0;
	}
	public String getF_CNV_ACQ_RATE1() {
		return F_CNV_ACQ_RATE1;
	}
	public void setF_CNV_ACQ_RATE1(String f_CNV_ACQ_RATE1) {
		F_CNV_ACQ_RATE1 = f_CNV_ACQ_RATE1;
	}
	public String getF_CNV_ACQ_RATE2() {
		return F_CNV_ACQ_RATE2;
	}
	public void setF_CNV_ACQ_RATE2(String f_CNV_ACQ_RATE2) {
		F_CNV_ACQ_RATE2 = f_CNV_ACQ_RATE2;
	}
	public String getF_CNV_ACQ_RATE3() {
		return F_CNV_ACQ_RATE3;
	}
	public void setF_CNV_ACQ_RATE3(String f_CNV_ACQ_RATE3) {
		F_CNV_ACQ_RATE3 = f_CNV_ACQ_RATE3;
	}
	public String getF_CNV_ACQ_RATE4() {
		return F_CNV_ACQ_RATE4;
	}
	public void setF_CNV_ACQ_RATE4(String f_CNV_ACQ_RATE4) {
		F_CNV_ACQ_RATE4 = f_CNV_ACQ_RATE4;
	}
	public String getF_CNV_ACQ_RATE5() {
		return F_CNV_ACQ_RATE5;
	}
	public void setF_CNV_ACQ_RATE5(String f_CNV_ACQ_RATE5) {
		F_CNV_ACQ_RATE5 = f_CNV_ACQ_RATE5;
	}
	public String getF_CNV_ACQ_DEC_POS0() {
		return F_CNV_ACQ_DEC_POS0;
	}
	public void setF_CNV_ACQ_DEC_POS0(String f_CNV_ACQ_DEC_POS0) {
		F_CNV_ACQ_DEC_POS0 = f_CNV_ACQ_DEC_POS0;
	}
	public String getF_CNV_ACQ_DEC_POS1() {
		return F_CNV_ACQ_DEC_POS1;
	}
	public void setF_CNV_ACQ_DEC_POS1(String f_CNV_ACQ_DEC_POS1) {
		F_CNV_ACQ_DEC_POS1 = f_CNV_ACQ_DEC_POS1;
	}
	public String getF_CNV_ACQ_DEC_POS2() {
		return F_CNV_ACQ_DEC_POS2;
	}
	public void setF_CNV_ACQ_DEC_POS2(String f_CNV_ACQ_DEC_POS2) {
		F_CNV_ACQ_DEC_POS2 = f_CNV_ACQ_DEC_POS2;
	}
	public String getF_CNV_ACQ_DEC_POS3() {
		return F_CNV_ACQ_DEC_POS3;
	}
	public void setF_CNV_ACQ_DEC_POS3(String f_CNV_ACQ_DEC_POS3) {
		F_CNV_ACQ_DEC_POS3 = f_CNV_ACQ_DEC_POS3;
	}
	public String getF_CNV_ACQ_DEC_POS4() {
		return F_CNV_ACQ_DEC_POS4;
	}
	public void setF_CNV_ACQ_DEC_POS4(String f_CNV_ACQ_DEC_POS4) {
		F_CNV_ACQ_DEC_POS4 = f_CNV_ACQ_DEC_POS4;
	}
	public String getF_CNV_ACQ_DEC_POS5() {
		return F_CNV_ACQ_DEC_POS5;
	}
	public void setF_CNV_ACQ_DEC_POS5(String f_CNV_ACQ_DEC_POS5) {
		F_CNV_ACQ_DEC_POS5 = f_CNV_ACQ_DEC_POS5;
	}
	public String getF_AMT_RECON_ACQ0() {
		return F_AMT_RECON_ACQ0;
	}
	public void setF_AMT_RECON_ACQ0(String f_AMT_RECON_ACQ0) {
		F_AMT_RECON_ACQ0 = f_AMT_RECON_ACQ0;
	}
	public String getF_AMT_RECON_ACQ1() {
		return F_AMT_RECON_ACQ1;
	}
	public void setF_AMT_RECON_ACQ1(String f_AMT_RECON_ACQ1) {
		F_AMT_RECON_ACQ1 = f_AMT_RECON_ACQ1;
	}
	public String getF_AMT_RECON_ACQ2() {
		return F_AMT_RECON_ACQ2;
	}
	public void setF_AMT_RECON_ACQ2(String f_AMT_RECON_ACQ2) {
		F_AMT_RECON_ACQ2 = f_AMT_RECON_ACQ2;
	}
	public String getF_AMT_RECON_ACQ3() {
		return F_AMT_RECON_ACQ3;
	}
	public void setF_AMT_RECON_ACQ3(String f_AMT_RECON_ACQ3) {
		F_AMT_RECON_ACQ3 = f_AMT_RECON_ACQ3;
	}
	public String getF_AMT_RECON_ACQ4() {
		return F_AMT_RECON_ACQ4;
	}
	public void setF_AMT_RECON_ACQ4(String f_AMT_RECON_ACQ4) {
		F_AMT_RECON_ACQ4 = f_AMT_RECON_ACQ4;
	}
	public String getF_AMT_RECON_ACQ5() {
		return F_AMT_RECON_ACQ5;
	}
	public void setF_AMT_RECON_ACQ5(String f_AMT_RECON_ACQ5) {
		F_AMT_RECON_ACQ5 = f_AMT_RECON_ACQ5;
	}
	public String getF_CUR_RECON_ACQ0() {
		return F_CUR_RECON_ACQ0;
	}
	public void setF_CUR_RECON_ACQ0(String f_CUR_RECON_ACQ0) {
		F_CUR_RECON_ACQ0 = f_CUR_RECON_ACQ0;
	}
	public String getF_CUR_RECON_ACQ1() {
		return F_CUR_RECON_ACQ1;
	}
	public void setF_CUR_RECON_ACQ1(String f_CUR_RECON_ACQ1) {
		F_CUR_RECON_ACQ1 = f_CUR_RECON_ACQ1;
	}
	public String getF_CUR_RECON_ACQ2() {
		return F_CUR_RECON_ACQ2;
	}
	public void setF_CUR_RECON_ACQ2(String f_CUR_RECON_ACQ2) {
		F_CUR_RECON_ACQ2 = f_CUR_RECON_ACQ2;
	}
	public String getF_CUR_RECON_ACQ3() {
		return F_CUR_RECON_ACQ3;
	}
	public void setF_CUR_RECON_ACQ3(String f_CUR_RECON_ACQ3) {
		F_CUR_RECON_ACQ3 = f_CUR_RECON_ACQ3;
	}
	public String getF_CUR_RECON_ACQ4() {
		return F_CUR_RECON_ACQ4;
	}
	public void setF_CUR_RECON_ACQ4(String f_CUR_RECON_ACQ4) {
		F_CUR_RECON_ACQ4 = f_CUR_RECON_ACQ4;
	}
	public String getF_CUR_RECON_ACQ5() {
		return F_CUR_RECON_ACQ5;
	}
	public void setF_CUR_RECON_ACQ5(String f_CUR_RECON_ACQ5) {
		F_CUR_RECON_ACQ5 = f_CUR_RECON_ACQ5;
	}
	public String getF_CNV_ISS_RATE0() {
		return F_CNV_ISS_RATE0;
	}
	public void setF_CNV_ISS_RATE0(String f_CNV_ISS_RATE0) {
		F_CNV_ISS_RATE0 = f_CNV_ISS_RATE0;
	}
	public String getF_CNV_ISS_RATE1() {
		return F_CNV_ISS_RATE1;
	}
	public void setF_CNV_ISS_RATE1(String f_CNV_ISS_RATE1) {
		F_CNV_ISS_RATE1 = f_CNV_ISS_RATE1;
	}
	public String getF_CNV_ISS_RATE2() {
		return F_CNV_ISS_RATE2;
	}
	public void setF_CNV_ISS_RATE2(String f_CNV_ISS_RATE2) {
		F_CNV_ISS_RATE2 = f_CNV_ISS_RATE2;
	}
	public String getF_CNV_ISS_RATE3() {
		return F_CNV_ISS_RATE3;
	}
	public void setF_CNV_ISS_RATE3(String f_CNV_ISS_RATE3) {
		F_CNV_ISS_RATE3 = f_CNV_ISS_RATE3;
	}
	public String getF_CNV_ISS_RATE4() {
		return F_CNV_ISS_RATE4;
	}
	public void setF_CNV_ISS_RATE4(String f_CNV_ISS_RATE4) {
		F_CNV_ISS_RATE4 = f_CNV_ISS_RATE4;
	}
	public String getF_CNV_ISS_RATE5() {
		return F_CNV_ISS_RATE5;
	}
	public void setF_CNV_ISS_RATE5(String f_CNV_ISS_RATE5) {
		F_CNV_ISS_RATE5 = f_CNV_ISS_RATE5;
	}
	public String getF_CNV_ISS_DEC_POS0() {
		return F_CNV_ISS_DEC_POS0;
	}
	public void setF_CNV_ISS_DEC_POS0(String f_CNV_ISS_DEC_POS0) {
		F_CNV_ISS_DEC_POS0 = f_CNV_ISS_DEC_POS0;
	}
	public String getF_CNV_ISS_DEC_POS1() {
		return F_CNV_ISS_DEC_POS1;
	}
	public void setF_CNV_ISS_DEC_POS1(String f_CNV_ISS_DEC_POS1) {
		F_CNV_ISS_DEC_POS1 = f_CNV_ISS_DEC_POS1;
	}
	public String getF_CNV_ISS_DEC_POS2() {
		return F_CNV_ISS_DEC_POS2;
	}
	public void setF_CNV_ISS_DEC_POS2(String f_CNV_ISS_DEC_POS2) {
		F_CNV_ISS_DEC_POS2 = f_CNV_ISS_DEC_POS2;
	}
	public String getF_CNV_ISS_DEC_POS3() {
		return F_CNV_ISS_DEC_POS3;
	}
	public void setF_CNV_ISS_DEC_POS3(String f_CNV_ISS_DEC_POS3) {
		F_CNV_ISS_DEC_POS3 = f_CNV_ISS_DEC_POS3;
	}
	public String getF_CNV_ISS_DEC_POS4() {
		return F_CNV_ISS_DEC_POS4;
	}
	public void setF_CNV_ISS_DEC_POS4(String f_CNV_ISS_DEC_POS4) {
		F_CNV_ISS_DEC_POS4 = f_CNV_ISS_DEC_POS4;
	}
	public String getF_CNV_ISS_DEC_POS5() {
		return F_CNV_ISS_DEC_POS5;
	}
	public void setF_CNV_ISS_DEC_POS5(String f_CNV_ISS_DEC_POS5) {
		F_CNV_ISS_DEC_POS5 = f_CNV_ISS_DEC_POS5;
	}
	public String getF_AMT_RECON_ISS0() {
		return F_AMT_RECON_ISS0;
	}
	public void setF_AMT_RECON_ISS0(String f_AMT_RECON_ISS0) {
		F_AMT_RECON_ISS0 = f_AMT_RECON_ISS0;
	}
	public String getF_AMT_RECON_ISS1() {
		return F_AMT_RECON_ISS1;
	}
	public void setF_AMT_RECON_ISS1(String f_AMT_RECON_ISS1) {
		F_AMT_RECON_ISS1 = f_AMT_RECON_ISS1;
	}
	public String getF_AMT_RECON_ISS2() {
		return F_AMT_RECON_ISS2;
	}
	public void setF_AMT_RECON_ISS2(String f_AMT_RECON_ISS2) {
		F_AMT_RECON_ISS2 = f_AMT_RECON_ISS2;
	}
	public String getF_AMT_RECON_ISS3() {
		return F_AMT_RECON_ISS3;
	}
	public void setF_AMT_RECON_ISS3(String f_AMT_RECON_ISS3) {
		F_AMT_RECON_ISS3 = f_AMT_RECON_ISS3;
	}
	public String getF_AMT_RECON_ISS4() {
		return F_AMT_RECON_ISS4;
	}
	public void setF_AMT_RECON_ISS4(String f_AMT_RECON_ISS4) {
		F_AMT_RECON_ISS4 = f_AMT_RECON_ISS4;
	}
	public String getF_AMT_RECON_ISS5() {
		return F_AMT_RECON_ISS5;
	}
	public void setF_AMT_RECON_ISS5(String f_AMT_RECON_ISS5) {
		F_AMT_RECON_ISS5 = f_AMT_RECON_ISS5;
	}
	public String getF_CUR_RECON_ISS0() {
		return F_CUR_RECON_ISS0;
	}
	public void setF_CUR_RECON_ISS0(String f_CUR_RECON_ISS0) {
		F_CUR_RECON_ISS0 = f_CUR_RECON_ISS0;
	}
	public String getF_CUR_RECON_ISS1() {
		return F_CUR_RECON_ISS1;
	}
	public void setF_CUR_RECON_ISS1(String f_CUR_RECON_ISS1) {
		F_CUR_RECON_ISS1 = f_CUR_RECON_ISS1;
	}
	public String getF_CUR_RECON_ISS2() {
		return F_CUR_RECON_ISS2;
	}
	public void setF_CUR_RECON_ISS2(String f_CUR_RECON_ISS2) {
		F_CUR_RECON_ISS2 = f_CUR_RECON_ISS2;
	}
	public String getF_CUR_RECON_ISS3() {
		return F_CUR_RECON_ISS3;
	}
	public void setF_CUR_RECON_ISS3(String f_CUR_RECON_ISS3) {
		F_CUR_RECON_ISS3 = f_CUR_RECON_ISS3;
	}
	public String getF_CUR_RECON_ISS4() {
		return F_CUR_RECON_ISS4;
	}
	public void setF_CUR_RECON_ISS4(String f_CUR_RECON_ISS4) {
		F_CUR_RECON_ISS4 = f_CUR_RECON_ISS4;
	}
	public String getF_CUR_RECON_ISS5() {
		return F_CUR_RECON_ISS5;
	}
	public void setF_CUR_RECON_ISS5(String f_CUR_RECON_ISS5) {
		F_CUR_RECON_ISS5 = f_CUR_RECON_ISS5;
	}
	public String getF_AMT_RECON_NET0() {
		return F_AMT_RECON_NET0;
	}
	public void setF_AMT_RECON_NET0(String f_AMT_RECON_NET0) {
		F_AMT_RECON_NET0 = f_AMT_RECON_NET0;
	}
	public String getF_AMT_RECON_NET1() {
		return F_AMT_RECON_NET1;
	}
	public void setF_AMT_RECON_NET1(String f_AMT_RECON_NET1) {
		F_AMT_RECON_NET1 = f_AMT_RECON_NET1;
	}
	public String getF_AMT_RECON_NET2() {
		return F_AMT_RECON_NET2;
	}
	public void setF_AMT_RECON_NET2(String f_AMT_RECON_NET2) {
		F_AMT_RECON_NET2 = f_AMT_RECON_NET2;
	}
	public String getF_AMT_RECON_NET3() {
		return F_AMT_RECON_NET3;
	}
	public void setF_AMT_RECON_NET3(String f_AMT_RECON_NET3) {
		F_AMT_RECON_NET3 = f_AMT_RECON_NET3;
	}
	public String getF_AMT_RECON_NET4() {
		return F_AMT_RECON_NET4;
	}
	public void setF_AMT_RECON_NET4(String f_AMT_RECON_NET4) {
		F_AMT_RECON_NET4 = f_AMT_RECON_NET4;
	}
	public String getF_AMT_RECON_NET5() {
		return F_AMT_RECON_NET5;
	}
	public void setF_AMT_RECON_NET5(String f_AMT_RECON_NET5) {
		F_AMT_RECON_NET5 = f_AMT_RECON_NET5;
	}
	public String getCVV_CVC_RESULT() {
		return CVV_CVC_RESULT;
	}
	public void setCVV_CVC_RESULT(String cVV_CVC_RESULT) {
		CVV_CVC_RESULT = cVV_CVC_RESULT;
	}
	public String getCVV2_CVC2_RESULT() {
		return CVV2_CVC2_RESULT;
	}
	public void setCVV2_CVC2_RESULT(String cVV2_CVC2_RESULT) {
		CVV2_CVC2_RESULT = cVV2_CVC2_RESULT;
	}
	public String getCAVV_RESULT() {
		return CAVV_RESULT;
	}
	public void setCAVV_RESULT(String cAVV_RESULT) {
		CAVV_RESULT = cAVV_RESULT;
	}
	public String getADL_RQST_AMT0() {
		return ADL_RQST_AMT0;
	}
	public void setADL_RQST_AMT0(String aDL_RQST_AMT0) {
		ADL_RQST_AMT0 = aDL_RQST_AMT0;
	}
	public String getADL_RQST_AMT1() {
		return ADL_RQST_AMT1;
	}
	public void setADL_RQST_AMT1(String aDL_RQST_AMT1) {
		ADL_RQST_AMT1 = aDL_RQST_AMT1;
	}
	public String getADL_RQST_AMT2() {
		return ADL_RQST_AMT2;
	}
	public void setADL_RQST_AMT2(String aDL_RQST_AMT2) {
		ADL_RQST_AMT2 = aDL_RQST_AMT2;
	}
	public String getADL_RQST_AMT3() {
		return ADL_RQST_AMT3;
	}
	public void setADL_RQST_AMT3(String aDL_RQST_AMT3) {
		ADL_RQST_AMT3 = aDL_RQST_AMT3;
	}
	public String getADL_RQST_AMT4() {
		return ADL_RQST_AMT4;
	}
	public void setADL_RQST_AMT4(String aDL_RQST_AMT4) {
		ADL_RQST_AMT4 = aDL_RQST_AMT4;
	}
	public String getADL_RQST_AMT5() {
		return ADL_RQST_AMT5;
	}
	public void setADL_RQST_AMT5(String aDL_RQST_AMT5) {
		ADL_RQST_AMT5 = aDL_RQST_AMT5;
	}
	public String getADL_RQST_CUR_CODE0() {
		return ADL_RQST_CUR_CODE0;
	}
	public void setADL_RQST_CUR_CODE0(String aDL_RQST_CUR_CODE0) {
		ADL_RQST_CUR_CODE0 = aDL_RQST_CUR_CODE0;
	}
	public String getADL_RQST_CUR_CODE1() {
		return ADL_RQST_CUR_CODE1;
	}
	public void setADL_RQST_CUR_CODE1(String aDL_RQST_CUR_CODE1) {
		ADL_RQST_CUR_CODE1 = aDL_RQST_CUR_CODE1;
	}
	public String getADL_RQST_CUR_CODE2() {
		return ADL_RQST_CUR_CODE2;
	}
	public void setADL_RQST_CUR_CODE2(String aDL_RQST_CUR_CODE2) {
		ADL_RQST_CUR_CODE2 = aDL_RQST_CUR_CODE2;
	}
	public String getADL_RQST_CUR_CODE3() {
		return ADL_RQST_CUR_CODE3;
	}
	public void setADL_RQST_CUR_CODE3(String aDL_RQST_CUR_CODE3) {
		ADL_RQST_CUR_CODE3 = aDL_RQST_CUR_CODE3;
	}
	public String getADL_RQST_CUR_CODE4() {
		return ADL_RQST_CUR_CODE4;
	}
	public void setADL_RQST_CUR_CODE4(String aDL_RQST_CUR_CODE4) {
		ADL_RQST_CUR_CODE4 = aDL_RQST_CUR_CODE4;
	}
	public String getADL_RQST_CUR_CODE5() {
		return ADL_RQST_CUR_CODE5;
	}
	public void setADL_RQST_CUR_CODE5(String aDL_RQST_CUR_CODE5) {
		ADL_RQST_CUR_CODE5 = aDL_RQST_CUR_CODE5;
	}
	public String getADL_RQST_AMT_TYP0() {
		return ADL_RQST_AMT_TYP0;
	}
	public void setADL_RQST_AMT_TYP0(String aDL_RQST_AMT_TYP0) {
		ADL_RQST_AMT_TYP0 = aDL_RQST_AMT_TYP0;
	}
	public String getADL_RQST_AMT_TYP1() {
		return ADL_RQST_AMT_TYP1;
	}
	public void setADL_RQST_AMT_TYP1(String aDL_RQST_AMT_TYP1) {
		ADL_RQST_AMT_TYP1 = aDL_RQST_AMT_TYP1;
	}
	public String getADL_RQST_AMT_TYP2() {
		return ADL_RQST_AMT_TYP2;
	}
	public void setADL_RQST_AMT_TYP2(String aDL_RQST_AMT_TYP2) {
		ADL_RQST_AMT_TYP2 = aDL_RQST_AMT_TYP2;
	}
	public String getADL_RQST_AMT_TYP3() {
		return ADL_RQST_AMT_TYP3;
	}
	public void setADL_RQST_AMT_TYP3(String aDL_RQST_AMT_TYP3) {
		ADL_RQST_AMT_TYP3 = aDL_RQST_AMT_TYP3;
	}
	public String getADL_RQST_AMT_TYP4() {
		return ADL_RQST_AMT_TYP4;
	}
	public void setADL_RQST_AMT_TYP4(String aDL_RQST_AMT_TYP4) {
		ADL_RQST_AMT_TYP4 = aDL_RQST_AMT_TYP4;
	}
	public String getADL_RQST_AMT_TYP5() {
		return ADL_RQST_AMT_TYP5;
	}
	public void setADL_RQST_AMT_TYP5(String aDL_RQST_AMT_TYP5) {
		ADL_RQST_AMT_TYP5 = aDL_RQST_AMT_TYP5;
	}
	public String getADL_RQST_ACCT_IDX0() {
		return ADL_RQST_ACCT_IDX0;
	}
	public void setADL_RQST_ACCT_IDX0(String aDL_RQST_ACCT_IDX0) {
		ADL_RQST_ACCT_IDX0 = aDL_RQST_ACCT_IDX0;
	}
	public String getADL_RQST_ACCT_IDX1() {
		return ADL_RQST_ACCT_IDX1;
	}
	public void setADL_RQST_ACCT_IDX1(String aDL_RQST_ACCT_IDX1) {
		ADL_RQST_ACCT_IDX1 = aDL_RQST_ACCT_IDX1;
	}
	public String getADL_RQST_ACCT_IDX2() {
		return ADL_RQST_ACCT_IDX2;
	}
	public void setADL_RQST_ACCT_IDX2(String aDL_RQST_ACCT_IDX2) {
		ADL_RQST_ACCT_IDX2 = aDL_RQST_ACCT_IDX2;
	}
	public String getADL_RQST_ACCT_IDX3() {
		return ADL_RQST_ACCT_IDX3;
	}
	public void setADL_RQST_ACCT_IDX3(String aDL_RQST_ACCT_IDX3) {
		ADL_RQST_ACCT_IDX3 = aDL_RQST_ACCT_IDX3;
	}
	public String getADL_RQST_ACCT_IDX4() {
		return ADL_RQST_ACCT_IDX4;
	}
	public void setADL_RQST_ACCT_IDX4(String aDL_RQST_ACCT_IDX4) {
		ADL_RQST_ACCT_IDX4 = aDL_RQST_ACCT_IDX4;
	}
	public String getADL_RQST_ACCT_IDX5() {
		return ADL_RQST_ACCT_IDX5;
	}
	public void setADL_RQST_ACCT_IDX5(String aDL_RQST_ACCT_IDX5) {
		ADL_RQST_ACCT_IDX5 = aDL_RQST_ACCT_IDX5;
	}
	public String getADL_RQST_ACCT_TYP0() {
		return ADL_RQST_ACCT_TYP0;
	}
	public void setADL_RQST_ACCT_TYP0(String aDL_RQST_ACCT_TYP0) {
		ADL_RQST_ACCT_TYP0 = aDL_RQST_ACCT_TYP0;
	}
	public String getADL_RQST_ACCT_TYP1() {
		return ADL_RQST_ACCT_TYP1;
	}
	public void setADL_RQST_ACCT_TYP1(String aDL_RQST_ACCT_TYP1) {
		ADL_RQST_ACCT_TYP1 = aDL_RQST_ACCT_TYP1;
	}
	public String getADL_RQST_ACCT_TYP2() {
		return ADL_RQST_ACCT_TYP2;
	}
	public void setADL_RQST_ACCT_TYP2(String aDL_RQST_ACCT_TYP2) {
		ADL_RQST_ACCT_TYP2 = aDL_RQST_ACCT_TYP2;
	}
	public String getADL_RQST_ACCT_TYP3() {
		return ADL_RQST_ACCT_TYP3;
	}
	public void setADL_RQST_ACCT_TYP3(String aDL_RQST_ACCT_TYP3) {
		ADL_RQST_ACCT_TYP3 = aDL_RQST_ACCT_TYP3;
	}
	public String getADL_RQST_ACCT_TYP4() {
		return ADL_RQST_ACCT_TYP4;
	}
	public void setADL_RQST_ACCT_TYP4(String aDL_RQST_ACCT_TYP4) {
		ADL_RQST_ACCT_TYP4 = aDL_RQST_ACCT_TYP4;
	}
	public String getADL_RQST_ACCT_TYP5() {
		return ADL_RQST_ACCT_TYP5;
	}
	public void setADL_RQST_ACCT_TYP5(String aDL_RQST_ACCT_TYP5) {
		ADL_RQST_ACCT_TYP5 = aDL_RQST_ACCT_TYP5;
	}
	public String getODE_MTI() {
		return ODE_MTI;
	}
	public void setODE_MTI(String oDE_MTI) {
		ODE_MTI = oDE_MTI;
	}
	public String getODE_SYS_TRA_AUD_NO() {
		return ODE_SYS_TRA_AUD_NO;
	}
	public void setODE_SYS_TRA_AUD_NO(String oDE_SYS_TRA_AUD_NO) {
		ODE_SYS_TRA_AUD_NO = oDE_SYS_TRA_AUD_NO;
	}
	public String getODE_TSTAMP_LOCL_TR() {
		return ODE_TSTAMP_LOCL_TR;
	}
	public void setODE_TSTAMP_LOCL_TR(String oDE_TSTAMP_LOCL_TR) {
		ODE_TSTAMP_LOCL_TR = oDE_TSTAMP_LOCL_TR;
	}
	public String getODE_INST_ID_ACQ() {
		return ODE_INST_ID_ACQ;
	}
	public void setODE_INST_ID_ACQ(String oDE_INST_ID_ACQ) {
		ODE_INST_ID_ACQ = oDE_INST_ID_ACQ;
	}
	public String getAUTH_LCYCLE_TCODE() {
		return AUTH_LCYCLE_TCODE;
	}
	public void setAUTH_LCYCLE_TCODE(String aUTH_LCYCLE_TCODE) {
		AUTH_LCYCLE_TCODE = aUTH_LCYCLE_TCODE;
	}
	public String getAUTH_LIFECYCLE_String() {
		return AUTH_LIFECYCLE_String;
	}
	public void setAUTH_LIFECYCLE_String(String aUTH_LIFECYCLE_String) {
		AUTH_LIFECYCLE_String = aUTH_LIFECYCLE_String;
	}
	public String getNET_ID_ACQ() {
		return NET_ID_ACQ;
	}
	public void setNET_ID_ACQ(String nET_ID_ACQ) {
		NET_ID_ACQ = nET_ID_ACQ;
	}
	public String getNET_ID_ISS() {
		return NET_ID_ISS;
	}
	public void setNET_ID_ISS(String nET_ID_ISS) {
		NET_ID_ISS = nET_ID_ISS;
	}
	public String getFO_TYPE0() {
		return FO_TYPE0;
	}
	public void setFO_TYPE0(String fO_TYPE0) {
		FO_TYPE0 = fO_TYPE0;
	}
	public String getFO_TYPE1() {
		return FO_TYPE1;
	}
	public void setFO_TYPE1(String fO_TYPE1) {
		FO_TYPE1 = fO_TYPE1;
	}
	public String getFO_TYPE2() {
		return FO_TYPE2;
	}
	public void setFO_TYPE2(String fO_TYPE2) {
		FO_TYPE2 = fO_TYPE2;
	}
	public String getFO_TYPE3() {
		return FO_TYPE3;
	}
	public void setFO_TYPE3(String fO_TYPE3) {
		FO_TYPE3 = fO_TYPE3;
	}
	public String getFO_TYPE4() {
		return FO_TYPE4;
	}
	public void setFO_TYPE4(String fO_TYPE4) {
		FO_TYPE4 = fO_TYPE4;
	}
	public String getFO_TYPE5() {
		return FO_TYPE5;
	}
	public void setFO_TYPE5(String fO_TYPE5) {
		FO_TYPE5 = fO_TYPE5;
	}
	public String getFO_INITIATOR0() {
		return FO_INITIATOR0;
	}
	public void setFO_INITIATOR0(String fO_INITIATOR0) {
		FO_INITIATOR0 = fO_INITIATOR0;
	}
	public String getFO_INITIATOR1() {
		return FO_INITIATOR1;
	}
	public void setFO_INITIATOR1(String fO_INITIATOR1) {
		FO_INITIATOR1 = fO_INITIATOR1;
	}
	public String getFO_INITIATOR2() {
		return FO_INITIATOR2;
	}
	public void setFO_INITIATOR2(String fO_INITIATOR2) {
		FO_INITIATOR2 = fO_INITIATOR2;
	}
	public String getFO_INITIATOR3() {
		return FO_INITIATOR3;
	}
	public void setFO_INITIATOR3(String fO_INITIATOR3) {
		FO_INITIATOR3 = fO_INITIATOR3;
	}
	public String getFO_INITIATOR4() {
		return FO_INITIATOR4;
	}
	public void setFO_INITIATOR4(String fO_INITIATOR4) {
		FO_INITIATOR4 = fO_INITIATOR4;
	}
	public String getFO_INITIATOR5() {
		return FO_INITIATOR5;
	}
	public void setFO_INITIATOR5(String fO_INITIATOR5) {
		FO_INITIATOR5 = fO_INITIATOR5;
	}
	public String getFO_MEMO0() {
		return FO_MEMO0;
	}
	public void setFO_MEMO0(String fO_MEMO0) {
		FO_MEMO0 = fO_MEMO0;
	}
	public String getFO_MEMO1() {
		return FO_MEMO1;
	}
	public void setFO_MEMO1(String fO_MEMO1) {
		FO_MEMO1 = fO_MEMO1;
	}
	public String getFO_MEMO2() {
		return FO_MEMO2;
	}
	public void setFO_MEMO2(String fO_MEMO2) {
		FO_MEMO2 = fO_MEMO2;
	}
	public String getFO_MEMO3() {
		return FO_MEMO3;
	}
	public void setFO_MEMO3(String fO_MEMO3) {
		FO_MEMO3 = fO_MEMO3;
	}
	public String getFO_MEMO4() {
		return FO_MEMO4;
	}
	public void setFO_MEMO4(String fO_MEMO4) {
		FO_MEMO4 = fO_MEMO4;
	}
	public String getFO_MEMO5() {
		return FO_MEMO5;
	}
	public void setFO_MEMO5(String fO_MEMO5) {
		FO_MEMO5 = fO_MEMO5;
	}
	public String getFO_AMT0() {
		return FO_AMT0;
	}
	public void setFO_AMT0(String fO_AMT0) {
		FO_AMT0 = fO_AMT0;
	}
	public String getFO_AMT1() {
		return FO_AMT1;
	}
	public void setFO_AMT1(String fO_AMT1) {
		FO_AMT1 = fO_AMT1;
	}
	public String getFO_AMT2() {
		return FO_AMT2;
	}
	public void setFO_AMT2(String fO_AMT2) {
		FO_AMT2 = fO_AMT2;
	}
	public String getFO_AMT3() {
		return FO_AMT3;
	}
	public void setFO_AMT3(String fO_AMT3) {
		FO_AMT3 = fO_AMT3;
	}
	public String getFO_AMT4() {
		return FO_AMT4;
	}
	public void setFO_AMT4(String fO_AMT4) {
		FO_AMT4 = fO_AMT4;
	}
	public String getFO_AMT5() {
		return FO_AMT5;
	}
	public void setFO_AMT5(String fO_AMT5) {
		FO_AMT5 = fO_AMT5;
	}
	public String getFO_CUR_CODE0() {
		return FO_CUR_CODE0;
	}
	public void setFO_CUR_CODE0(String fO_CUR_CODE0) {
		FO_CUR_CODE0 = fO_CUR_CODE0;
	}
	public String getFO_CUR_CODE1() {
		return FO_CUR_CODE1;
	}
	public void setFO_CUR_CODE1(String fO_CUR_CODE1) {
		FO_CUR_CODE1 = fO_CUR_CODE1;
	}
	public String getFO_CUR_CODE2() {
		return FO_CUR_CODE2;
	}
	public void setFO_CUR_CODE2(String fO_CUR_CODE2) {
		FO_CUR_CODE2 = fO_CUR_CODE2;
	}
	public String getFO_CUR_CODE3() {
		return FO_CUR_CODE3;
	}
	public void setFO_CUR_CODE3(String fO_CUR_CODE3) {
		FO_CUR_CODE3 = fO_CUR_CODE3;
	}
	public String getFO_CUR_CODE4() {
		return FO_CUR_CODE4;
	}
	public void setFO_CUR_CODE4(String fO_CUR_CODE4) {
		FO_CUR_CODE4 = fO_CUR_CODE4;
	}
	public String getFO_CUR_CODE5() {
		return FO_CUR_CODE5;
	}
	public void setFO_CUR_CODE5(String fO_CUR_CODE5) {
		FO_CUR_CODE5 = fO_CUR_CODE5;
	}
	public String getFO_CUR_RECON_ACQ0() {
		return FO_CUR_RECON_ACQ0;
	}
	public void setFO_CUR_RECON_ACQ0(String fO_CUR_RECON_ACQ0) {
		FO_CUR_RECON_ACQ0 = fO_CUR_RECON_ACQ0;
	}
	public String getFO_CUR_RECON_ACQ1() {
		return FO_CUR_RECON_ACQ1;
	}
	public void setFO_CUR_RECON_ACQ1(String fO_CUR_RECON_ACQ1) {
		FO_CUR_RECON_ACQ1 = fO_CUR_RECON_ACQ1;
	}
	public String getFO_CUR_RECON_ACQ2() {
		return FO_CUR_RECON_ACQ2;
	}
	public void setFO_CUR_RECON_ACQ2(String fO_CUR_RECON_ACQ2) {
		FO_CUR_RECON_ACQ2 = fO_CUR_RECON_ACQ2;
	}
	public String getFO_CUR_RECON_ACQ3() {
		return FO_CUR_RECON_ACQ3;
	}
	public void setFO_CUR_RECON_ACQ3(String fO_CUR_RECON_ACQ3) {
		FO_CUR_RECON_ACQ3 = fO_CUR_RECON_ACQ3;
	}
	public String getFO_CUR_RECON_ACQ4() {
		return FO_CUR_RECON_ACQ4;
	}
	public void setFO_CUR_RECON_ACQ4(String fO_CUR_RECON_ACQ4) {
		FO_CUR_RECON_ACQ4 = fO_CUR_RECON_ACQ4;
	}
	public String getFO_CUR_RECON_ACQ5() {
		return FO_CUR_RECON_ACQ5;
	}
	public void setFO_CUR_RECON_ACQ5(String fO_CUR_RECON_ACQ5) {
		FO_CUR_RECON_ACQ5 = fO_CUR_RECON_ACQ5;
	}
	public String getFO_CUR_RECON_ISS0() {
		return FO_CUR_RECON_ISS0;
	}
	public void setFO_CUR_RECON_ISS0(String fO_CUR_RECON_ISS0) {
		FO_CUR_RECON_ISS0 = fO_CUR_RECON_ISS0;
	}
	public String getFO_CUR_RECON_ISS1() {
		return FO_CUR_RECON_ISS1;
	}
	public void setFO_CUR_RECON_ISS1(String fO_CUR_RECON_ISS1) {
		FO_CUR_RECON_ISS1 = fO_CUR_RECON_ISS1;
	}
	public String getFO_CUR_RECON_ISS2() {
		return FO_CUR_RECON_ISS2;
	}
	public void setFO_CUR_RECON_ISS2(String fO_CUR_RECON_ISS2) {
		FO_CUR_RECON_ISS2 = fO_CUR_RECON_ISS2;
	}
	public String getFO_CUR_RECON_ISS3() {
		return FO_CUR_RECON_ISS3;
	}
	public void setFO_CUR_RECON_ISS3(String fO_CUR_RECON_ISS3) {
		FO_CUR_RECON_ISS3 = fO_CUR_RECON_ISS3;
	}
	public String getFO_CUR_RECON_ISS4() {
		return FO_CUR_RECON_ISS4;
	}
	public void setFO_CUR_RECON_ISS4(String fO_CUR_RECON_ISS4) {
		FO_CUR_RECON_ISS4 = fO_CUR_RECON_ISS4;
	}
	public String getFO_CUR_RECON_ISS5() {
		return FO_CUR_RECON_ISS5;
	}
	public void setFO_CUR_RECON_ISS5(String fO_CUR_RECON_ISS5) {
		FO_CUR_RECON_ISS5 = fO_CUR_RECON_ISS5;
	}
	public String getFO_DEC_POS0() {
		return FO_DEC_POS0;
	}
	public void setFO_DEC_POS0(String fO_DEC_POS0) {
		FO_DEC_POS0 = fO_DEC_POS0;
	}
	public String getFO_DEC_POS1() {
		return FO_DEC_POS1;
	}
	public void setFO_DEC_POS1(String fO_DEC_POS1) {
		FO_DEC_POS1 = fO_DEC_POS1;
	}
	public String getFO_DEC_POS2() {
		return FO_DEC_POS2;
	}
	public void setFO_DEC_POS2(String fO_DEC_POS2) {
		FO_DEC_POS2 = fO_DEC_POS2;
	}
	public String getFO_DEC_POS3() {
		return FO_DEC_POS3;
	}
	public void setFO_DEC_POS3(String fO_DEC_POS3) {
		FO_DEC_POS3 = fO_DEC_POS3;
	}
	public String getFO_DEC_POS4() {
		return FO_DEC_POS4;
	}
	public void setFO_DEC_POS4(String fO_DEC_POS4) {
		FO_DEC_POS4 = fO_DEC_POS4;
	}
	public String getFO_DEC_POS5() {
		return FO_DEC_POS5;
	}
	public void setFO_DEC_POS5(String fO_DEC_POS5) {
		FO_DEC_POS5 = fO_DEC_POS5;
	}
	public String getFO_CNV_ACQ_RATE0() {
		return FO_CNV_ACQ_RATE0;
	}
	public void setFO_CNV_ACQ_RATE0(String fO_CNV_ACQ_RATE0) {
		FO_CNV_ACQ_RATE0 = fO_CNV_ACQ_RATE0;
	}
	public String getFO_CNV_ACQ_RATE1() {
		return FO_CNV_ACQ_RATE1;
	}
	public void setFO_CNV_ACQ_RATE1(String fO_CNV_ACQ_RATE1) {
		FO_CNV_ACQ_RATE1 = fO_CNV_ACQ_RATE1;
	}
	public String getFO_CNV_ACQ_RATE2() {
		return FO_CNV_ACQ_RATE2;
	}
	public void setFO_CNV_ACQ_RATE2(String fO_CNV_ACQ_RATE2) {
		FO_CNV_ACQ_RATE2 = fO_CNV_ACQ_RATE2;
	}
	public String getFO_CNV_ACQ_RATE3() {
		return FO_CNV_ACQ_RATE3;
	}
	public void setFO_CNV_ACQ_RATE3(String fO_CNV_ACQ_RATE3) {
		FO_CNV_ACQ_RATE3 = fO_CNV_ACQ_RATE3;
	}
	public String getFO_CNV_ACQ_RATE4() {
		return FO_CNV_ACQ_RATE4;
	}
	public void setFO_CNV_ACQ_RATE4(String fO_CNV_ACQ_RATE4) {
		FO_CNV_ACQ_RATE4 = fO_CNV_ACQ_RATE4;
	}
	public String getFO_CNV_ACQ_RATE5() {
		return FO_CNV_ACQ_RATE5;
	}
	public void setFO_CNV_ACQ_RATE5(String fO_CNV_ACQ_RATE5) {
		FO_CNV_ACQ_RATE5 = fO_CNV_ACQ_RATE5;
	}
	public String getFO_CNV_ACQ_DE_POS0() {
		return FO_CNV_ACQ_DE_POS0;
	}
	public void setFO_CNV_ACQ_DE_POS0(String fO_CNV_ACQ_DE_POS0) {
		FO_CNV_ACQ_DE_POS0 = fO_CNV_ACQ_DE_POS0;
	}
	public String getFO_CNV_ACQ_DE_POS1() {
		return FO_CNV_ACQ_DE_POS1;
	}
	public void setFO_CNV_ACQ_DE_POS1(String fO_CNV_ACQ_DE_POS1) {
		FO_CNV_ACQ_DE_POS1 = fO_CNV_ACQ_DE_POS1;
	}
	public String getFO_CNV_ACQ_DE_POS2() {
		return FO_CNV_ACQ_DE_POS2;
	}
	public void setFO_CNV_ACQ_DE_POS2(String fO_CNV_ACQ_DE_POS2) {
		FO_CNV_ACQ_DE_POS2 = fO_CNV_ACQ_DE_POS2;
	}
	public String getFO_CNV_ACQ_DE_POS3() {
		return FO_CNV_ACQ_DE_POS3;
	}
	public void setFO_CNV_ACQ_DE_POS3(String fO_CNV_ACQ_DE_POS3) {
		FO_CNV_ACQ_DE_POS3 = fO_CNV_ACQ_DE_POS3;
	}
	public String getFO_CNV_ACQ_DE_POS4() {
		return FO_CNV_ACQ_DE_POS4;
	}
	public void setFO_CNV_ACQ_DE_POS4(String fO_CNV_ACQ_DE_POS4) {
		FO_CNV_ACQ_DE_POS4 = fO_CNV_ACQ_DE_POS4;
	}
	public String getFO_CNV_ACQ_DE_POS5() {
		return FO_CNV_ACQ_DE_POS5;
	}
	public void setFO_CNV_ACQ_DE_POS5(String fO_CNV_ACQ_DE_POS5) {
		FO_CNV_ACQ_DE_POS5 = fO_CNV_ACQ_DE_POS5;
	}
	public String getFO_AMT_RECON_ACQ0() {
		return FO_AMT_RECON_ACQ0;
	}
	public void setFO_AMT_RECON_ACQ0(String fO_AMT_RECON_ACQ0) {
		FO_AMT_RECON_ACQ0 = fO_AMT_RECON_ACQ0;
	}
	public String getFO_AMT_RECON_ACQ1() {
		return FO_AMT_RECON_ACQ1;
	}
	public void setFO_AMT_RECON_ACQ1(String fO_AMT_RECON_ACQ1) {
		FO_AMT_RECON_ACQ1 = fO_AMT_RECON_ACQ1;
	}
	public String getFO_AMT_RECON_ACQ2() {
		return FO_AMT_RECON_ACQ2;
	}
	public void setFO_AMT_RECON_ACQ2(String fO_AMT_RECON_ACQ2) {
		FO_AMT_RECON_ACQ2 = fO_AMT_RECON_ACQ2;
	}
	public String getFO_AMT_RECON_ACQ3() {
		return FO_AMT_RECON_ACQ3;
	}
	public void setFO_AMT_RECON_ACQ3(String fO_AMT_RECON_ACQ3) {
		FO_AMT_RECON_ACQ3 = fO_AMT_RECON_ACQ3;
	}
	public String getFO_AMT_RECON_ACQ4() {
		return FO_AMT_RECON_ACQ4;
	}
	public void setFO_AMT_RECON_ACQ4(String fO_AMT_RECON_ACQ4) {
		FO_AMT_RECON_ACQ4 = fO_AMT_RECON_ACQ4;
	}
	public String getFO_AMT_RECON_ACQ5() {
		return FO_AMT_RECON_ACQ5;
	}
	public void setFO_AMT_RECON_ACQ5(String fO_AMT_RECON_ACQ5) {
		FO_AMT_RECON_ACQ5 = fO_AMT_RECON_ACQ5;
	}
	public String getFO_CNV_ISS_RATE0() {
		return FO_CNV_ISS_RATE0;
	}
	public void setFO_CNV_ISS_RATE0(String fO_CNV_ISS_RATE0) {
		FO_CNV_ISS_RATE0 = fO_CNV_ISS_RATE0;
	}
	public String getFO_CNV_ISS_RATE1() {
		return FO_CNV_ISS_RATE1;
	}
	public void setFO_CNV_ISS_RATE1(String fO_CNV_ISS_RATE1) {
		FO_CNV_ISS_RATE1 = fO_CNV_ISS_RATE1;
	}
	public String getFO_CNV_ISS_RATE2() {
		return FO_CNV_ISS_RATE2;
	}
	public void setFO_CNV_ISS_RATE2(String fO_CNV_ISS_RATE2) {
		FO_CNV_ISS_RATE2 = fO_CNV_ISS_RATE2;
	}
	public String getFO_CNV_ISS_RATE3() {
		return FO_CNV_ISS_RATE3;
	}
	public void setFO_CNV_ISS_RATE3(String fO_CNV_ISS_RATE3) {
		FO_CNV_ISS_RATE3 = fO_CNV_ISS_RATE3;
	}
	public String getFO_CNV_ISS_RATE4() {
		return FO_CNV_ISS_RATE4;
	}
	public void setFO_CNV_ISS_RATE4(String fO_CNV_ISS_RATE4) {
		FO_CNV_ISS_RATE4 = fO_CNV_ISS_RATE4;
	}
	public String getFO_CNV_ISS_RATE5() {
		return FO_CNV_ISS_RATE5;
	}
	public void setFO_CNV_ISS_RATE5(String fO_CNV_ISS_RATE5) {
		FO_CNV_ISS_RATE5 = fO_CNV_ISS_RATE5;
	}
	public String getFO_CNV_ISS_DE_POS0() {
		return FO_CNV_ISS_DE_POS0;
	}
	public void setFO_CNV_ISS_DE_POS0(String fO_CNV_ISS_DE_POS0) {
		FO_CNV_ISS_DE_POS0 = fO_CNV_ISS_DE_POS0;
	}
	public String getFO_CNV_ISS_DE_POS1() {
		return FO_CNV_ISS_DE_POS1;
	}
	public void setFO_CNV_ISS_DE_POS1(String fO_CNV_ISS_DE_POS1) {
		FO_CNV_ISS_DE_POS1 = fO_CNV_ISS_DE_POS1;
	}
	public String getFO_CNV_ISS_DE_POS2() {
		return FO_CNV_ISS_DE_POS2;
	}
	public void setFO_CNV_ISS_DE_POS2(String fO_CNV_ISS_DE_POS2) {
		FO_CNV_ISS_DE_POS2 = fO_CNV_ISS_DE_POS2;
	}
	public String getFO_CNV_ISS_DE_POS3() {
		return FO_CNV_ISS_DE_POS3;
	}
	public void setFO_CNV_ISS_DE_POS3(String fO_CNV_ISS_DE_POS3) {
		FO_CNV_ISS_DE_POS3 = fO_CNV_ISS_DE_POS3;
	}
	public String getFO_CNV_ISS_DE_POS4() {
		return FO_CNV_ISS_DE_POS4;
	}
	public void setFO_CNV_ISS_DE_POS4(String fO_CNV_ISS_DE_POS4) {
		FO_CNV_ISS_DE_POS4 = fO_CNV_ISS_DE_POS4;
	}
	public String getFO_CNV_ISS_DE_POS5() {
		return FO_CNV_ISS_DE_POS5;
	}
	public void setFO_CNV_ISS_DE_POS5(String fO_CNV_ISS_DE_POS5) {
		FO_CNV_ISS_DE_POS5 = fO_CNV_ISS_DE_POS5;
	}
	public String getFO_AMT_RECON_ISS0() {
		return FO_AMT_RECON_ISS0;
	}
	public void setFO_AMT_RECON_ISS0(String fO_AMT_RECON_ISS0) {
		FO_AMT_RECON_ISS0 = fO_AMT_RECON_ISS0;
	}
	public String getFO_AMT_RECON_ISS1() {
		return FO_AMT_RECON_ISS1;
	}
	public void setFO_AMT_RECON_ISS1(String fO_AMT_RECON_ISS1) {
		FO_AMT_RECON_ISS1 = fO_AMT_RECON_ISS1;
	}
	public String getFO_AMT_RECON_ISS2() {
		return FO_AMT_RECON_ISS2;
	}
	public void setFO_AMT_RECON_ISS2(String fO_AMT_RECON_ISS2) {
		FO_AMT_RECON_ISS2 = fO_AMT_RECON_ISS2;
	}
	public String getFO_AMT_RECON_ISS3() {
		return FO_AMT_RECON_ISS3;
	}
	public void setFO_AMT_RECON_ISS3(String fO_AMT_RECON_ISS3) {
		FO_AMT_RECON_ISS3 = fO_AMT_RECON_ISS3;
	}
	public String getFO_AMT_RECON_ISS4() {
		return FO_AMT_RECON_ISS4;
	}
	public void setFO_AMT_RECON_ISS4(String fO_AMT_RECON_ISS4) {
		FO_AMT_RECON_ISS4 = fO_AMT_RECON_ISS4;
	}
	public String getFO_AMT_RECON_ISS5() {
		return FO_AMT_RECON_ISS5;
	}
	public void setFO_AMT_RECON_ISS5(String fO_AMT_RECON_ISS5) {
		FO_AMT_RECON_ISS5 = fO_AMT_RECON_ISS5;
	}
	public String getFO_AMT_RECON_NET0() {
		return FO_AMT_RECON_NET0;
	}
	public void setFO_AMT_RECON_NET0(String fO_AMT_RECON_NET0) {
		FO_AMT_RECON_NET0 = fO_AMT_RECON_NET0;
	}
	public String getFO_AMT_RECON_NET1() {
		return FO_AMT_RECON_NET1;
	}
	public void setFO_AMT_RECON_NET1(String fO_AMT_RECON_NET1) {
		FO_AMT_RECON_NET1 = fO_AMT_RECON_NET1;
	}
	public String getFO_AMT_RECON_NET2() {
		return FO_AMT_RECON_NET2;
	}
	public void setFO_AMT_RECON_NET2(String fO_AMT_RECON_NET2) {
		FO_AMT_RECON_NET2 = fO_AMT_RECON_NET2;
	}
	public String getFO_AMT_RECON_NET3() {
		return FO_AMT_RECON_NET3;
	}
	public void setFO_AMT_RECON_NET3(String fO_AMT_RECON_NET3) {
		FO_AMT_RECON_NET3 = fO_AMT_RECON_NET3;
	}
	public String getFO_AMT_RECON_NET4() {
		return FO_AMT_RECON_NET4;
	}
	public void setFO_AMT_RECON_NET4(String fO_AMT_RECON_NET4) {
		FO_AMT_RECON_NET4 = fO_AMT_RECON_NET4;
	}
	public String getFO_AMT_RECON_NET5() {
		return FO_AMT_RECON_NET5;
	}
	public void setFO_AMT_RECON_NET5(String fO_AMT_RECON_NET5) {
		FO_AMT_RECON_NET5 = fO_AMT_RECON_NET5;
	}
	public String getEXTENDED_PAY_DATA() {
		return EXTENDED_PAY_DATA;
	}
	public void setEXTENDED_PAY_DATA(String eXTENDED_PAY_DATA) {
		EXTENDED_PAY_DATA = eXTENDED_PAY_DATA;
	}
	public String getDATE_ACTION() {
		return DATE_ACTION;
	}
	public void setDATE_ACTION(String dATE_ACTION) {
		DATE_ACTION = dATE_ACTION;
	}
	public String getAMT_RECON_ACQ() {
		return AMT_RECON_ACQ;
	}
	public void setAMT_RECON_ACQ(String aMT_RECON_ACQ) {
		AMT_RECON_ACQ = aMT_RECON_ACQ;
	}
	public String getCUR_RECON_ACQ() {
		return CUR_RECON_ACQ;
	}
	public void setCUR_RECON_ACQ(String cUR_RECON_ACQ) {
		CUR_RECON_ACQ = cUR_RECON_ACQ;
	}
	public String getAMT_RECON_ISS() {
		return AMT_RECON_ISS;
	}
	public void setAMT_RECON_ISS(String aMT_RECON_ISS) {
		AMT_RECON_ISS = aMT_RECON_ISS;
	}
	public String getCUR_RECON_ISS() {
		return CUR_RECON_ISS;
	}
	public void setCUR_RECON_ISS(String cUR_RECON_ISS) {
		CUR_RECON_ISS = cUR_RECON_ISS;
	}
	public String getPAYEE() {
		return PAYEE;
	}
	public void setPAYEE(String pAYEE) {
		PAYEE = pAYEE;
	}
	public String getACCT_ID_1() {
		return ACCT_ID_1;
	}
	public void setACCT_ID_1(String aCCT_ID_1) {
		ACCT_ID_1 = aCCT_ID_1;
	}
	public String getACCT_ID_2() {
		return ACCT_ID_2;
	}
	public void setACCT_ID_2(String aCCT_ID_2) {
		ACCT_ID_2 = aCCT_ID_2;
	}
	public String getTRAN_DISPOSITION() {
		return TRAN_DISPOSITION;
	}
	public void setTRAN_DISPOSITION(String tRAN_DISPOSITION) {
		TRAN_DISPOSITION = tRAN_DISPOSITION;
	}
	public String getTERM_CLASS() {
		return TERM_CLASS;
	}
	public void setTERM_CLASS(String tERM_CLASS) {
		TERM_CLASS = tERM_CLASS;
	}
	public String getCARD_OWNER() {
		return CARD_OWNER;
	}
	public void setCARD_OWNER(String cARD_OWNER) {
		CARD_OWNER = cARD_OWNER;
	}
	public String getCARD_TYPE() {
		return CARD_TYPE;
	}
	public void setCARD_TYPE(String cARD_TYPE) {
		CARD_TYPE = cARD_TYPE;
	}
	public String getMSG_RESON_CODE_ISS() {
		return MSG_RESON_CODE_ISS;
	}
	public void setMSG_RESON_CODE_ISS(String mSG_RESON_CODE_ISS) {
		MSG_RESON_CODE_ISS = mSG_RESON_CODE_ISS;
	}
	public String getACCT_ID_3() {
		return ACCT_ID_3;
	}
	public void setACCT_ID_3(String aCCT_ID_3) {
		ACCT_ID_3 = aCCT_ID_3;
	}
	public String getACQ_PLAT_PROD_ID() {
		return ACQ_PLAT_PROD_ID;
	}
	public void setACQ_PLAT_PROD_ID(String aCQ_PLAT_PROD_ID) {
		ACQ_PLAT_PROD_ID = aCQ_PLAT_PROD_ID;
	}
	public String getREIMBURSEMENT_ATTR() {
		return REIMBURSEMENT_ATTR;
	}
	public void setREIMBURSEMENT_ATTR(String rEIMBURSEMENT_ATTR) {
		REIMBURSEMENT_ATTR = rEIMBURSEMENT_ATTR;
	}
	public String getREV_BY() {
		return REV_BY;
	}
	public void setREV_BY(String rEV_BY) {
		REV_BY = rEV_BY;
	}
	public String getACCT_TYPES_ISS() {
		return ACCT_TYPES_ISS;
	}
	public void setACCT_TYPES_ISS(String aCCT_TYPES_ISS) {
		ACCT_TYPES_ISS = aCCT_TYPES_ISS;
	}
	public String getPIN_RESULT() {
		return PIN_RESULT;
	}
	public void setPIN_RESULT(String pIN_RESULT) {
		PIN_RESULT = pIN_RESULT;
	}
	public String getMCI_AAV_RESULT_COD() {
		return MCI_AAV_RESULT_COD;
	}
	public void setMCI_AAV_RESULT_COD(String mCI_AAV_RESULT_COD) {
		MCI_AAV_RESULT_COD = mCI_AAV_RESULT_COD;
	}
	public String getMCI_ECS_LVL_IND() {
		return MCI_ECS_LVL_IND;
	}
	public void setMCI_ECS_LVL_IND(String mCI_ECS_LVL_IND) {
		MCI_ECS_LVL_IND = mCI_ECS_LVL_IND;
	}
	public String getCARD_ACPT_SPNSR_ID() {
		return CARD_ACPT_SPNSR_ID;
	}
	public void setCARD_ACPT_SPNSR_ID(String cARD_ACPT_SPNSR_ID) {
		CARD_ACPT_SPNSR_ID = cARD_ACPT_SPNSR_ID;
	}
	public String getPAN_TOKEN() {
		return PAN_TOKEN;
	}
	public void setPAN_TOKEN(String pAN_TOKEN) {
		PAN_TOKEN = pAN_TOKEN;
	}
	public String getADL_RESP_AMT0() {
		return ADL_RESP_AMT0;
	}
	public void setADL_RESP_AMT0(String aDL_RESP_AMT0) {
		ADL_RESP_AMT0 = aDL_RESP_AMT0;
	}
	public String getADL_RESP_AMT1() {
		return ADL_RESP_AMT1;
	}
	public void setADL_RESP_AMT1(String aDL_RESP_AMT1) {
		ADL_RESP_AMT1 = aDL_RESP_AMT1;
	}
	public String getADL_RESP_AMT2() {
		return ADL_RESP_AMT2;
	}
	public void setADL_RESP_AMT2(String aDL_RESP_AMT2) {
		ADL_RESP_AMT2 = aDL_RESP_AMT2;
	}
	public String getADL_RESP_AMT3() {
		return ADL_RESP_AMT3;
	}
	public void setADL_RESP_AMT3(String aDL_RESP_AMT3) {
		ADL_RESP_AMT3 = aDL_RESP_AMT3;
	}
	public String getADL_RESP_AMT4() {
		return ADL_RESP_AMT4;
	}
	public void setADL_RESP_AMT4(String aDL_RESP_AMT4) {
		ADL_RESP_AMT4 = aDL_RESP_AMT4;
	}
	public String getADL_RESP_AMT5() {
		return ADL_RESP_AMT5;
	}
	public void setADL_RESP_AMT5(String aDL_RESP_AMT5) {
		ADL_RESP_AMT5 = aDL_RESP_AMT5;
	}
	public String getADL_RESP_CUR_CODE0() {
		return ADL_RESP_CUR_CODE0;
	}
	public void setADL_RESP_CUR_CODE0(String aDL_RESP_CUR_CODE0) {
		ADL_RESP_CUR_CODE0 = aDL_RESP_CUR_CODE0;
	}
	public String getADL_RESP_CUR_CODE1() {
		return ADL_RESP_CUR_CODE1;
	}
	public void setADL_RESP_CUR_CODE1(String aDL_RESP_CUR_CODE1) {
		ADL_RESP_CUR_CODE1 = aDL_RESP_CUR_CODE1;
	}
	public String getADL_RESP_CUR_CODE2() {
		return ADL_RESP_CUR_CODE2;
	}
	public void setADL_RESP_CUR_CODE2(String aDL_RESP_CUR_CODE2) {
		ADL_RESP_CUR_CODE2 = aDL_RESP_CUR_CODE2;
	}
	public String getADL_RESP_CUR_CODE3() {
		return ADL_RESP_CUR_CODE3;
	}
	public void setADL_RESP_CUR_CODE3(String aDL_RESP_CUR_CODE3) {
		ADL_RESP_CUR_CODE3 = aDL_RESP_CUR_CODE3;
	}
	public String getADL_RESP_CUR_CODE4() {
		return ADL_RESP_CUR_CODE4;
	}
	public void setADL_RESP_CUR_CODE4(String aDL_RESP_CUR_CODE4) {
		ADL_RESP_CUR_CODE4 = aDL_RESP_CUR_CODE4;
	}
	public String getADL_RESP_CUR_CODE5() {
		return ADL_RESP_CUR_CODE5;
	}
	public void setADL_RESP_CUR_CODE5(String aDL_RESP_CUR_CODE5) {
		ADL_RESP_CUR_CODE5 = aDL_RESP_CUR_CODE5;
	}
	public String getADL_RESP_AMT_TYP0() {
		return ADL_RESP_AMT_TYP0;
	}
	public void setADL_RESP_AMT_TYP0(String aDL_RESP_AMT_TYP0) {
		ADL_RESP_AMT_TYP0 = aDL_RESP_AMT_TYP0;
	}
	public String getADL_RESP_AMT_TYP1() {
		return ADL_RESP_AMT_TYP1;
	}
	public void setADL_RESP_AMT_TYP1(String aDL_RESP_AMT_TYP1) {
		ADL_RESP_AMT_TYP1 = aDL_RESP_AMT_TYP1;
	}
	public String getADL_RESP_AMT_TYP2() {
		return ADL_RESP_AMT_TYP2;
	}
	public void setADL_RESP_AMT_TYP2(String aDL_RESP_AMT_TYP2) {
		ADL_RESP_AMT_TYP2 = aDL_RESP_AMT_TYP2;
	}
	public String getADL_RESP_AMT_TYP3() {
		return ADL_RESP_AMT_TYP3;
	}
	public void setADL_RESP_AMT_TYP3(String aDL_RESP_AMT_TYP3) {
		ADL_RESP_AMT_TYP3 = aDL_RESP_AMT_TYP3;
	}
	public String getADL_RESP_AMT_TYP4() {
		return ADL_RESP_AMT_TYP4;
	}
	public void setADL_RESP_AMT_TYP4(String aDL_RESP_AMT_TYP4) {
		ADL_RESP_AMT_TYP4 = aDL_RESP_AMT_TYP4;
	}
	public String getADL_RESP_AMT_TYP5() {
		return ADL_RESP_AMT_TYP5;
	}
	public void setADL_RESP_AMT_TYP5(String aDL_RESP_AMT_TYP5) {
		ADL_RESP_AMT_TYP5 = aDL_RESP_AMT_TYP5;
	}
	public String getADL_RESP_ACCT_IDX0() {
		return ADL_RESP_ACCT_IDX0;
	}
	public void setADL_RESP_ACCT_IDX0(String aDL_RESP_ACCT_IDX0) {
		ADL_RESP_ACCT_IDX0 = aDL_RESP_ACCT_IDX0;
	}
	public String getADL_RESP_ACCT_IDX1() {
		return ADL_RESP_ACCT_IDX1;
	}
	public void setADL_RESP_ACCT_IDX1(String aDL_RESP_ACCT_IDX1) {
		ADL_RESP_ACCT_IDX1 = aDL_RESP_ACCT_IDX1;
	}
	public String getADL_RESP_ACCT_IDX2() {
		return ADL_RESP_ACCT_IDX2;
	}
	public void setADL_RESP_ACCT_IDX2(String aDL_RESP_ACCT_IDX2) {
		ADL_RESP_ACCT_IDX2 = aDL_RESP_ACCT_IDX2;
	}
	public String getADL_RESP_ACCT_IDX3() {
		return ADL_RESP_ACCT_IDX3;
	}
	public void setADL_RESP_ACCT_IDX3(String aDL_RESP_ACCT_IDX3) {
		ADL_RESP_ACCT_IDX3 = aDL_RESP_ACCT_IDX3;
	}
	public String getADL_RESP_ACCT_IDX4() {
		return ADL_RESP_ACCT_IDX4;
	}
	public void setADL_RESP_ACCT_IDX4(String aDL_RESP_ACCT_IDX4) {
		ADL_RESP_ACCT_IDX4 = aDL_RESP_ACCT_IDX4;
	}
	public String getADL_RESP_ACCT_IDX5() {
		return ADL_RESP_ACCT_IDX5;
	}
	public void setADL_RESP_ACCT_IDX5(String aDL_RESP_ACCT_IDX5) {
		ADL_RESP_ACCT_IDX5 = aDL_RESP_ACCT_IDX5;
	}
	public String getADL_RESP_ACCT_TYP0() {
		return ADL_RESP_ACCT_TYP0;
	}
	public void setADL_RESP_ACCT_TYP0(String aDL_RESP_ACCT_TYP0) {
		ADL_RESP_ACCT_TYP0 = aDL_RESP_ACCT_TYP0;
	}
	public String getADL_RESP_ACCT_TYP1() {
		return ADL_RESP_ACCT_TYP1;
	}
	public void setADL_RESP_ACCT_TYP1(String aDL_RESP_ACCT_TYP1) {
		ADL_RESP_ACCT_TYP1 = aDL_RESP_ACCT_TYP1;
	}
	public String getADL_RESP_ACCT_TYP2() {
		return ADL_RESP_ACCT_TYP2;
	}
	public void setADL_RESP_ACCT_TYP2(String aDL_RESP_ACCT_TYP2) {
		ADL_RESP_ACCT_TYP2 = aDL_RESP_ACCT_TYP2;
	}
	public String getADL_RESP_ACCT_TYP3() {
		return ADL_RESP_ACCT_TYP3;
	}
	public void setADL_RESP_ACCT_TYP3(String aDL_RESP_ACCT_TYP3) {
		ADL_RESP_ACCT_TYP3 = aDL_RESP_ACCT_TYP3;
	}
	public String getADL_RESP_ACCT_TYP4() {
		return ADL_RESP_ACCT_TYP4;
	}
	public void setADL_RESP_ACCT_TYP4(String aDL_RESP_ACCT_TYP4) {
		ADL_RESP_ACCT_TYP4 = aDL_RESP_ACCT_TYP4;
	}
	public String getADL_RESP_ACCT_TYP5() {
		return ADL_RESP_ACCT_TYP5;
	}
	public void setADL_RESP_ACCT_TYP5(String aDL_RESP_ACCT_TYP5) {
		ADL_RESP_ACCT_TYP5 = aDL_RESP_ACCT_TYP5;
	}
	public String getCAN_ITEM_VALUE0() {
		return CAN_ITEM_VALUE0;
	}
	public void setCAN_ITEM_VALUE0(String cAN_ITEM_VALUE0) {
		CAN_ITEM_VALUE0 = cAN_ITEM_VALUE0;
	}
	public String getCAN_ITEM_VALUE1() {
		return CAN_ITEM_VALUE1;
	}
	public void setCAN_ITEM_VALUE1(String cAN_ITEM_VALUE1) {
		CAN_ITEM_VALUE1 = cAN_ITEM_VALUE1;
	}
	public String getCAN_ITEM_VALUE2() {
		return CAN_ITEM_VALUE2;
	}
	public void setCAN_ITEM_VALUE2(String cAN_ITEM_VALUE2) {
		CAN_ITEM_VALUE2 = cAN_ITEM_VALUE2;
	}
	public String getCAN_ITEM_VALUE3() {
		return CAN_ITEM_VALUE3;
	}
	public void setCAN_ITEM_VALUE3(String cAN_ITEM_VALUE3) {
		CAN_ITEM_VALUE3 = cAN_ITEM_VALUE3;
	}
	public String getCAN_ITEM_VALUE4() {
		return CAN_ITEM_VALUE4;
	}
	public void setCAN_ITEM_VALUE4(String cAN_ITEM_VALUE4) {
		CAN_ITEM_VALUE4 = cAN_ITEM_VALUE4;
	}
	public String getCAN_ITEM_VALUE5() {
		return CAN_ITEM_VALUE5;
	}
	public void setCAN_ITEM_VALUE5(String cAN_ITEM_VALUE5) {
		CAN_ITEM_VALUE5 = cAN_ITEM_VALUE5;
	}
	public String getCAN_ITEM_VALUE6() {
		return CAN_ITEM_VALUE6;
	}
	public void setCAN_ITEM_VALUE6(String cAN_ITEM_VALUE6) {
		CAN_ITEM_VALUE6 = cAN_ITEM_VALUE6;
	}
	public String getCAN_ITEM_VALUE7() {
		return CAN_ITEM_VALUE7;
	}
	public void setCAN_ITEM_VALUE7(String cAN_ITEM_VALUE7) {
		CAN_ITEM_VALUE7 = cAN_ITEM_VALUE7;
	}
	public String getCAN_NO_ITEMS_DISP0() {
		return CAN_NO_ITEMS_DISP0;
	}
	public void setCAN_NO_ITEMS_DISP0(String cAN_NO_ITEMS_DISP0) {
		CAN_NO_ITEMS_DISP0 = cAN_NO_ITEMS_DISP0;
	}
	public String getCAN_NO_ITEMS_DISP1() {
		return CAN_NO_ITEMS_DISP1;
	}
	public void setCAN_NO_ITEMS_DISP1(String cAN_NO_ITEMS_DISP1) {
		CAN_NO_ITEMS_DISP1 = cAN_NO_ITEMS_DISP1;
	}
	public String getCAN_NO_ITEMS_DISP2() {
		return CAN_NO_ITEMS_DISP2;
	}
	public void setCAN_NO_ITEMS_DISP2(String cAN_NO_ITEMS_DISP2) {
		CAN_NO_ITEMS_DISP2 = cAN_NO_ITEMS_DISP2;
	}
	public String getCAN_NO_ITEMS_DISP3() {
		return CAN_NO_ITEMS_DISP3;
	}
	public void setCAN_NO_ITEMS_DISP3(String cAN_NO_ITEMS_DISP3) {
		CAN_NO_ITEMS_DISP3 = cAN_NO_ITEMS_DISP3;
	}
	public String getCAN_NO_ITEMS_DISP4() {
		return CAN_NO_ITEMS_DISP4;
	}
	public void setCAN_NO_ITEMS_DISP4(String cAN_NO_ITEMS_DISP4) {
		CAN_NO_ITEMS_DISP4 = cAN_NO_ITEMS_DISP4;
	}
	public String getCAN_NO_ITEMS_DISP5() {
		return CAN_NO_ITEMS_DISP5;
	}
	public void setCAN_NO_ITEMS_DISP5(String cAN_NO_ITEMS_DISP5) {
		CAN_NO_ITEMS_DISP5 = cAN_NO_ITEMS_DISP5;
	}
	public String getCAN_NO_ITEMS_DISP6() {
		return CAN_NO_ITEMS_DISP6;
	}
	public void setCAN_NO_ITEMS_DISP6(String cAN_NO_ITEMS_DISP6) {
		CAN_NO_ITEMS_DISP6 = cAN_NO_ITEMS_DISP6;
	}
	public String getCAN_NO_ITEMS_DISP7() {
		return CAN_NO_ITEMS_DISP7;
	}
	public void setCAN_NO_ITEMS_DISP7(String cAN_NO_ITEMS_DISP7) {
		CAN_NO_ITEMS_DISP7 = cAN_NO_ITEMS_DISP7;
	}
	public String getCAN_ORIG_NO_ITEMS0() {
		return CAN_ORIG_NO_ITEMS0;
	}
	public void setCAN_ORIG_NO_ITEMS0(String cAN_ORIG_NO_ITEMS0) {
		CAN_ORIG_NO_ITEMS0 = cAN_ORIG_NO_ITEMS0;
	}
	public String getCAN_ORIG_NO_ITEMS1() {
		return CAN_ORIG_NO_ITEMS1;
	}
	public void setCAN_ORIG_NO_ITEMS1(String cAN_ORIG_NO_ITEMS1) {
		CAN_ORIG_NO_ITEMS1 = cAN_ORIG_NO_ITEMS1;
	}
	public String getCAN_ORIG_NO_ITEMS2() {
		return CAN_ORIG_NO_ITEMS2;
	}
	public void setCAN_ORIG_NO_ITEMS2(String cAN_ORIG_NO_ITEMS2) {
		CAN_ORIG_NO_ITEMS2 = cAN_ORIG_NO_ITEMS2;
	}
	public String getCAN_ORIG_NO_ITEMS3() {
		return CAN_ORIG_NO_ITEMS3;
	}
	public void setCAN_ORIG_NO_ITEMS3(String cAN_ORIG_NO_ITEMS3) {
		CAN_ORIG_NO_ITEMS3 = cAN_ORIG_NO_ITEMS3;
	}
	public String getCAN_ORIG_NO_ITEMS4() {
		return CAN_ORIG_NO_ITEMS4;
	}
	public void setCAN_ORIG_NO_ITEMS4(String cAN_ORIG_NO_ITEMS4) {
		CAN_ORIG_NO_ITEMS4 = cAN_ORIG_NO_ITEMS4;
	}
	public String getCAN_ORIG_NO_ITEMS5() {
		return CAN_ORIG_NO_ITEMS5;
	}
	public void setCAN_ORIG_NO_ITEMS5(String cAN_ORIG_NO_ITEMS5) {
		CAN_ORIG_NO_ITEMS5 = cAN_ORIG_NO_ITEMS5;
	}
	public String getCAN_ORIG_NO_ITEMS6() {
		return CAN_ORIG_NO_ITEMS6;
	}
	public void setCAN_ORIG_NO_ITEMS6(String cAN_ORIG_NO_ITEMS6) {
		CAN_ORIG_NO_ITEMS6 = cAN_ORIG_NO_ITEMS6;
	}
	public String getCAN_ORIG_NO_ITEMS7() {
		return CAN_ORIG_NO_ITEMS7;
	}
	public void setCAN_ORIG_NO_ITEMS7(String cAN_ORIG_NO_ITEMS7) {
		CAN_ORIG_NO_ITEMS7 = cAN_ORIG_NO_ITEMS7;
	}
	public String getCED_BUILD_NO() {
		return CED_BUILD_NO;
	}
	public void setCED_BUILD_NO(String cED_BUILD_NO) {
		CED_BUILD_NO = cED_BUILD_NO;
	}
	public String getCUR_TYPE() {
		return CUR_TYPE;
	}
	public void setCUR_TYPE(String cUR_TYPE) {
		CUR_TYPE = cUR_TYPE;
	}
	public String getTIME_AT_AP() {
		return TIME_AT_AP;
	}
	public void setTIME_AT_AP(String tIME_AT_AP) {
		TIME_AT_AP = tIME_AT_AP;
	}
	public String getTIME_AT_ISS() {
		return TIME_AT_ISS;
	}
	public void setTIME_AT_ISS(String tIME_AT_ISS) {
		TIME_AT_ISS = tIME_AT_ISS;
	}
	public String getTIME_AT_RESP_QUE() {
		return TIME_AT_RESP_QUE;
	}
	public void setTIME_AT_RESP_QUE(String tIME_AT_RESP_QUE) {
		TIME_AT_RESP_QUE = tIME_AT_RESP_QUE;
	}
	public String getTIME_AT_RESP_SWTCH() {
		return TIME_AT_RESP_SWTCH;
	}
	public void setTIME_AT_RESP_SWTCH(String tIME_AT_RESP_SWTCH) {
		TIME_AT_RESP_SWTCH = tIME_AT_RESP_SWTCH;
	}
	public String getTIME_AT_RQST_QUE() {
		return TIME_AT_RQST_QUE;
	}
	public void setTIME_AT_RQST_QUE(String tIME_AT_RQST_QUE) {
		TIME_AT_RQST_QUE = tIME_AT_RQST_QUE;
	}
	public String getTIME_AT_RQST_SWTCH() {
		return TIME_AT_RQST_SWTCH;
	}
	public void setTIME_AT_RQST_SWTCH(String tIME_AT_RQST_SWTCH) {
		TIME_AT_RQST_SWTCH = tIME_AT_RQST_SWTCH;
	}
	public String getO_AMT_CARD_BILL() {
		return O_AMT_CARD_BILL;
	}
	public void setO_AMT_CARD_BILL(String o_AMT_CARD_BILL) {
		O_AMT_CARD_BILL = o_AMT_CARD_BILL;
	}
	public String getO_AMT_RECON_ACQ() {
		return O_AMT_RECON_ACQ;
	}
	public void setO_AMT_RECON_ACQ(String o_AMT_RECON_ACQ) {
		O_AMT_RECON_ACQ = o_AMT_RECON_ACQ;
	}
	public String getO_AMT_RECON_ISS() {
		return O_AMT_RECON_ISS;
	}
	public void setO_AMT_RECON_ISS(String o_AMT_RECON_ISS) {
		O_AMT_RECON_ISS = o_AMT_RECON_ISS;
	}
	public String getAP_ERROR_NO() {
		return AP_ERROR_NO;
	}
	public void setAP_ERROR_NO(String aP_ERROR_NO) {
		AP_ERROR_NO = aP_ERROR_NO;
	}
	public String getAP_ERROR_TRACE_LOC() {
		return AP_ERROR_TRACE_LOC;
	}
	public void setAP_ERROR_TRACE_LOC(String aP_ERROR_TRACE_LOC) {
		AP_ERROR_TRACE_LOC = aP_ERROR_TRACE_LOC;
	}
	public String getAP_REJ_REASON_CODE() {
		return AP_REJ_REASON_CODE;
	}
	public void setAP_REJ_REASON_CODE(String aP_REJ_REASON_CODE) {
		AP_REJ_REASON_CODE = aP_REJ_REASON_CODE;
	}
	public String getAUTH_RQST_TIMEOUT() {
		return AUTH_RQST_TIMEOUT;
	}
	public void setAUTH_RQST_TIMEOUT(String aUTH_RQST_TIMEOUT) {
		AUTH_RQST_TIMEOUT = aUTH_RQST_TIMEOUT;
	}
	public String getPIN_DATA_FMT() {
		return PIN_DATA_FMT;
	}
	public void setPIN_DATA_FMT(String pIN_DATA_FMT) {
		PIN_DATA_FMT = pIN_DATA_FMT;
	}
	public String getPMC_ERROR() {
		return PMC_ERROR;
	}
	public void setPMC_ERROR(String pMC_ERROR) {
		PMC_ERROR = pMC_ERROR;
	}
	public String getPREAUTH_COMP_OPT() {
		return PREAUTH_COMP_OPT;
	}
	public void setPREAUTH_COMP_OPT(String pREAUTH_COMP_OPT) {
		PREAUTH_COMP_OPT = pREAUTH_COMP_OPT;
	}
	public String getUSAGE_UPDATE_BITS() {
		return USAGE_UPDATE_BITS;
	}
	public void setUSAGE_UPDATE_BITS(String uSAGE_UPDATE_BITS) {
		USAGE_UPDATE_BITS = uSAGE_UPDATE_BITS;
	}
	public String getORIG_AMT_TRAN_ADJ() {
		return ORIG_AMT_TRAN_ADJ;
	}
	public void setORIG_AMT_TRAN_ADJ(String oRIG_AMT_TRAN_ADJ) {
		ORIG_AMT_TRAN_ADJ = oRIG_AMT_TRAN_ADJ;
	}
	public String getCIRC_ID_ACQ() {
		return CIRC_ID_ACQ;
	}
	public void setCIRC_ID_ACQ(String cIRC_ID_ACQ) {
		CIRC_ID_ACQ = cIRC_ID_ACQ;
	}
	public String getCIRC_ID_ISS() {
		return CIRC_ID_ISS;
	}
	public void setCIRC_ID_ISS(String cIRC_ID_ISS) {
		CIRC_ID_ISS = cIRC_ID_ISS;
	}
	public String getMERCH_TYPE() {
		return MERCH_TYPE;
	}
	public void setMERCH_TYPE(String mERCH_TYPE) {
		MERCH_TYPE = mERCH_TYPE;
	}
	public String getACCT_QUAL_1() {
		return ACCT_QUAL_1;
	}
	public void setACCT_QUAL_1(String aCCT_QUAL_1) {
		ACCT_QUAL_1 = aCCT_QUAL_1;
	}
	public String getACCT_QUAL_2() {
		return ACCT_QUAL_2;
	}
	public void setACCT_QUAL_2(String aCCT_QUAL_2) {
		ACCT_QUAL_2 = aCCT_QUAL_2;
	}
	public String getAP_FLG() {
		return AP_FLG;
	}
	public void setAP_FLG(String aP_FLG) {
		AP_FLG = aP_FLG;
	}
	public String getDRAFT_CAPTURE_FLG() {
		return DRAFT_CAPTURE_FLG;
	}
	public void setDRAFT_CAPTURE_FLG(String dRAFT_CAPTURE_FLG) {
		DRAFT_CAPTURE_FLG = dRAFT_CAPTURE_FLG;
	}
	public String getEXCHG_MASTER() {
		return EXCHG_MASTER;
	}
	public void setEXCHG_MASTER(String eXCHG_MASTER) {
		EXCHG_MASTER = eXCHG_MASTER;
	}
	public String getEXCHG_SETL() {
		return EXCHG_SETL;
	}
	public void setEXCHG_SETL(String eXCHG_SETL) {
		EXCHG_SETL = eXCHG_SETL;
	}
	public String getHOST_RECV_FLG() {
		return HOST_RECV_FLG;
	}
	public void setHOST_RECV_FLG(String hOST_RECV_FLG) {
		HOST_RECV_FLG = hOST_RECV_FLG;
	}
	public String getHOST_SENT_FLG() {
		return HOST_SENT_FLG;
	}
	public void setHOST_SENT_FLG(String hOST_SENT_FLG) {
		HOST_SENT_FLG = hOST_SENT_FLG;
	}
	public String getOAR_RQST_FLG() {
		return OAR_RQST_FLG;
	}
	public void setOAR_RQST_FLG(String oAR_RQST_FLG) {
		OAR_RQST_FLG = oAR_RQST_FLG;
	}
	public String getPRString_MASK_ID() {
		return PRString_MASK_ID;
	}
	public void setPRString_MASK_ID(String pRString_MASK_ID) {
		PRString_MASK_ID = pRString_MASK_ID;
	}
	public String getTSTAMP_REV_CREATED() {
		return TSTAMP_REV_CREATED;
	}
	public void setTSTAMP_REV_CREATED(String tSTAMP_REV_CREATED) {
		TSTAMP_REV_CREATED = tSTAMP_REV_CREATED;
	}
	public String getACCT_TYPE_1() {
		return ACCT_TYPE_1;
	}
	public void setACCT_TYPE_1(String aCCT_TYPE_1) {
		ACCT_TYPE_1 = aCCT_TYPE_1;
	}
	public String getACCT_TYPE_2() {
		return ACCT_TYPE_2;
	}
	public void setACCT_TYPE_2(String aCCT_TYPE_2) {
		ACCT_TYPE_2 = aCCT_TYPE_2;
	}
	public String getACCT_TYPE_3() {
		return ACCT_TYPE_3;
	}
	public void setACCT_TYPE_3(String aCCT_TYPE_3) {
		ACCT_TYPE_3 = aCCT_TYPE_3;
	}
	public String getALT_ROUTE_FLG() {
		return ALT_ROUTE_FLG;
	}
	public void setALT_ROUTE_FLG(String aLT_ROUTE_FLG) {
		ALT_ROUTE_FLG = aLT_ROUTE_FLG;
	}
	public String getAP_APPROVAL_CODE() {
		return AP_APPROVAL_CODE;
	}
	public void setAP_APPROVAL_CODE(String aP_APPROVAL_CODE) {
		AP_APPROVAL_CODE = aP_APPROVAL_CODE;
	}
	public String getAP_CARD_GRP() {
		return AP_CARD_GRP;
	}
	public void setAP_CARD_GRP(String aP_CARD_GRP) {
		AP_CARD_GRP = aP_CARD_GRP;
	}
	public String getAP_DATA() {
		return AP_DATA;
	}
	public void setAP_DATA(String aP_DATA) {
		AP_DATA = aP_DATA;
	}
	public String getCNTRY_RCN_ACQ_INST() {
		return CNTRY_RCN_ACQ_INST;
	}
	public void setCNTRY_RCN_ACQ_INST(String cNTRY_RCN_ACQ_INST) {
		CNTRY_RCN_ACQ_INST = cNTRY_RCN_ACQ_INST;
	}
	public String getCNTRY_RCN_ISS_INST() {
		return CNTRY_RCN_ISS_INST;
	}
	public void setCNTRY_RCN_ISS_INST(String cNTRY_RCN_ISS_INST) {
		CNTRY_RCN_ISS_INST = cNTRY_RCN_ISS_INST;
	}
	public String getCARD_ACPT_COUNTY() {
		return CARD_ACPT_COUNTY;
	}
	public void setCARD_ACPT_COUNTY(String cARD_ACPT_COUNTY) {
		CARD_ACPT_COUNTY = cARD_ACPT_COUNTY;
	}
	public String getCARD_CAPT_FLG() {
		return CARD_CAPT_FLG;
	}
	public void setCARD_CAPT_FLG(String cARD_CAPT_FLG) {
		CARD_CAPT_FLG = cARD_CAPT_FLG;
	}
	public String getDEPOSIT_ONLY_FLG() {
		return DEPOSIT_ONLY_FLG;
	}
	public void setDEPOSIT_ONLY_FLG(String dEPOSIT_ONLY_FLG) {
		DEPOSIT_ONLY_FLG = dEPOSIT_ONLY_FLG;
	}
	public String getTRAN_FROM_ACCT_FLG() {
		return TRAN_FROM_ACCT_FLG;
	}
	public void setTRAN_FROM_ACCT_FLG(String tRAN_FROM_ACCT_FLG) {
		TRAN_FROM_ACCT_FLG = tRAN_FROM_ACCT_FLG;
	}
	public String getTRAN_TO_ACCT_FLG() {
		return TRAN_TO_ACCT_FLG;
	}
	public void setTRAN_TO_ACCT_FLG(String tRAN_TO_ACCT_FLG) {
		TRAN_TO_ACCT_FLG = tRAN_TO_ACCT_FLG;
	}
	public String getRECON_IND_ACQ() {
		return RECON_IND_ACQ;
	}
	public void setRECON_IND_ACQ(String rECON_IND_ACQ) {
		RECON_IND_ACQ = rECON_IND_ACQ;
	}
	public String getRESTRIC_StringCHG_GRP() {
		return RESTRIC_StringCHG_GRP;
	}
	public void setRESTRIC_StringCHG_GRP(String rESTRIC_StringCHG_GRP) {
		RESTRIC_StringCHG_GRP = rESTRIC_StringCHG_GRP;
	}
	public String getSOURCE_ROUTE_ID() {
		return SOURCE_ROUTE_ID;
	}
	public void setSOURCE_ROUTE_ID(String sOURCE_ROUTE_ID) {
		SOURCE_ROUTE_ID = sOURCE_ROUTE_ID;
	}
	public String getSTANDIN_ACT() {
		return STANDIN_ACT;
	}
	public void setSTANDIN_ACT(String sTANDIN_ACT) {
		STANDIN_ACT = sTANDIN_ACT;
	}
	public String getSTANDIN_OPTION() {
		return STANDIN_OPTION;
	}
	public void setSTANDIN_OPTION(String sTANDIN_OPTION) {
		STANDIN_OPTION = sTANDIN_OPTION;
	}
	public String getTRACK_INFO_KEY_ID() {
		return TRACK_INFO_KEY_ID;
	}
	public void setTRACK_INFO_KEY_ID(String tRACK_INFO_KEY_ID) {
		TRACK_INFO_KEY_ID = tRACK_INFO_KEY_ID;
	}
	public String getTRACINF_KEYTRAC_NO() {
		return TRACINF_KEYTRAC_NO;
	}
	public void setTRACINF_KEYTRAC_NO(String tRACINF_KEYTRAC_NO) {
		TRACINF_KEYTRAC_NO = tRACINF_KEYTRAC_NO;
	}
	public String getCNTRY_REC_INST_ADJ() {
		return CNTRY_REC_INST_ADJ;
	}
	public void setCNTRY_REC_INST_ADJ(String cNTRY_REC_INST_ADJ) {
		CNTRY_REC_INST_ADJ = cNTRY_REC_INST_ADJ;
	}
	public String getCNTRY_REQ_INST_ADJ() {
		return CNTRY_REQ_INST_ADJ;
	}
	public void setCNTRY_REQ_INST_ADJ(String cNTRY_REQ_INST_ADJ) {
		CNTRY_REQ_INST_ADJ = cNTRY_REQ_INST_ADJ;
	}
	public String getBRANCH_ID_ACQ() {
		return BRANCH_ID_ACQ;
	}
	public void setBRANCH_ID_ACQ(String bRANCH_ID_ACQ) {
		BRANCH_ID_ACQ = bRANCH_ID_ACQ;
	}
	public String getINST_ID_REC_ADJ() {
		return INST_ID_REC_ADJ;
	}
	public void setINST_ID_REC_ADJ(String iNST_ID_REC_ADJ) {
		INST_ID_REC_ADJ = iNST_ID_REC_ADJ;
	}
	public String getINST_ID_REQ_ADJ() {
		return INST_ID_REQ_ADJ;
	}
	public void setINST_ID_REQ_ADJ(String iNST_ID_REQ_ADJ) {
		INST_ID_REQ_ADJ = iNST_ID_REQ_ADJ;
	}
	public String getNET_IND_ADJ() {
		return NET_IND_ADJ;
	}
	public void setNET_IND_ADJ(String nET_IND_ADJ) {
		NET_IND_ADJ = nET_IND_ADJ;
	}
	public String getTSTAMP_LOCAL_ADJ() {
		return TSTAMP_LOCAL_ADJ;
	}
	public void setTSTAMP_LOCAL_ADJ(String tSTAMP_LOCAL_ADJ) {
		TSTAMP_LOCAL_ADJ = tSTAMP_LOCAL_ADJ;
	}
	public String getTSTAMP_TRANS_ADJ() {
		return TSTAMP_TRANS_ADJ;
	}
	public void setTSTAMP_TRANS_ADJ(String tSTAMP_TRANS_ADJ) {
		TSTAMP_TRANS_ADJ = tSTAMP_TRANS_ADJ;
	}
	public String getREQ_ACQ_ISS_IND() {
		return REQ_ACQ_ISS_IND;
	}
	public void setREQ_ACQ_ISS_IND(String rEQ_ACQ_ISS_IND) {
		REQ_ACQ_ISS_IND = rEQ_ACQ_ISS_IND;
	}
	public String getTRACE_DATA_ADJ() {
		return TRACE_DATA_ADJ;
	}
	public void setTRACE_DATA_ADJ(String tRACE_DATA_ADJ) {
		TRACE_DATA_ADJ = tRACE_DATA_ADJ;
	}
	public String getISS_ACQ_TYPE_FEE() {
		return ISS_ACQ_TYPE_FEE;
	}
	public void setISS_ACQ_TYPE_FEE(String iSS_ACQ_TYPE_FEE) {
		ISS_ACQ_TYPE_FEE = iSS_ACQ_TYPE_FEE;
	}
	public String getMCI_UCAF_DATA() {
		return MCI_UCAF_DATA;
	}
	public void setMCI_UCAF_DATA(String mCI_UCAF_DATA) {
		MCI_UCAF_DATA = mCI_UCAF_DATA;
	}
	public String getMERCH_TIER_ID() {
		return MERCH_TIER_ID;
	}
	public void setMERCH_TIER_ID(String mERCH_TIER_ID) {
		MERCH_TIER_ID = mERCH_TIER_ID;
	}
	public String getTRAN_UNIQ_DATA_FMT() {
		return TRAN_UNIQ_DATA_FMT;
	}
	public void setTRAN_UNIQ_DATA_FMT(String tRAN_UNIQ_DATA_FMT) {
		TRAN_UNIQ_DATA_FMT = tRAN_UNIQ_DATA_FMT;
	}
	public String getBIN_EXCLUSION_GRP() {
		return BIN_EXCLUSION_GRP;
	}
	public void setBIN_EXCLUSION_GRP(String bIN_EXCLUSION_GRP) {
		BIN_EXCLUSION_GRP = bIN_EXCLUSION_GRP;
	}
	public String getCARD_LOGO_ID() {
		return CARD_LOGO_ID;
	}
	public void setCARD_LOGO_ID(String cARD_LOGO_ID) {
		CARD_LOGO_ID = cARD_LOGO_ID;
	}
	public String getNET_StringRCHG_TIER() {
		return NET_StringRCHG_TIER;
	}
	public void setNET_StringRCHG_TIER(String nET_StringRCHG_TIER) {
		NET_StringRCHG_TIER = nET_StringRCHG_TIER;
	}
	public String getINST_TIER() {
		return INST_TIER;
	}
	public void setINST_TIER(String iNST_TIER) {
		INST_TIER = iNST_TIER;
	}
	public String getCARD_StringRCHG_ID() {
		return CARD_StringRCHG_ID;
	}
	public void setCARD_StringRCHG_ID(String cARD_StringRCHG_ID) {
		CARD_StringRCHG_ID = cARD_StringRCHG_ID;
	}
	public String getPROGRAM_ID() {
		return PROGRAM_ID;
	}
	public void setPROGRAM_ID(String pROGRAM_ID) {
		PROGRAM_ID = pROGRAM_ID;
	}
	public String getPIN_FLG() {
		return PIN_FLG;
	}
	public void setPIN_FLG(String pIN_FLG) {
		PIN_FLG = pIN_FLG;
	}
	public String getNETWORK_PROGRAM() {
		return NETWORK_PROGRAM;
	}
	public void setNETWORK_PROGRAM(String nETWORK_PROGRAM) {
		NETWORK_PROGRAM = nETWORK_PROGRAM;
	}
	public String getWEIGHTED_AVE_FLG() {
		return WEIGHTED_AVE_FLG;
	}
	public void setWEIGHTED_AVE_FLG(String wEIGHTED_AVE_FLG) {
		WEIGHTED_AVE_FLG = wEIGHTED_AVE_FLG;
	}
	public String getTOKEN_ASSURANCE() {
		return TOKEN_ASSURANCE;
	}
	public void setTOKEN_ASSURANCE(String tOKEN_ASSURANCE) {
		TOKEN_ASSURANCE = tOKEN_ASSURANCE;
	}
	public String getTOKEN_REQUESTOR_ID() {
		return TOKEN_REQUESTOR_ID;
	}
	public void setTOKEN_REQUESTOR_ID(String tOKEN_REQUESTOR_ID) {
		TOKEN_REQUESTOR_ID = tOKEN_REQUESTOR_ID;
	}
	public String getPAN_RANGE() {
		return PAN_RANGE;
	}
	public void setPAN_RANGE(String pAN_RANGE) {
		PAN_RANGE = pAN_RANGE;
	}
	public String getPAN_INDICATOR() {
		return PAN_INDICATOR;
	}
	public void setPAN_INDICATOR(String pAN_INDICATOR) {
		PAN_INDICATOR = pAN_INDICATOR;
	}
	public String getTOKEN_EXP_DATE() {
		return TOKEN_EXP_DATE;
	}
	public void setTOKEN_EXP_DATE(String tOKEN_EXP_DATE) {
		TOKEN_EXP_DATE = tOKEN_EXP_DATE;
	}
	public String getTOKEN_REF_NUMBER() {
		return TOKEN_REF_NUMBER;
	}
	public void setTOKEN_REF_NUMBER(String tOKEN_REF_NUMBER) {
		TOKEN_REF_NUMBER = tOKEN_REF_NUMBER;
	}
	public String getTOKEN_SER_PROVIDER() {
		return TOKEN_SER_PROVIDER;
	}
	public void setTOKEN_SER_PROVIDER(String tOKEN_SER_PROVIDER) {
		TOKEN_SER_PROVIDER = tOKEN_SER_PROVIDER;
	}
	public String getTOKEN_STATUS() {
		return TOKEN_STATUS;
	}
	public void setTOKEN_STATUS(String tOKEN_STATUS) {
		TOKEN_STATUS = tOKEN_STATUS;
	}
	public String getTOKEN_TYPE() {
		return TOKEN_TYPE;
	}
	public void setTOKEN_TYPE(String tOKEN_TYPE) {
		TOKEN_TYPE = tOKEN_TYPE;
	}
	public String getHCE_ACTIVATE_RESULT() {
		return HCE_ACTIVATE_RESULT;
	}
	public void setHCE_ACTIVATE_RESULT(String hCE_ACTIVATE_RESULT) {
		HCE_ACTIVATE_RESULT = hCE_ACTIVATE_RESULT;
	}
	public String getAAM_VELOCITY_RESULT() {
		return AAM_VELOCITY_RESULT;
	}
	public void setAAM_VELOCITY_RESULT(String aAM_VELOCITY_RESULT) {
		AAM_VELOCITY_RESULT = aAM_VELOCITY_RESULT;
	}
	public String getLUK_ELAPSED_TIME() {
		return LUK_ELAPSED_TIME;
	}
	public void setLUK_ELAPSED_TIME(String lUK_ELAPSED_TIME) {
		LUK_ELAPSED_TIME = lUK_ELAPSED_TIME;
	}
	public String getLUK_TRAN_COUNT() {
		return LUK_TRAN_COUNT;
	}
	public void setLUK_TRAN_COUNT(String lUK_TRAN_COUNT) {
		LUK_TRAN_COUNT = lUK_TRAN_COUNT;
	}
	public String getLUK_AMT_TRAN() {
		return LUK_AMT_TRAN;
	}
	public void setLUK_AMT_TRAN(String lUK_AMT_TRAN) {
		LUK_AMT_TRAN = lUK_AMT_TRAN;
	}
	public String getTOKEN_DEVICE_TYPE() {
		return TOKEN_DEVICE_TYPE;
	}
	public void setTOKEN_DEVICE_TYPE(String tOKEN_DEVICE_TYPE) {
		TOKEN_DEVICE_TYPE = tOKEN_DEVICE_TYPE;
	}
	public String getTOKEN_DEVICE_LOC() {
		return TOKEN_DEVICE_LOC;
	}
	public void setTOKEN_DEVICE_LOC(String tOKEN_DEVICE_LOC) {
		TOKEN_DEVICE_LOC = tOKEN_DEVICE_LOC;
	}
	public String getTOKEN_REF_NUMBER_EXT() {
		return TOKEN_REF_NUMBER_EXT;
	}
	public void setTOKEN_REF_NUMBER_EXT(String tOKEN_REF_NUMBER_EXT) {
		TOKEN_REF_NUMBER_EXT = tOKEN_REF_NUMBER_EXT;
	}
	public String getTOKEN_VERSION() {
		return TOKEN_VERSION;
	}
	public void setTOKEN_VERSION(String tOKEN_VERSION) {
		TOKEN_VERSION = tOKEN_VERSION;
	}
	public String getTOKEN_CARD_SEQ_NO() {
		return TOKEN_CARD_SEQ_NO;
	}
	public void setTOKEN_CARD_SEQ_NO(String tOKEN_CARD_SEQ_NO) {
		TOKEN_CARD_SEQ_NO = tOKEN_CARD_SEQ_NO;
	}
	public String getTOKEN_ACT_CODE() {
		return TOKEN_ACT_CODE;
	}
	public void setTOKEN_ACT_CODE(String tOKEN_ACT_CODE) {
		TOKEN_ACT_CODE = tOKEN_ACT_CODE;
	}
	public String getTOKEN_STATUS_CODE() {
		return TOKEN_STATUS_CODE;
	}
	public void setTOKEN_STATUS_CODE(String tOKEN_STATUS_CODE) {
		TOKEN_STATUS_CODE = tOKEN_STATUS_CODE;
	}
	public String getTOKEN_ISSUER_PROC() {
		return TOKEN_ISSUER_PROC;
	}
	public void setTOKEN_ISSUER_PROC(String tOKEN_ISSUER_PROC) {
		TOKEN_ISSUER_PROC = tOKEN_ISSUER_PROC;
	}
	public String getTOKEN_REQ_TSTAMP() {
		return TOKEN_REQ_TSTAMP;
	}
	public void setTOKEN_REQ_TSTAMP(String tOKEN_REQ_TSTAMP) {
		TOKEN_REQ_TSTAMP = tOKEN_REQ_TSTAMP;
	}
	public String getTOKEN_RESP_TSTAMP() {
		return TOKEN_RESP_TSTAMP;
	}
	public void setTOKEN_RESP_TSTAMP(String tOKEN_RESP_TSTAMP) {
		TOKEN_RESP_TSTAMP = tOKEN_RESP_TSTAMP;
	}
	public String getTOKEN_TIME_AT_TSP() {
		return TOKEN_TIME_AT_TSP;
	}
	public void setTOKEN_TIME_AT_TSP(String tOKEN_TIME_AT_TSP) {
		TOKEN_TIME_AT_TSP = tOKEN_TIME_AT_TSP;
	}
	public String getACQ_ROUTING_NO() {
		return ACQ_ROUTING_NO;
	}
	public void setACQ_ROUTING_NO(String aCQ_ROUTING_NO) {
		ACQ_ROUTING_NO = aCQ_ROUTING_NO;
	}
	public String getISS_ROUTING_NO() {
		return ISS_ROUTING_NO;
	}
	public void setISS_ROUTING_NO(String iSS_ROUTING_NO) {
		ISS_ROUTING_NO = iSS_ROUTING_NO;
	}
	public String getTRANS_ROUTING_NO() {
		return TRANS_ROUTING_NO;
	}
	public void setTRANS_ROUTING_NO(String tRANS_ROUTING_NO) {
		TRANS_ROUTING_NO = tRANS_ROUTING_NO;
	}
	public String getDEST_ROUTING_NO() {
		return DEST_ROUTING_NO;
	}
	public void setDEST_ROUTING_NO(String dEST_ROUTING_NO) {
		DEST_ROUTING_NO = dEST_ROUTING_NO;
	}
	public String getAUTH_LCYCLE_TRACE() {
		return AUTH_LCYCLE_TRACE;
	}
	public void setAUTH_LCYCLE_TRACE(String aUTH_LCYCLE_TRACE) {
		AUTH_LCYCLE_TRACE = aUTH_LCYCLE_TRACE;
	}
	public String getADDL_TRAN_DISP() {
		return ADDL_TRAN_DISP;
	}
	public void setADDL_TRAN_DISP(String aDDL_TRAN_DISP) {
		ADDL_TRAN_DISP = aDDL_TRAN_DISP;
	}
	public String getSWIFT_CODE() {
		return SWIFT_CODE;
	}
	public void setSWIFT_CODE(String sWIFT_CODE) {
		SWIFT_CODE = sWIFT_CODE;
	}
	public String getIFSC_CODE() {
		return IFSC_CODE;
	}
	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}
	public String getLOCAL_RETRIEVAL_REF_NO() {
		return LOCAL_RETRIEVAL_REF_NO;
	}
	public void setLOCAL_RETRIEVAL_REF_NO(String lOCAL_RETRIEVAL_REF_NO) {
		LOCAL_RETRIEVAL_REF_NO = lOCAL_RETRIEVAL_REF_NO;
	}
	public String getVISA_ATM_TRAN_ID() {
		return VISA_ATM_TRAN_ID;
	}
	public void setVISA_ATM_TRAN_ID(String vISA_ATM_TRAN_ID) {
		VISA_ATM_TRAN_ID = vISA_ATM_TRAN_ID;
	}
	public String getDOMAIN_CTL_RESTR() {
		return DOMAIN_CTL_RESTR;
	}
	public void setDOMAIN_CTL_RESTR(String dOMAIN_CTL_RESTR) {
		DOMAIN_CTL_RESTR = dOMAIN_CTL_RESTR;
	}
	public String getDATA_PRIV_ACQ_FMT() {
		return DATA_PRIV_ACQ_FMT;
	}
	public void setDATA_PRIV_ACQ_FMT(String dATA_PRIV_ACQ_FMT) {
		DATA_PRIV_ACQ_FMT = dATA_PRIV_ACQ_FMT;
	}
	public String getREF_DATA_ACQ_FMT() {
		return REF_DATA_ACQ_FMT;
	}
	public void setREF_DATA_ACQ_FMT(String rEF_DATA_ACQ_FMT) {
		REF_DATA_ACQ_FMT = rEF_DATA_ACQ_FMT;
	}
	public String getDATA_PRIV_ISS_FMT() {
		return DATA_PRIV_ISS_FMT;
	}
	public void setDATA_PRIV_ISS_FMT(String dATA_PRIV_ISS_FMT) {
		DATA_PRIV_ISS_FMT = dATA_PRIV_ISS_FMT;
	}
	public String getREF_DATA_ISS_FMT() {
		return REF_DATA_ISS_FMT;
	}
	public void setREF_DATA_ISS_FMT(String rEF_DATA_ISS_FMT) {
		REF_DATA_ISS_FMT = rEF_DATA_ISS_FMT;
	}
	public String getPROC_FLGS1() {
		return PROC_FLGS1;
	}
	public void setPROC_FLGS1(String pROC_FLGS1) {
		PROC_FLGS1 = pROC_FLGS1;
	}
	public String getPROC_FLGS2() {
		return PROC_FLGS2;
	}
	public void setPROC_FLGS2(String pROC_FLGS2) {
		PROC_FLGS2 = pROC_FLGS2;
	}
	public String getPROC_FLGS3() {
		return PROC_FLGS3;
	}
	public void setPROC_FLGS3(String pROC_FLGS3) {
		PROC_FLGS3 = pROC_FLGS3;
	}
	public String getPROC_FLGS4() {
		return PROC_FLGS4;
	}
	public void setPROC_FLGS4(String pROC_FLGS4) {
		PROC_FLGS4 = pROC_FLGS4;
	}
	public String getPROC_BILLING_FLGS1() {
		return PROC_BILLING_FLGS1;
	}
	public void setPROC_BILLING_FLGS1(String pROC_BILLING_FLGS1) {
		PROC_BILLING_FLGS1 = pROC_BILLING_FLGS1;
	}
	public String getPROC_BILLING_FLGS2() {
		return PROC_BILLING_FLGS2;
	}
	public void setPROC_BILLING_FLGS2(String pROC_BILLING_FLGS2) {
		PROC_BILLING_FLGS2 = pROC_BILLING_FLGS2;
	}
	public String getPROC_BILLING_FLGS3() {
		return PROC_BILLING_FLGS3;
	}
	public void setPROC_BILLING_FLGS3(String pROC_BILLING_FLGS3) {
		PROC_BILLING_FLGS3 = pROC_BILLING_FLGS3;
	}
	public String getPROC_BILLING_FLGS4() {
		return PROC_BILLING_FLGS4;
	}
	public void setPROC_BILLING_FLGS4(String pROC_BILLING_FLGS4) {
		PROC_BILLING_FLGS4 = pROC_BILLING_FLGS4;
	}
	public String getTRACK_2_DATA() {
		return TRACK_2_DATA;
	}
	public void setTRACK_2_DATA(String tRACK_2_DATA) {
		TRACK_2_DATA = tRACK_2_DATA;
	}
	public String getCARD_ACPT_NAME_LOC() {
		return CARD_ACPT_NAME_LOC;
	}
	public void setCARD_ACPT_NAME_LOC(String cARD_ACPT_NAME_LOC) {
		CARD_ACPT_NAME_LOC = cARD_ACPT_NAME_LOC;
	}
	public String getCRD_ACP_NAM_FMTFLG() {
		return CRD_ACP_NAM_FMTFLG;
	}
	public void setCRD_ACP_NAM_FMTFLG(String cRD_ACP_NAM_FMTFLG) {
		CRD_ACP_NAM_FMTFLG = cRD_ACP_NAM_FMTFLG;
	}
	public String getADL_RESP_DATA() {
		return ADL_RESP_DATA;
	}
	public void setADL_RESP_DATA(String aDL_RESP_DATA) {
		ADL_RESP_DATA = aDL_RESP_DATA;
	}
	public String getADL_DATA_PRIV_ACQ() {
		return ADL_DATA_PRIV_ACQ;
	}
	public void setADL_DATA_PRIV_ACQ(String aDL_DATA_PRIV_ACQ) {
		ADL_DATA_PRIV_ACQ = aDL_DATA_PRIV_ACQ;
	}
	public String getADL_DATA_PRIV_ISS() {
		return ADL_DATA_PRIV_ISS;
	}
	public void setADL_DATA_PRIV_ISS(String aDL_DATA_PRIV_ISS) {
		ADL_DATA_PRIV_ISS = aDL_DATA_PRIV_ISS;
	}
	public String getREF_DATA_ISS() {
		return REF_DATA_ISS;
	}
	public void setREF_DATA_ISS(String rEF_DATA_ISS) {
		REF_DATA_ISS = rEF_DATA_ISS;
	}
	public String getTRAN_DESC() {
		return TRAN_DESC;
	}
	public void setTRAN_DESC(String tRAN_DESC) {
		TRAN_DESC = tRAN_DESC;
	}
	public String getADL_DATA_NATIONAL() {
		return ADL_DATA_NATIONAL;
	}
	public void setADL_DATA_NATIONAL(String aDL_DATA_NATIONAL) {
		ADL_DATA_NATIONAL = aDL_DATA_NATIONAL;
	}
	public String getDATA_PRIV_ACQ() {
		return DATA_PRIV_ACQ;
	}
	public void setDATA_PRIV_ACQ(String dATA_PRIV_ACQ) {
		DATA_PRIV_ACQ = dATA_PRIV_ACQ;
	}
	public String getREF_DATA_ACQ() {
		return REF_DATA_ACQ;
	}
	public void setREF_DATA_ACQ(String rEF_DATA_ACQ) {
		REF_DATA_ACQ = rEF_DATA_ACQ;
	}
	public String getDATA_PRIV_ISS() {
		return DATA_PRIV_ISS;
	}
	public void setDATA_PRIV_ISS(String dATA_PRIV_ISS) {
		DATA_PRIV_ISS = dATA_PRIV_ISS;
	}
	public String getTRAN_UNIQUE_DATA() {
		return TRAN_UNIQUE_DATA;
	}
	public void setTRAN_UNIQUE_DATA(String tRAN_UNIQUE_DATA) {
		TRAN_UNIQUE_DATA = tRAN_UNIQUE_DATA;
	}
	public String getNET_UNIQUE_DAT_FEE() {
		return NET_UNIQUE_DAT_FEE;
	}
	public void setNET_UNIQUE_DAT_FEE(String nET_UNIQUE_DAT_FEE) {
		NET_UNIQUE_DAT_FEE = nET_UNIQUE_DAT_FEE;
	}
	public String getADTL_DATA_FEE() {
		return ADTL_DATA_FEE;
	}
	public void setADTL_DATA_FEE(String aDTL_DATA_FEE) {
		ADTL_DATA_FEE = aDTL_DATA_FEE;
	}
	public String getEXTENSION_DATA_ADJ() {
		return EXTENSION_DATA_ADJ;
	}
	public void setEXTENSION_DATA_ADJ(String eXTENSION_DATA_ADJ) {
		EXTENSION_DATA_ADJ = eXTENSION_DATA_ADJ;
	}
	public String getTOKEN_TRANID() {
		return TOKEN_TRANID;
	}
	public void setTOKEN_TRANID(String tOKEN_TRANID) {
		TOKEN_TRANID = tOKEN_TRANID;
	}
	public String getUNFORMATTED_MICR_DATA() {
		return UNFORMATTED_MICR_DATA;
	}
	public void setUNFORMATTED_MICR_DATA(String uNFORMATTED_MICR_DATA) {
		UNFORMATTED_MICR_DATA = uNFORMATTED_MICR_DATA;
	}
	public String getADDL_TRAN_RESULT() {
		return ADDL_TRAN_RESULT;
	}
	public void setADDL_TRAN_RESULT(String aDDL_TRAN_RESULT) {
		ADDL_TRAN_RESULT = aDDL_TRAN_RESULT;
	}
	public String getBRIDGE_ACQ_FLG() {
		return BRIDGE_ACQ_FLG;
	}
	public void setBRIDGE_ACQ_FLG(String bRIDGE_ACQ_FLG) {
		BRIDGE_ACQ_FLG = bRIDGE_ACQ_FLG;
	}
	public String getBRIDGE_ISS_FLG() {
		return BRIDGE_ISS_FLG;
	}
	public void setBRIDGE_ISS_FLG(String bRIDGE_ISS_FLG) {
		BRIDGE_ISS_FLG = bRIDGE_ISS_FLG;
	}
	public String getPGRM_PROTOCOL() {
		return PGRM_PROTOCOL;
	}
	public void setPGRM_PROTOCOL(String pGRM_PROTOCOL) {
		PGRM_PROTOCOL = pGRM_PROTOCOL;
	}
	public String getDIR_SERV_TRAN_ID() {
		return DIR_SERV_TRAN_ID;
	}
	public void setDIR_SERV_TRAN_ID(String dIR_SERV_TRAN_ID) {
		DIR_SERV_TRAN_ID = dIR_SERV_TRAN_ID;
	}
	public String getTRAN_String_CLASS() {
		return TRAN_String_CLASS;
	}
	public void setTRAN_String_CLASS(String tRAN_String_CLASS) {
		TRAN_String_CLASS = tRAN_String_CLASS;
	}

	String CrossBorderFlag;
	public String getCrossBorderFlag() {
		return CrossBorderFlag;
	}

	public void setCrossBorderFlag(String crossBorderFlag) {
		CrossBorderFlag = crossBorderFlag;
	}

	public String getCard_scheme() {
		return card_scheme;
	}

	public void setCard_scheme(String card_scheme) {
		this.card_scheme = card_scheme;
	}

	public String getCard_location() {
		return card_location;
	}

	public void setCard_location(String card_location) {
		this.card_location = card_location;
	}

	public String getTxn_service() {
		return txn_service;
	}

	public void setTxn_service(String txn_service) {
		this.txn_service = txn_service;
	}

	public String getBbl_private() {
		return bbl_private;
	}

	public void setBbl_private(String bbl_private) {
		this.bbl_private = bbl_private;
	}

	public String getATCResult() {
		return ATCResult;
	}

	public void setATCResult(String aTCResult) {
		ATCResult = aTCResult;
	}

	public String getCVV2IssuerResult() {
		return CVV2IssuerResult;
	}

	public void setCVV2IssuerResult(String cVV2IssuerResult) {
		CVV2IssuerResult = cVV2IssuerResult;
	}

	public String getCVV2PresenceIndicator() {
		return CVV2PresenceIndicator;
	}

	public void setCVV2PresenceIndicator(String cVV2PresenceIndicator) {
		CVV2PresenceIndicator = cVV2PresenceIndicator;
	}

	public String getCVV2ResponseIndicator() {
		return CVV2ResponseIndicator;
	}

	public void setCVV2ResponseIndicator(String cVV2ResponseIndicator) {
		CVV2ResponseIndicator = cVV2ResponseIndicator;
	}







}
