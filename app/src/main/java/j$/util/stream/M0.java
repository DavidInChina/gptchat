package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M0 extends P0 {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f35472l = 0;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f35473k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(int i10, Spliterator spliterator, AbstractC3855y0 abstractC3855y0) {
        super(abstractC3855y0, spliterator, new C3740b(27), new C3740b(28));
        this.f35473k = i10;
        if (i10 == 1) {
            super(abstractC3855y0, spliterator, new C3740b(29), new N0(0));
        } else if (i10 != 2) {
        } else {
            super(abstractC3855y0, spliterator, new N0(1), new N0(2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(Spliterator spliterator, AbstractC3855y0 abstractC3855y0, IntFunction intFunction) {
        super(abstractC3855y0, spliterator, new O0(intFunction), new N0(3));
        this.f35473k = 3;
    }

    @Override // j$.util.stream.P0, j$.util.stream.AbstractC3760f
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (this.f35473k) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }

    @Override // j$.util.stream.P0, j$.util.stream.AbstractC3760f
    protected final AbstractC3760f e(Spliterator spliterator) {
        switch (this.f35473k) {
            case 0:
                return new P0(this, spliterator);
            case 1:
                return new P0(this, spliterator);
            case 2:
                return new P0(this, spliterator);
            default:
                return new P0(this, spliterator);
        }
    }
}
