package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    protected String f35033a;

    /* renamed from: b  reason: collision with root package name */
    protected String f35034b;

    /* renamed from: c  reason: collision with root package name */
    protected char f35035c;

    /* renamed from: d  reason: collision with root package name */
    protected p f35036d;

    /* renamed from: e  reason: collision with root package name */
    protected p f35037e;

    private p(String str, String str2, p pVar) {
        this.f35033a = str;
        this.f35034b = str2;
        this.f35036d = pVar;
        this.f35035c = str.isEmpty() ? '\uffff' : this.f35033a.charAt(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p(String str, String str2, p pVar, int i10) {
        this(str, str2, pVar);
    }

    private boolean b(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f35033a.length() && c(str.charAt(i10), this.f35033a.charAt(i10))) {
            i10++;
        }
        if (i10 != this.f35033a.length()) {
            p e10 = e(this.f35033a.substring(i10), this.f35034b, this.f35036d);
            this.f35033a = str.substring(0, i10);
            this.f35036d = e10;
            if (i10 < str.length()) {
                this.f35036d.f35037e = e(str.substring(i10), str2, null);
                this.f35034b = null;
            } else {
                this.f35034b = str2;
            }
            return true;
        } else if (i10 >= str.length()) {
            this.f35034b = str2;
            return true;
        } else {
            String substring = str.substring(i10);
            for (p pVar = this.f35036d; pVar != null; pVar = pVar.f35037e) {
                if (c(pVar.f35035c, substring.charAt(0))) {
                    return pVar.b(substring, str2);
                }
            }
            p e11 = e(substring, str2, null);
            e11.f35037e = this.f35036d;
            this.f35036d = e11;
            return true;
        }
    }

    public static p f(y yVar) {
        return yVar.k() ? new p("", null, null) : new p("", null, null);
    }

    public static p g(Set set, y yVar) {
        p f6 = f(yVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f6.b(str, str);
        }
        return f6;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    protected boolean c(char c10, char c11) {
        return c10 == c11;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f35033a.length() + index;
        p pVar = this.f35036d;
        if (pVar != null && length2 != length) {
            while (true) {
                if (!c(pVar.f35035c, charSequence.charAt(length2))) {
                    pVar = pVar.f35037e;
                    if (pVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String d10 = pVar.d(charSequence, parsePosition);
                    if (d10 != null) {
                        return d10;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f35034b;
    }

    protected p e(String str, String str2, p pVar) {
        return new p(str, str2, pVar);
    }

    protected boolean h(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f35033a, i10);
        }
        int length = this.f35033a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!c(this.f35033a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
