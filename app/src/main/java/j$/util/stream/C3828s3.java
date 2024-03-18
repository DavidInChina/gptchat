package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.s3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3828s3 implements AbstractC3813p2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35725a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LongConsumer f35726b;

    public /* synthetic */ C3828s3(LongConsumer longConsumer, int i10) {
        this.f35725a = i10;
        this.f35726b = longConsumer;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        switch (this.f35725a) {
            case 0:
                AbstractC3855y0.z();
                throw null;
            default:
                AbstractC3855y0.z();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f35725a) {
            case 0:
                AbstractC3855y0.G();
                throw null;
            default:
                AbstractC3855y0.G();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        int i10 = this.f35725a;
        LongConsumer longConsumer = this.f35726b;
        switch (i10) {
            case 0:
                ((X2) longConsumer).accept(j6);
                return;
            default:
                longConsumer.accept(j6);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f35725a) {
            case 0:
                j((Long) obj);
                return;
            default:
                j((Long) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35725a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f35725a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        switch (this.f35725a) {
            case 0:
                AbstractC3855y0.E(this, l10);
                return;
            default:
                AbstractC3855y0.E(this, l10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void l(long j6) {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
