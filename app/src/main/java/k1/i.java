package k1;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f36854a;

    /* renamed from: b  reason: collision with root package name */
    public final l f36855b;

    /* renamed from: c  reason: collision with root package name */
    public final k f36856c;

    /* renamed from: d  reason: collision with root package name */
    public final j f36857d;

    /* renamed from: e  reason: collision with root package name */
    public final m f36858e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f36859f = new HashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [k1.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k1.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k1.m, java.lang.Object] */
    public i() {
        ?? obj = new Object();
        obj.f36923a = 0;
        obj.f36924b = 0;
        obj.f36925c = 1.0f;
        obj.f36926d = Float.NaN;
        this.f36855b = obj;
        ?? obj2 = new Object();
        obj2.f36919a = -1;
        obj2.f36920b = -1;
        obj2.f36921c = Float.NaN;
        obj2.f36922d = Float.NaN;
        this.f36856c = obj2;
        ?? obj3 = new Object();
        obj3.f36883a = false;
        obj3.f36889d = -1;
        obj3.f36891e = -1;
        obj3.f36893f = -1.0f;
        obj3.f36895g = -1;
        obj3.f36897h = -1;
        obj3.f36899i = -1;
        obj3.f36901j = -1;
        obj3.f36902k = -1;
        obj3.f36903l = -1;
        obj3.f36904m = -1;
        obj3.f36905n = -1;
        obj3.f36906o = -1;
        obj3.f36907p = -1;
        obj3.f36908q = -1;
        obj3.f36909r = -1;
        obj3.f36910s = -1;
        obj3.f36911t = 0.5f;
        obj3.f36912u = 0.5f;
        obj3.f36913v = null;
        obj3.f36914w = -1;
        obj3.f36915x = 0;
        obj3.f36916y = 0.0f;
        obj3.f36917z = -1;
        obj3.f36861A = -1;
        obj3.f36862B = -1;
        obj3.f36863C = -1;
        obj3.f36864D = -1;
        obj3.f36865E = -1;
        obj3.f36866F = -1;
        obj3.f36867G = -1;
        obj3.f36868H = -1;
        obj3.f36869I = -1;
        obj3.f36870J = -1;
        obj3.f36871K = -1;
        obj3.f36872L = -1;
        obj3.f36873M = -1;
        obj3.f36874N = -1;
        obj3.f36875O = -1.0f;
        obj3.P = -1.0f;
        obj3.Q = 0;
        obj3.f36876R = 0;
        obj3.S = 0;
        obj3.T = 0;
        obj3.f36877U = -1;
        obj3.f36878V = -1;
        obj3.f36879W = -1;
        obj3.f36880X = -1;
        obj3.f36881Y = 1.0f;
        obj3.f36882Z = 1.0f;
        obj3.f36884a0 = -1;
        obj3.f36886b0 = 0;
        obj3.f36888c0 = -1;
        obj3.f36896g0 = false;
        obj3.f36898h0 = false;
        obj3.f36900i0 = true;
        this.f36857d = obj3;
        ?? obj4 = new Object();
        obj4.f36928a = 0.0f;
        obj4.f36929b = 0.0f;
        obj4.f36930c = 0.0f;
        obj4.f36931d = 1.0f;
        obj4.f36932e = 1.0f;
        obj4.f36933f = Float.NaN;
        obj4.f36934g = Float.NaN;
        obj4.f36935h = 0.0f;
        obj4.f36936i = 0.0f;
        obj4.f36937j = 0.0f;
        obj4.f36938k = false;
        obj4.f36939l = 0.0f;
        this.f36858e = obj4;
    }

    public final void a(e eVar) {
        j jVar = this.f36857d;
        eVar.f36809d = jVar.f36895g;
        eVar.f36811e = jVar.f36897h;
        eVar.f36813f = jVar.f36899i;
        eVar.f36815g = jVar.f36901j;
        eVar.f36817h = jVar.f36902k;
        eVar.f36819i = jVar.f36903l;
        eVar.f36821j = jVar.f36904m;
        eVar.f36823k = jVar.f36905n;
        eVar.f36825l = jVar.f36906o;
        eVar.f36829p = jVar.f36907p;
        eVar.f36830q = jVar.f36908q;
        eVar.f36831r = jVar.f36909r;
        eVar.f36832s = jVar.f36910s;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.f36863C;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.f36864D;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.f36865E;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.f36866F;
        eVar.f36837x = jVar.f36874N;
        eVar.f36838y = jVar.f36873M;
        eVar.f36834u = jVar.f36870J;
        eVar.f36836w = jVar.f36872L;
        eVar.f36839z = jVar.f36911t;
        eVar.f36781A = jVar.f36912u;
        eVar.f36826m = jVar.f36914w;
        eVar.f36827n = jVar.f36915x;
        eVar.f36828o = jVar.f36916y;
        eVar.f36782B = jVar.f36913v;
        eVar.P = jVar.f36917z;
        eVar.Q = jVar.f36861A;
        eVar.f36785E = jVar.f36875O;
        eVar.f36784D = jVar.P;
        eVar.f36787G = jVar.f36876R;
        eVar.f36786F = jVar.Q;
        eVar.S = jVar.f36896g0;
        eVar.T = jVar.f36898h0;
        eVar.f36788H = jVar.S;
        eVar.f36789I = jVar.T;
        eVar.f36792L = jVar.f36877U;
        eVar.f36793M = jVar.f36878V;
        eVar.f36790J = jVar.f36879W;
        eVar.f36791K = jVar.f36880X;
        eVar.f36794N = jVar.f36881Y;
        eVar.f36795O = jVar.f36882Z;
        eVar.f36796R = jVar.f36862B;
        eVar.f36807c = jVar.f36893f;
        eVar.f36803a = jVar.f36889d;
        eVar.f36805b = jVar.f36891e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f36885b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f36887c;
        String str = jVar.f36894f0;
        if (str != null) {
            eVar.f36797U = str;
        }
        eVar.setMarginStart(jVar.f36868H);
        eVar.setMarginEnd(jVar.f36867G);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f36857d;
        jVar.getClass();
        j jVar2 = this.f36857d;
        jVar.f36883a = jVar2.f36883a;
        jVar.f36885b = jVar2.f36885b;
        jVar.f36887c = jVar2.f36887c;
        jVar.f36889d = jVar2.f36889d;
        jVar.f36891e = jVar2.f36891e;
        jVar.f36893f = jVar2.f36893f;
        jVar.f36895g = jVar2.f36895g;
        jVar.f36897h = jVar2.f36897h;
        jVar.f36899i = jVar2.f36899i;
        jVar.f36901j = jVar2.f36901j;
        jVar.f36902k = jVar2.f36902k;
        jVar.f36903l = jVar2.f36903l;
        jVar.f36904m = jVar2.f36904m;
        jVar.f36905n = jVar2.f36905n;
        jVar.f36906o = jVar2.f36906o;
        jVar.f36907p = jVar2.f36907p;
        jVar.f36908q = jVar2.f36908q;
        jVar.f36909r = jVar2.f36909r;
        jVar.f36910s = jVar2.f36910s;
        jVar.f36911t = jVar2.f36911t;
        jVar.f36912u = jVar2.f36912u;
        jVar.f36913v = jVar2.f36913v;
        jVar.f36914w = jVar2.f36914w;
        jVar.f36915x = jVar2.f36915x;
        jVar.f36916y = jVar2.f36916y;
        jVar.f36917z = jVar2.f36917z;
        jVar.f36861A = jVar2.f36861A;
        jVar.f36862B = jVar2.f36862B;
        jVar.f36863C = jVar2.f36863C;
        jVar.f36864D = jVar2.f36864D;
        jVar.f36865E = jVar2.f36865E;
        jVar.f36866F = jVar2.f36866F;
        jVar.f36867G = jVar2.f36867G;
        jVar.f36868H = jVar2.f36868H;
        jVar.f36869I = jVar2.f36869I;
        jVar.f36870J = jVar2.f36870J;
        jVar.f36871K = jVar2.f36871K;
        jVar.f36872L = jVar2.f36872L;
        jVar.f36873M = jVar2.f36873M;
        jVar.f36874N = jVar2.f36874N;
        jVar.f36875O = jVar2.f36875O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.f36876R = jVar2.f36876R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.f36877U = jVar2.f36877U;
        jVar.f36878V = jVar2.f36878V;
        jVar.f36879W = jVar2.f36879W;
        jVar.f36880X = jVar2.f36880X;
        jVar.f36881Y = jVar2.f36881Y;
        jVar.f36882Z = jVar2.f36882Z;
        jVar.f36884a0 = jVar2.f36884a0;
        jVar.f36886b0 = jVar2.f36886b0;
        jVar.f36888c0 = jVar2.f36888c0;
        jVar.f36894f0 = jVar2.f36894f0;
        int[] iArr = jVar2.f36890d0;
        if (iArr != null) {
            jVar.f36890d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f36890d0 = null;
        }
        jVar.f36892e0 = jVar2.f36892e0;
        jVar.f36896g0 = jVar2.f36896g0;
        jVar.f36898h0 = jVar2.f36898h0;
        jVar.f36900i0 = jVar2.f36900i0;
        k kVar = iVar.f36856c;
        kVar.getClass();
        k kVar2 = this.f36856c;
        kVar2.getClass();
        kVar.f36919a = kVar2.f36919a;
        kVar.f36920b = kVar2.f36920b;
        kVar.f36922d = kVar2.f36922d;
        kVar.f36921c = kVar2.f36921c;
        l lVar = iVar.f36855b;
        lVar.getClass();
        l lVar2 = this.f36855b;
        lVar2.getClass();
        lVar.f36923a = lVar2.f36923a;
        lVar.f36925c = lVar2.f36925c;
        lVar.f36926d = lVar2.f36926d;
        lVar.f36924b = lVar2.f36924b;
        m mVar = iVar.f36858e;
        mVar.getClass();
        m mVar2 = this.f36858e;
        mVar2.getClass();
        mVar.f36928a = mVar2.f36928a;
        mVar.f36929b = mVar2.f36929b;
        mVar.f36930c = mVar2.f36930c;
        mVar.f36931d = mVar2.f36931d;
        mVar.f36932e = mVar2.f36932e;
        mVar.f36933f = mVar2.f36933f;
        mVar.f36934g = mVar2.f36934g;
        mVar.f36935h = mVar2.f36935h;
        mVar.f36936i = mVar2.f36936i;
        mVar.f36937j = mVar2.f36937j;
        mVar.f36938k = mVar2.f36938k;
        mVar.f36939l = mVar2.f36939l;
        iVar.f36854a = this.f36854a;
        return iVar;
    }
}
