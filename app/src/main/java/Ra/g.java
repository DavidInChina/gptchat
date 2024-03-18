package Ra;

import Jc.F;
import Qg.F0;
import Qg.s0;
import Uc.C1425j;
import android.app.Application;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import id.C3556A;
import id.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.w;
import nf.AbstractC4825e;
import of.EnumC5000a;
import ua.C5870a;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class g implements Aa.g, X9.a {

    /* renamed from: a  reason: collision with root package name */
    public final Application f15198a;

    /* renamed from: b  reason: collision with root package name */
    public final F f15199b;

    /* renamed from: c  reason: collision with root package name */
    public final Ic.a f15200c;

    /* renamed from: d  reason: collision with root package name */
    public final Aa.j f15201d;

    /* renamed from: e  reason: collision with root package name */
    public final F0 f15202e = s0.c(w.f37484Y);

    /* renamed from: f  reason: collision with root package name */
    public C3959i f15203f;

    public g(Application application, F f6, Ic.a aVar, Aa.j jVar) {
        this.f15198a = application;
        this.f15199b = f6;
        this.f15200c = aVar;
        this.f15201d = jVar;
    }

    @Override // X9.a
    public final X9.b a(X9.b bVar, boolean z10) {
        x xVar;
        C3959i c3959i = this.f15203f;
        if (c3959i == null) {
            return bVar;
        }
        C3556A c3556a = (C3556A) c3959i.f36156Z;
        s sVar = (s) ((Map) this.f15202e.getValue()).get((t) c3959i.f36155Y);
        if (sVar != null && (xVar = sVar.f15241a) != null) {
            StringBuilder sb2 = new StringBuilder();
            if (!c3556a.f33076b.isEmpty()) {
                sb2.append("The user has selected the indices: ");
                sb2.append(kf.t.m2(c3556a.f33076b, ", ", null, null, null, 62));
                sb2.append('\n');
            }
            Set set = c3556a.f33075a;
            if (!set.isEmpty()) {
                sb2.append("The user has selected the columns: ");
                sb2.append(kf.t.m2(set, ", ", null, null, new f(xVar, 0), 30));
                sb2.append('\n');
            }
            Set set2 = c3556a.f33077c;
            if (!set2.isEmpty()) {
                sb2.append("The user has selected the cells: ");
                sb2.append(kf.t.m2(set2, ", ", null, null, new f(xVar, 1), 30));
                sb2.append('\n');
            }
            String sb3 = sb2.toString();
            AbstractC3557B.b0("toString(...)", sb3);
            return X9.b.a(bVar, sb3, true, 2);
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        g gVar;
        t tVar;
        String str4;
        v0 v0Var;
        v0 s0Var;
        Object value;
        Object obj;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f15195k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f15195k0 = i11 - Integer.MIN_VALUE;
                Object obj2 = eVar.f15193i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f15195k0;
                String str5 = "";
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            str4 = eVar.f15192h0;
                            tVar = eVar.f15191Z;
                            gVar = eVar.f15190Y;
                            N.B0(obj2);
                            v0Var = (v0) obj2;
                            id.w wVar = x.Companion;
                            if (!(v0Var instanceof u0)) {
                                try {
                                    String str6 = (String) ((u0) v0Var).f48468a;
                                    wVar.getClass();
                                    AbstractC3557B.c0("string", str6);
                                    s0Var = new u0((x) md.b.f39132a.b(wVar.serializer(), str6));
                                } catch (Exception e10) {
                                    s0Var = new wd.s0(2, e10);
                                }
                                v0Var = s0Var;
                            } else if (!(v0Var instanceof p0) && !(v0Var instanceof q0)) {
                                throw new RuntimeException();
                            }
                            if (!(v0Var instanceof u0)) {
                                s sVar = new s((x) ((u0) v0Var).f48468a, str4);
                                F0 f02 = gVar.f15202e;
                                do {
                                    value = f02.getValue();
                                } while (!f02.e(value, AbstractC4268D.g1((Map) value, new C3959i(tVar, sVar))));
                                return new u0(sVar);
                            }
                            AbstractC3557B.a0("null cannot be cast to non-null type com.openai.types.Result<com.openai.feature.conversationspreadsheet.impl.SpreadsheetData>", v0Var);
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t tVar2 = eVar.f15191Z;
                    g gVar2 = eVar.f15190Y;
                    N.B0(obj2);
                    gVar = gVar2;
                    tVar = tVar2;
                } else {
                    N.B0(obj2);
                    t tVar3 = new t(str, str2, str3);
                    s sVar2 = (s) ((Map) this.f15202e.getValue()).get(tVar3);
                    if (sVar2 != null) {
                        return new u0(sVar2);
                    }
                    String path = Uri.parse(str3).getPath();
                    if (path == null) {
                        path = str5;
                    }
                    eVar.f15190Y = this;
                    eVar.f15191Z = tVar3;
                    eVar.f15195k0 = 1;
                    Object a5 = ((Ta.p) this.f15199b).a(str, str2, path, eVar);
                    if (a5 == enumC5000a) {
                        return enumC5000a;
                    }
                    gVar = this;
                    tVar = tVar3;
                    obj2 = a5;
                }
                obj = (v0) obj2;
                if (!(obj instanceof u0)) {
                    String str7 = (String) ((u0) obj).f48468a;
                    if (str7 != null) {
                        str5 = str7;
                    }
                    obj = new u0(str5);
                } else if (!(obj instanceof p0) && !(obj instanceof q0)) {
                    throw new RuntimeException();
                }
                if (!(obj instanceof u0)) {
                    str4 = (String) ((u0) obj).f48468a;
                    Ic.a aVar = gVar.f15200c;
                    eVar.f15190Y = gVar;
                    eVar.f15191Z = tVar;
                    eVar.f15192h0 = str4;
                    eVar.f15195k0 = 2;
                    obj2 = ((Ua.c) aVar).a(str4, eVar);
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = (v0) obj2;
                    id.w wVar2 = x.Companion;
                    if (!(v0Var instanceof u0)) {
                    }
                    if (!(v0Var instanceof u0)) {
                    }
                } else {
                    AbstractC3557B.a0("null cannot be cast to non-null type com.openai.types.Result<com.openai.feature.conversationspreadsheet.impl.SpreadsheetData>", obj);
                    return obj;
                }
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj22 = eVar.f15193i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f15195k0;
        String str52 = "";
        if (i10 == 0) {
        }
        obj = (v0) obj22;
        if (!(obj instanceof u0)) {
        }
        if (!(obj instanceof u0)) {
        }
    }

    public final Ad.p c(Aa.c cVar) {
        Object value;
        ArrayList arrayList;
        if (cVar instanceof q) {
            C1425j c1425j = C1425j.f17681i;
            q qVar = (q) cVar;
            return new Ad.p(C1425j.o1(qVar.f15235a, qVar.f15236b, qVar.f15237c));
        }
        if (cVar instanceof r) {
            String str = ((r) cVar).f15239b;
            this.f15203f = null;
            AbstractC3557B.c0("value", str);
            C5870a c5870a = (C5870a) this.f15201d;
            synchronized (c5870a) {
                try {
                    F0 f02 = c5870a.f46506b;
                    do {
                        value = f02.getValue();
                        arrayList = new ArrayList();
                        for (Object obj : (List) value) {
                            if (!AbstractC3557B.K(((Aa.e) ((Aa.f) obj)).f735a, str)) {
                                arrayList.add(obj);
                            }
                        }
                    } while (!f02.e(value, arrayList));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }

    public final String d(int i10, int i11) {
        if (i11 == 0) {
            return null;
        }
        return this.f15198a.getResources().getQuantityString(i10, i11, Integer.valueOf(i11));
    }
}
