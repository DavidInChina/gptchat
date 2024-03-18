package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PUserDatabase extends ParametersHeader implements PUserDatabaseHeader, SIPHeaderNamesIms, AbstractC2266v {
    private String databaseName;

    public PUserDatabase(String str) {
        super("P-User-Database");
        this.databaseName = str;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PUserDatabase) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Separators.LESS_THAN);
        if (getDatabaseName() != null) {
            sb2.append(getDatabaseName());
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        sb2.append(Separators.GREATER_THAN);
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if ((obj instanceof PUserDatabaseHeader) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader
    public String getDatabaseName() {
        return this.databaseName;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader
    public void setDatabaseName(String str) {
        if (str != null && !str.equals(Separators.SP)) {
            if (!str.contains("aaa://")) {
                this.databaseName = "aaa://".concat(str);
                return;
            } else {
                this.databaseName = str;
                return;
            }
        }
        throw new NullPointerException("Database name is null");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PUserDatabase() {
        super("P-User-Database");
    }
}
