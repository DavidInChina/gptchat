package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.SessionDescriptionImpl;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.util.Vector;

/* loaded from: classes.dex */
public class SDPAnnounceParser extends ParserCore {
    protected Lexer lexer;
    protected Vector sdpMessage;

    public SDPAnnounceParser(Vector vector) {
        this.sdpMessage = vector;
    }

    public SessionDescriptionImpl parse() {
        SDPField sDPField;
        SessionDescriptionImpl sessionDescriptionImpl = new SessionDescriptionImpl();
        for (int i10 = 0; i10 < this.sdpMessage.size(); i10++) {
            SDPParser createParser = ParserFactory.createParser((String) this.sdpMessage.elementAt(i10));
            if (createParser != null) {
                sDPField = createParser.parse();
            } else {
                sDPField = null;
            }
            sessionDescriptionImpl.addField(sDPField);
        }
        return sessionDescriptionImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2 == r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r3 == r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SDPAnnounceParser(String str) {
        String substring;
        int i10;
        int i11;
        if (str == null) {
            return;
        }
        this.sdpMessage = new Vector();
        String str2 = str.trim() + Separators.NEWLINE;
        int i12 = 0;
        String str3 = null;
        while (i12 < str2.length()) {
            int indexOf = str2.indexOf(Separators.RETURN, i12);
            int indexOf2 = str2.indexOf("\r", i12);
            if (indexOf >= 0 && indexOf2 < 0) {
                substring = str2.substring(i12, indexOf);
            } else {
                if (indexOf < 0 && indexOf2 >= 0) {
                    substring = str2.substring(i12, indexOf2);
                } else if (indexOf < 0 || indexOf2 < 0) {
                    if (indexOf < 0 && indexOf2 < 0) {
                        return;
                    }
                    this.sdpMessage.addElement(str3);
                } else if (indexOf > indexOf2) {
                    substring = str2.substring(i12, indexOf2);
                    i11 = indexOf2 + 1;
                } else {
                    substring = str2.substring(i12, indexOf);
                    i10 = indexOf + 1;
                }
                i11 = indexOf2 + 1;
                str3 = substring;
                i12 = i11;
                this.sdpMessage.addElement(str3);
            }
            i10 = indexOf + 1;
            str3 = substring;
            i12 = i10;
            this.sdpMessage.addElement(str3);
        }
    }
}
