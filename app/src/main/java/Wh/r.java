package Wh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import jh.H1;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public String f21241a;

    /* renamed from: d  reason: collision with root package name */
    public String f21244d;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f21246f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f21247g;

    /* renamed from: h  reason: collision with root package name */
    public String f21248h;

    /* renamed from: b  reason: collision with root package name */
    public String f21242b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f21243c = "";

    /* renamed from: e  reason: collision with root package name */
    public int f21245e = -1;

    public r() {
        ArrayList arrayList = new ArrayList();
        this.f21246f = arrayList;
        arrayList.add("");
    }

    public final void a(String str) {
        d(str, 0, str.length(), false, false);
    }

    public final s b() {
        ArrayList arrayList;
        String str;
        String str2 = this.f21241a;
        if (str2 != null) {
            char[] cArr = s.f21249j;
            String t10 = H1.t(this.f21242b, 0, 0, false, 7);
            String t11 = H1.t(this.f21243c, 0, 0, false, 7);
            String str3 = this.f21244d;
            if (str3 != null) {
                int i10 = this.f21245e;
                if (i10 == -1) {
                    String str4 = this.f21241a;
                    AbstractC3557B.Z(str4);
                    i10 = H1.l(str4);
                }
                int i11 = i10;
                ArrayList arrayList2 = this.f21246f;
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    char[] cArr2 = s.f21249j;
                    arrayList3.add(H1.t((String) it.next(), 0, 0, false, 7));
                }
                ArrayList<String> arrayList4 = this.f21247g;
                String str5 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(AbstractC6583a.H1(arrayList4, 10));
                    for (String str6 : arrayList4) {
                        if (str6 != null) {
                            char[] cArr3 = s.f21249j;
                            str = H1.t(str6, 0, 0, true, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str7 = this.f21248h;
                if (str7 != null) {
                    char[] cArr4 = s.f21249j;
                    str5 = H1.t(str7, 0, 0, false, 7);
                }
                return new s(str2, t10, t11, str3, i11, arrayList3, arrayList, str5, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:114:0x0285
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:92)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final void c(Wh.s r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Wh.r.c(Wh.s, java.lang.String):void");
    }

    public final void d(String str, int i10, int i11, boolean z10, boolean z11) {
        char[] cArr = s.f21249j;
        String h10 = H1.h(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, 240);
        if (!AbstractC3557B.K(h10, Separators.DOT) && !Lg.n.f2(h10, "%2e")) {
            boolean K10 = AbstractC3557B.K(h10, "..");
            ArrayList arrayList = this.f21246f;
            if (!K10 && !Lg.n.f2(h10, "%2e.") && !Lg.n.f2(h10, ".%2e") && !Lg.n.f2(h10, "%2e%2e")) {
                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                    arrayList.set(arrayList.size() - 1, h10);
                } else {
                    arrayList.add(h10);
                }
                if (z10) {
                    arrayList.add("");
                }
            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() == 0 && (!arrayList.isEmpty())) {
                arrayList.set(arrayList.size() - 1, "");
            } else {
                arrayList.add("");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r1 != jh.H1.l(r3)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f21241a;
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        } else {
            sb2.append("//");
        }
        if (this.f21242b.length() > 0 || this.f21243c.length() > 0) {
            sb2.append(this.f21242b);
            if (this.f21243c.length() > 0) {
                sb2.append(':');
                sb2.append(this.f21243c);
            }
            sb2.append('@');
        }
        String str2 = this.f21244d;
        if (str2 != null) {
            if (Lg.n.a2(str2, ':')) {
                sb2.append('[');
                sb2.append(this.f21244d);
                sb2.append(']');
            } else {
                sb2.append(this.f21244d);
            }
        }
        int i10 = this.f21245e;
        if (i10 != -1 || this.f21241a != null) {
            if (i10 == -1) {
                char[] cArr = s.f21249j;
                String str3 = this.f21241a;
                AbstractC3557B.Z(str3);
                i10 = H1.l(str3);
            }
            String str4 = this.f21241a;
            if (str4 != null) {
                char[] cArr2 = s.f21249j;
            }
            sb2.append(':');
            sb2.append(i10);
        }
        char[] cArr3 = s.f21249j;
        ArrayList arrayList = this.f21246f;
        AbstractC3557B.c0("<this>", arrayList);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append('/');
            sb2.append((String) arrayList.get(i11));
        }
        if (this.f21247g != null) {
            sb2.append('?');
            char[] cArr4 = s.f21249j;
            ArrayList arrayList2 = this.f21247g;
            AbstractC3557B.Z(arrayList2);
            H1.v(sb2, arrayList2);
        }
        if (this.f21248h != null) {
            sb2.append('#');
            sb2.append(this.f21248h);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
