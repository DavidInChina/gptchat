package N9;

import S9.g;
import S9.h;
import S9.j;
import fa.C2969F;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes.dex */
public final class a extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f12746Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f12747h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f12748i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f12749j0 = new a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final a f12750k0 = new a(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final a f12751l0 = new a(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final a f12752m0 = new a(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12753Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f12753Y = i10;
    }

    public final f a(C2969F c2969f) {
        switch (this.f12753Y) {
            case 0:
                AbstractC3557B.c0("it", c2969f);
                return new S9.a(c2969f);
            case 1:
                AbstractC3557B.c0("it", c2969f);
                return new S9.a(c2969f);
            case 2:
                AbstractC3557B.c0("it", c2969f);
                return new S9.f(c2969f);
            case 3:
                AbstractC3557B.c0("it", c2969f);
                return new g(c2969f);
            case 4:
                AbstractC3557B.c0("it", c2969f);
                return new g(c2969f);
            case 5:
                AbstractC3557B.c0("it", c2969f);
                return new h(c2969f);
            default:
                AbstractC3557B.c0("it", c2969f);
                return new j(c2969f);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f12753Y) {
            case 0:
                return a((C2969F) obj);
            case 1:
                return a((C2969F) obj);
            case 2:
                return a((C2969F) obj);
            case 3:
                return a((C2969F) obj);
            case 4:
                return a((C2969F) obj);
            case 5:
                return a((C2969F) obj);
            default:
                return a((C2969F) obj);
        }
    }
}
