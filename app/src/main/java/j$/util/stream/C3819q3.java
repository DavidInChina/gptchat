package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.q3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3819q3 implements AbstractC3808o2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35713a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f35714b;

    public /* synthetic */ C3819q3(IntConsumer intConsumer, int i10) {
        this.f35713a = i10;
        this.f35714b = intConsumer;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f35713a) {
            case 0:
                AbstractC3855y0.z();
                throw null;
            default:
                AbstractC3855y0.z();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3808o2, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        int i11 = this.f35713a;
        IntConsumer intConsumer = this.f35714b;
        switch (i11) {
            case 0:
                ((V2) intConsumer).accept(i10);
                return;
            default:
                intConsumer.accept(i10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        switch (this.f35713a) {
            case 0:
                AbstractC3855y0.H();
                throw null;
            default:
                AbstractC3855y0.H();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f35713a) {
            case 0:
                m((Integer) obj);
                return;
            default:
                m((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35713a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f35713a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void l(long j6) {
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        switch (this.f35713a) {
            case 0:
                AbstractC3855y0.C(this, num);
                return;
            default:
                AbstractC3855y0.C(this, num);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
