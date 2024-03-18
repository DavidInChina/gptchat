package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
final class F1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f35415h;

    public F1(EnumC3764f3 enumC3764f3, int i10) {
        this.f35415h = i10;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final /* bridge */ /* synthetic */ T1 G0() {
        switch (this.f35415h) {
            case 0:
                return M0();
            case 1:
                return M0();
            case 2:
                return M0();
            default:
                return M0();
        }
    }

    public final Long K0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        switch (this.f35415h) {
            case 0:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.v(abstractC3855y0, spliterator);
            case 1:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.v(abstractC3855y0, spliterator);
            case 2:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.v(abstractC3855y0, spliterator);
            default:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.v(abstractC3855y0, spliterator);
        }
    }

    public final Long L0(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        switch (this.f35415h) {
            case 0:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.y(abstractC3855y0, spliterator);
            case 1:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.y(abstractC3855y0, spliterator);
            case 2:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.y(abstractC3855y0, spliterator);
            default:
                return EnumC3759e3.SIZED.s(abstractC3855y0.s0()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.y(abstractC3855y0, spliterator);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.Z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.Z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.Z1, java.lang.Object] */
    public final Z1 M0() {
        switch (this.f35415h) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            default:
                return new Object();
        }
    }

    @Override // j$.util.stream.AbstractC3855y0, j$.util.stream.N3
    public final int h() {
        switch (this.f35415h) {
            case 0:
                return EnumC3759e3.f35634r;
            case 1:
                return EnumC3759e3.f35634r;
            case 2:
                return EnumC3759e3.f35634r;
            default:
                return EnumC3759e3.f35634r;
        }
    }

    @Override // j$.util.stream.AbstractC3855y0, j$.util.stream.N3
    public final /* bridge */ /* synthetic */ Object v(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        switch (this.f35415h) {
            case 0:
                return K0(abstractC3855y0, spliterator);
            case 1:
                return K0(abstractC3855y0, spliterator);
            case 2:
                return K0(abstractC3855y0, spliterator);
            default:
                return K0(abstractC3855y0, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC3855y0, j$.util.stream.N3
    public final /* bridge */ /* synthetic */ Object y(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        switch (this.f35415h) {
            case 0:
                return L0(abstractC3855y0, spliterator);
            case 1:
                return L0(abstractC3855y0, spliterator);
            case 2:
                return L0(abstractC3855y0, spliterator);
            default:
                return L0(abstractC3855y0, spliterator);
        }
    }
}
