package p3;

import D1.C0373t;
import android.gov.nist.core.Separators;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public int f42430a;

    /* renamed from: b  reason: collision with root package name */
    public int f42431b;

    /* renamed from: c  reason: collision with root package name */
    public int f42432c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f42433d;

    /* renamed from: e  reason: collision with root package name */
    public Object f42434e;

    public H(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a(int i10, int i11) {
        Object obj = this.f42433d;
        if (i10 >= 0 && i10 < ((List) obj).size()) {
            xi.d dVar = (xi.d) ((List) obj).get(i10);
            if (i11 >= 0 && i11 <= dVar.f50076a.length()) {
                return;
            }
            StringBuilder q10 = android.gov.nist.core.a.q("Index ", i11, " out of range, line length: ");
            q10.append(dVar.f50076a.length());
            throw new IllegalArgumentException(q10.toString());
        }
        StringBuilder q11 = android.gov.nist.core.a.q("Line index ", i10, " out of range, number of lines: ");
        q11.append(((List) obj).size());
        throw new IllegalArgumentException(q11.toString());
    }

    public final int b(char c10) {
        int i10 = 0;
        while (true) {
            char m10 = m();
            if (m10 == 0) {
                return -1;
            }
            if (m10 == c10) {
                return i10;
            }
            i10++;
            j();
        }
    }

    public final void c() {
        int i10;
        int i11 = this.f42432c;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f42430a;
        } else {
            i10 = i11 + this.f42431b;
        }
        this.f42432c = i10;
        this.f42434e = ((String) this.f42433d) + this.f42432c;
    }

    public final String d() {
        i();
        return (String) this.f42434e;
    }

    public final Q3.j e(C0373t c0373t, C0373t c0373t2) {
        wi.w wVar;
        int i10 = c0373t.f3302a;
        int i11 = c0373t2.f3302a;
        Object obj = this.f42433d;
        if (i10 == i11) {
            xi.d dVar = (xi.d) ((List) obj).get(i10);
            CharSequence subSequence = dVar.f50076a.subSequence(c0373t.f3303b, c0373t2.f3303b);
            wi.w wVar2 = dVar.f50077b;
            if (wVar2 != null) {
                wVar = new wi.w(wVar2.f48616a, wVar2.f48617b + c0373t.f3303b, subSequence.length());
            } else {
                wVar = null;
            }
            xi.d dVar2 = new xi.d(subSequence, wVar);
            Q3.j jVar = new Q3.j(6);
            jVar.f14418b.add(dVar2);
            return jVar;
        }
        Q3.j jVar2 = new Q3.j(6);
        List list = (List) obj;
        xi.d dVar3 = (xi.d) list.get(c0373t.f3302a);
        jVar2.f14418b.add(dVar3.a(c0373t.f3303b, dVar3.f50076a.length()));
        int i12 = c0373t.f3302a;
        while (true) {
            i12++;
            int i13 = c0373t2.f3302a;
            if (i12 < i13) {
                jVar2.f14418b.add((xi.d) list.get(i12));
            } else {
                jVar2.f14418b.add(((xi.d) list.get(i13)).a(0, c0373t2.f3303b));
                return jVar2;
            }
        }
    }

    public final boolean f() {
        if (this.f42431b < this.f42432c || this.f42430a < ((List) this.f42433d).size() - 1) {
            return true;
        }
        return false;
    }

    public final int g(y7.b bVar) {
        int i10 = 0;
        while (((BitSet) bVar.f50831Z).get(m())) {
            i10++;
            j();
        }
        return i10;
    }

    public final int h(char c10) {
        int i10 = 0;
        while (m() == c10) {
            i10++;
            j();
        }
        return i10;
    }

    public final void i() {
        if (this.f42432c != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final void j() {
        int i10 = this.f42431b + 1;
        this.f42431b = i10;
        if (i10 > this.f42432c) {
            int i11 = this.f42430a + 1;
            this.f42430a = i11;
            List list = (List) this.f42433d;
            if (i11 < list.size()) {
                xi.d dVar = (xi.d) list.get(this.f42430a);
                this.f42434e = dVar;
                this.f42432c = dVar.f50076a.length();
            } else {
                this.f42434e = new xi.d("", null);
                this.f42432c = "".length();
            }
            this.f42431b = 0;
        }
    }

    public final boolean k(char c10) {
        if (m() == c10) {
            j();
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        int i10 = this.f42431b;
        if (i10 >= this.f42432c || str.length() + i10 > this.f42432c) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (((xi.d) this.f42434e).f50076a.charAt(this.f42431b + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f42431b = str.length() + this.f42431b;
        return true;
    }

    public final char m() {
        int i10 = this.f42431b;
        if (i10 < this.f42432c) {
            return ((xi.d) this.f42434e).f50076a.charAt(i10);
        }
        if (this.f42430a < ((List) this.f42433d).size() - 1) {
            return '\n';
        }
        return (char) 0;
    }

    public final C0373t n() {
        return new C0373t(this.f42430a, this.f42431b);
    }

    public final void o(C0373t c0373t) {
        a(c0373t.f3302a, c0373t.f3303b);
        int i10 = c0373t.f3302a;
        this.f42430a = i10;
        this.f42431b = c0373t.f3303b;
        xi.d dVar = (xi.d) ((List) this.f42433d).get(i10);
        this.f42434e = dVar;
        this.f42432c = dVar.f50076a.length();
    }

    public final int p() {
        int i10 = 0;
        while (true) {
            char m10 = m();
            if (m10 != ' ') {
                switch (m10) {
                    default:
                        return i10;
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                }
            }
            i10++;
            j();
        }
    }

    public H(List list) {
        this.f42434e = new xi.d("", null);
        this.f42432c = 0;
        this.f42433d = list;
        this.f42430a = 0;
        this.f42431b = 0;
        if (!list.isEmpty()) {
            a(0, 0);
            xi.d dVar = (xi.d) list.get(0);
            this.f42434e = dVar;
            this.f42432c = dVar.f50076a.length();
        }
    }

    public H(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + Separators.SLASH;
        } else {
            str = "";
        }
        this.f42433d = str;
        this.f42430a = i11;
        this.f42431b = i12;
        this.f42432c = Integer.MIN_VALUE;
        this.f42434e = "";
    }
}
