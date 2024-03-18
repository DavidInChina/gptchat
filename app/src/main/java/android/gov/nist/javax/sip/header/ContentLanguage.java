package android.gov.nist.javax.sip.header;

import c.AbstractC2260o;
import java.util.Locale;

/* loaded from: classes.dex */
public class ContentLanguage extends SIPHeader implements AbstractC2260o {
    private static final long serialVersionUID = -5195728427134181070L;
    protected Locale locale;

    public ContentLanguage() {
        super(SIPHeaderNames.CONTENT_LANGUAGE);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ContentLanguage contentLanguage = (ContentLanguage) super.clone();
        Locale locale = this.locale;
        if (locale != null) {
            contentLanguage.locale = (Locale) locale.clone();
        }
        return contentLanguage;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(getLanguageTag());
        return sb2;
    }

    public Locale getContentLanguage() {
        return this.locale;
    }

    public String getLanguageTag() {
        if ("".equals(this.locale.getCountry())) {
            return this.locale.getLanguage();
        }
        return this.locale.getLanguage() + '-' + this.locale.getCountry();
    }

    public void setContentLanguage(Locale locale) {
        this.locale = locale;
    }

    public void setLanguageTag(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            this.locale = new Locale(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else {
            this.locale = new Locale(str);
        }
    }

    public ContentLanguage(String str) {
        super(SIPHeaderNames.CONTENT_LANGUAGE);
        setLanguageTag(str);
    }
}
