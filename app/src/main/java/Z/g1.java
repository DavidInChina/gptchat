package Z;

import Qg.AbstractC1207j;
import j0.AbstractC3890f;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import w.C6074u;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class g1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C6074u f22624Y;

    /* renamed from: Z  reason: collision with root package name */
    public wf.k f22625Z;

    /* renamed from: h0  reason: collision with root package name */
    public Pg.o f22626h0;

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC3890f f22627i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f22628j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f22629k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f22630l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f22631m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22631m0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        g1 g1Var = new g1(this.f22631m0, abstractC4825e);
        g1Var.f22630l0 = obj;
        return g1Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((g1) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[Catch: all -> 0x0026, TryCatch #2 {all -> 0x0026, blocks: (B:8:0x0021, B:13:0x003f, B:16:0x0054, B:18:0x0082, B:22:0x0095, B:26:0x00ae, B:29:0x00c3, B:31:0x00c8, B:34:0x00d3, B:36:0x00e8, B:38:0x00f4, B:40:0x00fe, B:45:0x0113, B:51:0x0127, B:54:0x0130, B:57:0x013f, B:61:0x0157, B:63:0x0160, B:58:0x014c, B:60:0x0154, B:59:0x0150, B:19:0x008a, B:21:0x0092, B:20:0x008e), top: B:72:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #2 {all -> 0x0026, blocks: (B:8:0x0021, B:13:0x003f, B:16:0x0054, B:18:0x0082, B:22:0x0095, B:26:0x00ae, B:29:0x00c3, B:31:0x00c8, B:34:0x00d3, B:36:0x00e8, B:38:0x00f4, B:40:0x00fe, B:45:0x0113, B:51:0x0127, B:54:0x0130, B:57:0x013f, B:61:0x0157, B:63:0x0160, B:58:0x014c, B:60:0x0154, B:59:0x0150, B:19:0x008a, B:21:0x0092, B:20:0x008e), top: B:72:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188 A[LOOP:0: B:30:0x00c6->B:69:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d A[EDGE_INSN: B:74:0x013d->B:56:0x013d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0176 -> B:67:0x0177). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x017b -> B:67:0x0177). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
