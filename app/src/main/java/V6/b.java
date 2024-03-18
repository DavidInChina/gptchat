package V6;

import B0.C0197n;
import K0.e;
import Kg.d;
import Kg.j;
import Kg.k;
import Kg.m;
import Kg.o;
import Kg.p;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jf.y;
import kf.t;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final P5.c f18406a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18407b;

    /* renamed from: c  reason: collision with root package name */
    public long f18408c;

    /* renamed from: d  reason: collision with root package name */
    public final P5.c f18409d = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, P5.c] */
    public b(P5.c cVar, c cVar2) {
        AbstractC3557B.c0("ctx", cVar);
        this.f18406a = cVar;
        this.f18407b = new a(cVar2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final k a() {
        String str;
        ?? obj = new Object();
        List b10 = b();
        if (b10 == null) {
            return d.f9815a;
        }
        obj.f37622Y = b10;
        this.f18406a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) obj.f37622Y).iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                if (linkedHashSet.contains(str)) {
                    break;
                }
                linkedHashSet.add(str);
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            Integer valueOf = Integer.valueOf(((List) obj.f37622Y).size());
            ?? obj2 = new Object();
            obj2.f37622Y = valueOf;
            return m.n1(m.i1(new j(p.d1(new X0.b(28, this)), new androidx.compose.foundation.layout.c((Object) obj2, 13, this)), o.f9844i0), new C0197n(3, obj));
        }
        throw new e(android.gov.nist.core.a.A("header '", str, "' is duplicated. please consider to use 'autoRenameDuplicateHeaders' option."), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x013b A[LOOP:0: B:3:0x0005->B:74:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b() {
        String str;
        String str2;
        Character ch2;
        long j6;
        List list;
        List list2;
        String str3 = "";
        while (true) {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                c cVar = this.f18407b.f18405a;
                int read = cVar.f18410a.read();
                if (read == -1) {
                    if (sb2.length() == 0 || (sb2.length() == 1 && sb2.charAt(0) == '\ufeff')) {
                        str = null;
                    }
                } else {
                    char c10 = (char) read;
                    sb2.append(c10);
                    if (c10 == '\n' || c10 == '\u2028' || c10 == '\u2029' || c10 == '\u0085') {
                        break;
                    } else if (c10 == '\r') {
                        BufferedReader bufferedReader = cVar.f18410a;
                        bufferedReader.mark(1);
                        int read2 = bufferedReader.read();
                        if (read2 != -1) {
                            if (((char) read2) == '\n') {
                                sb2.append('\n');
                            } else {
                                bufferedReader.reset();
                            }
                        }
                    }
                }
            }
            str = sb2.toString();
            this.f18408c++;
            if (str == null) {
                if (str3.length() <= 0) {
                    return null;
                }
                throw new e(android.gov.nist.core.a.A(Separators.DOUBLE_QUOTE, str3, "\" on the tail of file is left on the way of parsing row"), 4);
            }
            this.f18406a.getClass();
            if (str3.length() == 0) {
                str2 = str;
            } else {
                str2 = str3.concat(str);
            }
            long j10 = this.f18408c;
            this.f18409d.getClass();
            AbstractC3557B.c0("line", str2);
            X6.a aVar = new X6.a();
            if (str2.length() == 0) {
                ch2 = null;
            } else {
                ch2 = Character.valueOf(str2.charAt(0));
            }
            int length = str2.length() - 1;
            if (length < 1) {
                j6 = 0;
            } else {
                ArrayList arrayList = new ArrayList(length);
                Character ch3 = ch2;
                j6 = 0;
                int i10 = 0;
                while (i10 < length) {
                    char charAt = str2.charAt(i10);
                    i10++;
                    char charAt2 = str2.charAt(i10);
                    if (j6 > 0) {
                        j6--;
                    } else {
                        j6 = aVar.b(charAt, Character.valueOf(charAt2), j10) - 1;
                    }
                    ch3 = Character.valueOf(charAt2);
                    arrayList.add(y.f36177a);
                }
                ch2 = ch3;
            }
            if (ch2 != null && j6 == 0) {
                list = null;
                aVar.b(ch2.charValue(), null, j10);
            } else {
                list = null;
            }
            int f6 = AbstractC6708l.f(aVar.f21792a);
            ArrayList arrayList2 = aVar.f21793b;
            if (f6 != 1) {
                if (f6 != 2) {
                    if (f6 != 5) {
                        if (f6 != 6) {
                            list2 = t.K2(arrayList2);
                        } else {
                            list2 = list;
                        }
                    }
                } else {
                    arrayList2.add("");
                    list2 = t.K2(arrayList2);
                }
                if (list2 != null) {
                    str3 = str3.concat(str);
                } else {
                    return list2;
                }
            }
            arrayList2.add(aVar.f21794c.toString());
            list2 = t.K2(arrayList2);
            if (list2 != null) {
            }
        }
    }
}
