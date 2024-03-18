package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.javax.sip.g;
import c.AbstractC2248c;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AcceptLanguage extends ParametersHeader implements AbstractC2248c {
    private static final long serialVersionUID = -4473982069737324919L;
    protected String languageRange;

    public AcceptLanguage() {
        super(SIPHeaderNames.ACCEPT_LANGUAGE);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.languageRange;
        if (str != null) {
            sb2.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(this.parameters.encode());
        }
        return sb2;
    }

    public Locale getAcceptLanguage() {
        String str = this.languageRange;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            return new Locale(this.languageRange.substring(0, indexOf), this.languageRange.substring(indexOf + 1));
        }
        return new Locale(this.languageRange);
    }

    public String getLanguageRange() {
        return this.languageRange;
    }

    public float getQValue() {
        if (!hasParameter("q")) {
            return -1.0f;
        }
        return ((Float) this.parameters.getValue("q")).floatValue();
    }

    public boolean hasQValue() {
        return hasParameter("q");
    }

    public void removeQValue() {
        removeParameter("q");
    }

    public void setAcceptLanguage(Locale locale) {
        if ("".equals(locale.getCountry())) {
            this.languageRange = locale.getLanguage();
            return;
        }
        this.languageRange = locale.getLanguage() + '-' + locale.getCountry();
    }

    public void setLanguageRange(String str) {
        this.languageRange = str.trim();
    }

    public void setQValue(float f6) {
        double d10 = f6;
        if (d10 >= 0.0d && d10 <= 1.0d) {
            if (f6 == -1.0f) {
                removeParameter("q");
                return;
            } else {
                setParameter(new NameValue("q", Float.valueOf(f6)));
                return;
            }
        }
        throw new g("qvalue out of range!");
    }
}
