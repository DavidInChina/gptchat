package pg;

import Bg.A;
import Bg.D;
import Mf.B;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: pg.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5168e extends AbstractC5178o {
    public C5168e(char c10) {
        super(Character.valueOf(c10));
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC3557B.c0("module", b10);
        Jf.l j6 = b10.j();
        j6.getClass();
        D s10 = j6.s(Jf.n.f9126l0);
        if (s10 != null) {
            return s10;
        }
        Jf.l.a(63);
        throw null;
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        Object obj = this.f43144a;
        objArr[0] = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        if (charValue == '\b') {
            str = "\\b";
        } else if (charValue == '\t') {
            str = "\\t";
        } else if (charValue == '\n') {
            str = "\\n";
        } else if (charValue == '\f') {
            str = "\\f";
        } else if (charValue == '\r') {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                str = String.valueOf(charValue);
            } else {
                str = Separators.QUESTION;
            }
        }
        objArr[1] = str;
        return String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
    }
}
