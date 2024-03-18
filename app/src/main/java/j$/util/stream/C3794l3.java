package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.l3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3794l3 extends AbstractC3799m3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f35679b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3794l3(int i10) {
        this.f35679b = new Object[i10];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35691a;
        this.f35691a = i10 + 1;
        this.f35679b[i10] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
