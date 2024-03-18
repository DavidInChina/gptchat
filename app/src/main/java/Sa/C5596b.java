package sa;

import Qg.F0;
import Qg.r0;
import Ya.r;
import cb.C2334C;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.O;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import wf.n;
import yf.AbstractC6583a;

/* renamed from: sa.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5596b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C5599e f45470Y;

    /* renamed from: Z  reason: collision with root package name */
    public Collection f45471Z;

    /* renamed from: h0  reason: collision with root package name */
    public Iterator f45472h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f45473i0;

    /* renamed from: j0  reason: collision with root package name */
    public Collection f45474j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f45475k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f45476l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ C5599e f45477m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5596b(C5599e c5599e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45477m0 = c5599e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5596b c5596b = new C5596b(this.f45477m0, abstractC4825e);
        c5596b.f45476l0 = obj;
        return c5596b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5596b) create((C3959i) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c2 -> B:27:0x00cd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f5 -> B:34:0x00f6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0100 -> B:38:0x0106). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5599e c5599e;
        String str;
        Object value;
        Iterator it;
        C5599e c5599e2;
        Collection collection;
        Iterator it2;
        String str2;
        Collection collection2;
        String str3;
        Object obj2;
        v0 v0Var;
        Object value2;
        C2334C c2334c;
        Map map;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45475k0;
        y yVar = y.f36177a;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    collection2 = this.f45474j0;
                    str2 = this.f45473i0;
                    it2 = this.f45472h0;
                    collection = this.f45471Z;
                    c5599e = this.f45470Y;
                    String str4 = (String) this.f45476l0;
                    N.B0(obj);
                    C2334C c2334c2 = null;
                    String str5 = str2;
                    Collection collection3 = collection2;
                    str = str4;
                    Collection collection4 = collection;
                    Iterator it3 = it2;
                    String str6 = str5;
                    Map map2 = ((J9.b) c5599e.f45483b.getValue()).f8895b;
                    if (c2334c2 != null) {
                        map2 = AbstractC4268D.g1(map2, new C3959i(new O(c2334c2.f26438a), c2334c2));
                    }
                    F0 f02 = c5599e.f45483b;
                    if (str != null || !AbstractC3557B.K(str6, str)) {
                        c2334c2 = ((J9.b) f02.getValue()).f8894a;
                    }
                    do {
                        value = f02.getValue();
                        ((J9.b) value).getClass();
                        AbstractC3557B.c0("allGizmosInConversation", map2);
                    } while (!f02.e(value, new J9.b(c2334c2, map2, false)));
                    collection3.add(yVar);
                    it = it3;
                    c5599e2 = c5599e;
                    collection = collection4;
                    i11 = 2;
                    if (it.hasNext()) {
                        String str7 = ((O) it.next()).f48362a;
                        this.f45476l0 = str;
                        this.f45470Y = c5599e2;
                        Collection collection5 = collection;
                        this.f45471Z = collection5;
                        this.f45472h0 = it;
                        this.f45473i0 = str7;
                        this.f45474j0 = collection5;
                        this.f45475k0 = 1;
                        obj2 = ((r) c5599e2.f45482a).b(str7, this, true);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                        str3 = str;
                        collection2 = collection;
                        C5599e c5599e3 = c5599e2;
                        it2 = it;
                        str2 = str7;
                        c5599e = c5599e3;
                        v0Var = (v0) obj2;
                        if (v0Var instanceof u0) {
                            str5 = str2;
                            collection3 = collection2;
                            str = str3;
                            c2334c2 = (C2334C) ((u0) v0Var).f48468a;
                            Collection collection42 = collection;
                            Iterator it32 = it2;
                            String str62 = str5;
                            Map map22 = ((J9.b) c5599e.f45483b.getValue()).f8895b;
                            if (c2334c2 != null) {
                            }
                            F0 f022 = c5599e.f45483b;
                            if (str != null) {
                            }
                            c2334c2 = ((J9.b) f022.getValue()).f8894a;
                            do {
                                value = f022.getValue();
                                ((J9.b) value).getClass();
                                AbstractC3557B.c0("allGizmosInConversation", map22);
                            } while (!f022.e(value, new J9.b(c2334c2, map22, false)));
                            collection3.add(yVar);
                            it = it32;
                            c5599e2 = c5599e;
                            collection = collection42;
                            i11 = 2;
                            if (it.hasNext()) {
                            }
                        } else if (v0Var instanceof q0) {
                            r0 r0Var = c5599e.f45485d;
                            this.f45476l0 = str3;
                            this.f45470Y = c5599e;
                            this.f45471Z = collection;
                            this.f45472h0 = it2;
                            this.f45473i0 = str2;
                            this.f45474j0 = collection2;
                            this.f45475k0 = i11;
                            if (r0Var.c((q0) v0Var, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            str4 = str3;
                            C2334C c2334c22 = null;
                            String str52 = str2;
                            Collection collection32 = collection2;
                            str = str4;
                            Collection collection422 = collection;
                            Iterator it322 = it2;
                            String str622 = str52;
                            Map map222 = ((J9.b) c5599e.f45483b.getValue()).f8895b;
                            if (c2334c22 != null) {
                            }
                            F0 f0222 = c5599e.f45483b;
                            if (str != null) {
                            }
                            c2334c22 = ((J9.b) f0222.getValue()).f8894a;
                            do {
                                value = f0222.getValue();
                                ((J9.b) value).getClass();
                                AbstractC3557B.c0("allGizmosInConversation", map222);
                            } while (!f0222.e(value, new J9.b(c2334c22, map222, false)));
                            collection32.add(yVar);
                            it = it322;
                            c5599e2 = c5599e;
                            collection = collection422;
                            i11 = 2;
                            if (it.hasNext()) {
                            }
                        } else if (v0Var instanceof p0) {
                            collection422 = collection;
                            it322 = it2;
                            str622 = str2;
                            collection32 = collection2;
                            str = str3;
                            c2334c22 = null;
                            Map map2222 = ((J9.b) c5599e.f45483b.getValue()).f8895b;
                            if (c2334c22 != null) {
                            }
                            F0 f02222 = c5599e.f45483b;
                            if (str != null) {
                            }
                            c2334c22 = ((J9.b) f02222.getValue()).f8894a;
                            do {
                                value = f02222.getValue();
                                ((J9.b) value).getClass();
                                AbstractC3557B.c0("allGizmosInConversation", map2222);
                            } while (!f02222.e(value, new J9.b(c2334c22, map2222, false)));
                            collection32.add(yVar);
                            it = it322;
                            c5599e2 = c5599e;
                            collection = collection422;
                            i11 = 2;
                            if (it.hasNext()) {
                                List list = (List) collection;
                                return yVar;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                collection2 = this.f45474j0;
                str2 = this.f45473i0;
                it2 = this.f45472h0;
                collection = this.f45471Z;
                c5599e = this.f45470Y;
                N.B0(obj);
                str3 = (String) this.f45476l0;
                obj2 = obj;
                v0Var = (v0) obj2;
                if (v0Var instanceof u0) {
                }
            }
        } else {
            N.B0(obj);
            C3959i c3959i = (C3959i) this.f45476l0;
            List list2 = (List) c3959i.f36155Y;
            O o10 = (O) c3959i.f36156Z;
            if (o10 != null) {
                str = o10.f48362a;
            } else {
                str = null;
            }
            c5599e2 = this.f45477m0;
            F0 f03 = c5599e2.f45483b;
            do {
                value2 = f03.getValue();
                J9.b bVar = (J9.b) value2;
                c2334c = bVar.f8894a;
                map = bVar.f8895b;
                AbstractC3557B.c0("allGizmosInConversation", map);
            } while (!f03.e(value2, new J9.b(c2334c, map, true)));
            collection = new ArrayList(AbstractC6583a.H1(list2, 10));
            it = list2.iterator();
            if (it.hasNext()) {
            }
        }
    }
}
