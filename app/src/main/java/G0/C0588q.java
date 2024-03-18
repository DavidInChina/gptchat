package G0;

import Mf.AbstractC0997f;
import N0.C1045d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ca.C2311c;
import cb.C2334C;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import io.sentry.C3640e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import jf.C3959i;
import rg.AbstractC5493d;
import w3.C6109p;
import wd.C6182c0;
import xe.C6427p;

/* renamed from: G0.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0588q implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5817Y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0588q() {
        this(20);
        this.f5817Y = 20;
    }

    public final int a(View view, View view2) {
        switch (this.f5817Y) {
            case 2:
                WeakHashMap weakHashMap = D1.Z.f3247a;
                float m10 = D1.N.m(view);
                float m11 = D1.N.m(view2);
                if (m10 > m11) {
                    return -1;
                }
                if (m10 < m11) {
                    return 1;
                }
                return 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (id.AbstractC3557B.e0(r5, r6) < 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r8 < r9) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021d, code lost:
        if (r0 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f5817Y) {
            case 0:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
                int e02 = AbstractC3557B.e0(aVar.f24852p0, aVar2.f24852p0);
                if (e02 == 0) {
                    return AbstractC3557B.e0(aVar.hashCode(), aVar2.hashCode());
                }
                return e02;
            case 1:
                return r.f.n(Integer.valueOf(((C1045d) obj).f12509b), Integer.valueOf(((C1045d) obj2).f12509b));
            case 2:
                return a((View) obj, (View) obj2);
            case 3:
                C6109p c6109p = (C6109p) obj;
                C6109p c6109p2 = (C6109p) obj2;
                RecyclerView recyclerView = c6109p.f47954d;
                if (recyclerView == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c6109p2.f47954d == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    boolean z12 = c6109p.f47951a;
                    if (z12 == c6109p2.f47951a) {
                        int i10 = c6109p2.f47952b - c6109p.f47952b;
                        if (i10 != 0) {
                            return i10;
                        }
                        int i11 = c6109p.f47953c - c6109p2.f47953c;
                        if (i11 == 0) {
                            return 0;
                        }
                        return i11;
                    }
                }
                break;
            case 4:
                return ((S4.m) obj).b().compareTo(((S4.m) obj2).b());
            case 5:
                return ((Scope) obj).f26801Z.compareTo(((Scope) obj2).f26801Z);
            case 6:
                return a((View) obj, (View) obj2);
            case 7:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 8:
                return r.f.n(Integer.valueOf(((B9.c) obj).f1993d), Integer.valueOf(((B9.c) obj2).f1993d));
            case 9:
                AbstractC2469q0.p(obj);
                throw null;
            case 10:
                return r.f.n(((C2311c) obj2).c(), ((C2311c) obj).c());
            case 11:
                return r.f.n(Boolean.valueOf(!((C2334C) obj).f26455r), Boolean.valueOf(!((C2334C) obj2).f26455r));
            case 12:
                return r.f.n(((C6182c0) obj).f48393Y, ((C6182c0) obj2).f48393Y);
            case 13:
                return r.f.n(Le.a.d((Charset) obj), Le.a.d((Charset) obj2));
            case 14:
                return r.f.n((Float) ((C3959i) obj2).f36156Z, (Float) ((C3959i) obj).f36156Z);
            case 15:
                return r.f.n((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 16:
                return r.f.n(Double.valueOf(((C6427p) obj2).f49947c), Double.valueOf(((C6427p) obj).f49947c));
            case 17:
                return r.f.n(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            case 18:
                We.w wVar = (We.w) obj;
                wVar.getClass();
                Df.v[] vVarArr = We.w.f21058q;
                Float valueOf = Float.valueOf(((Number) wVar.f21066h.d(vVarArr[2])).floatValue());
                We.w wVar2 = (We.w) obj2;
                wVar2.getClass();
                return r.f.n(valueOf, Float.valueOf(((Number) wVar2.f21066h.d(vVarArr[2])).floatValue()));
            case 19:
                return r.f.n(Integer.valueOf(((Ze.c) obj2).a()), Integer.valueOf(((Ze.c) obj).a()));
            case 20:
                return ((Date) ((C3640e) obj).f34318Y.clone()).compareTo((Date) ((C3640e) obj2).f34318Y.clone());
            case 21:
                return r.f.n(((Method) obj).getName(), ((Method) obj2).getName());
            case 22:
                return r.f.n(((Gf.Z) ((Df.o) obj)).getName(), ((Gf.Z) ((Df.o) obj2)).getName());
            case 23:
                return r.f.n(AbstractC5493d.g((AbstractC0997f) obj).b(), AbstractC5493d.g((AbstractC0997f) obj2).b());
            case 24:
                return r.f.n(AbstractC5493d.g((AbstractC0997f) obj).b(), AbstractC5493d.g((AbstractC0997f) obj2).b());
            case 25:
                String str = (String) obj;
                String str2 = (String) obj2;
                AbstractC3557B.c0("a", str);
                AbstractC3557B.c0("b", str2);
                int min = Math.min(str.length(), str2.length());
                for (int i12 = 4; i12 < min; i12++) {
                    char charAt = str.charAt(i12);
                    char charAt2 = str2.charAt(i12);
                    if (charAt != charAt2) {
                        break;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                break;
            default:
                return r.f.n(((ki.f) obj).f37607a, ((ki.f) obj2).f37607a);
        }
    }

    public /* synthetic */ C0588q(int i10) {
        this.f5817Y = i10;
    }
}
