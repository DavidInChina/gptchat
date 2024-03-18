package U7;

import com.google.android.material.carousel.CarouselLayoutManager;
import x2.AbstractC6266a;

/* loaded from: classes2.dex */
public final class d extends AbstractC6266a {

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f17509h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f17510i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, CarouselLayoutManager carouselLayoutManager, int i11) {
        super(i10);
        this.f17509h0 = i11;
        this.f17510i0 = carouselLayoutManager;
    }

    public final int i() {
        int i10 = this.f17509h0;
        CarouselLayoutManager carouselLayoutManager = this.f17510i0;
        switch (i10) {
            case 0:
                return carouselLayoutManager.f47766o;
            default:
                return carouselLayoutManager.f47766o - carouselLayoutManager.B();
        }
    }

    public final int j() {
        int i10 = this.f17509h0;
        CarouselLayoutManager carouselLayoutManager = this.f17510i0;
        switch (i10) {
            case 0:
                return carouselLayoutManager.f47765n - carouselLayoutManager.D();
            default:
                return carouselLayoutManager.f47765n;
        }
    }

    public final int k() {
        CarouselLayoutManager carouselLayoutManager = this.f17510i0;
        int i10 = this.f17509h0;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return 0;
                    default:
                        return carouselLayoutManager.E();
                }
            default:
                if (carouselLayoutManager.D0()) {
                    return j();
                }
                switch (i10) {
                    case 0:
                        return carouselLayoutManager.C();
                    default:
                        return 0;
                }
        }
    }
}
