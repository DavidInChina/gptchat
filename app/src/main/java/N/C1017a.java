package N;

import xe.AbstractC6412a;

/* renamed from: N.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017a extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12274Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f12275Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f12276h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f12277i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017a(AbstractC1031o abstractC1031o, boolean z10, boolean z11) {
        super(1);
        this.f12277i0 = abstractC1031o;
        this.f12275Z = z10;
        this.f12276h0 = z11;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        L.Y y10;
        int i10;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f12274Y;
        boolean z10 = this.f12276h0;
        boolean z11 = this.f12275Z;
        Object obj2 = this.f12277i0;
        switch (i11) {
            case 0:
                L0.v vVar = (L0.v) obj;
                long b10 = ((AbstractC1031o) obj2).b();
                L0.u uVar = P.f12239c;
                if (z11) {
                    y10 = L.Y.f10082Z;
                } else {
                    y10 = L.Y.f10083h0;
                }
                L.Y y11 = y10;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                ((L0.j) vVar).y(uVar, new O(y11, b10, i10, R4.b.z1(b10)));
                return yVar;
            default:
                byte byteValue = ((Number) obj).byteValue();
                if (byteValue == 32) {
                    StringBuilder sb2 = (StringBuilder) obj2;
                    if (z11) {
                        sb2.append('+');
                    } else {
                        sb2.append("%20");
                    }
                } else if (!AbstractC6412a.f49873a.contains(Byte.valueOf(byteValue)) && (z10 || !AbstractC6412a.f49876d.contains(Byte.valueOf(byteValue)))) {
                    ((StringBuilder) obj2).append(AbstractC6412a.a(byteValue));
                } else {
                    ((StringBuilder) obj2).append((char) byteValue);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017a(boolean z10, StringBuilder sb2, boolean z11) {
        super(1);
        this.f12275Z = z10;
        this.f12277i0 = sb2;
        this.f12276h0 = z11;
    }
}
