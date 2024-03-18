package Zg;

import Df.AbstractC0405d;
import ah.C1996g;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f23729Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f23730h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f23731i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f23732j0 = new a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final a f23733k0 = new a(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23734Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(0);
        this.f23734Y = i10;
    }

    public final C1996g a() {
        switch (this.f23734Y) {
            case 0:
                D d10 = C.f37623a;
                return new C1996g("kotlinx.datetime.DateTimeUnit.DateBased", d10.b(Yg.e.class), new AbstractC0405d[]{d10.b(Yg.g.class), d10.b(Yg.i.class)}, new KSerializer[]{e.f23743a, j.f23753a});
            default:
                D d11 = C.f37623a;
                return new C1996g("kotlinx.datetime.DateTimeUnit", d11.b(Yg.l.class), new AbstractC0405d[]{d11.b(Yg.g.class), d11.b(Yg.i.class), d11.b(Yg.k.class)}, new KSerializer[]{e.f23743a, j.f23753a, k.f23755a});
        }
    }

    public final SerialDescriptor c() {
        switch (this.f23734Y) {
            case 2:
                return Ad.l.N("DayBased", new SerialDescriptor[0], d.f23739Z);
            case 3:
                return Ad.l.N("MonthBased", new SerialDescriptor[0], d.f23740h0);
            default:
                return Ad.l.N("TimeBased", new SerialDescriptor[0], d.f23741i0);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f23734Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return c();
            case 3:
                return c();
            default:
                return c();
        }
    }
}
