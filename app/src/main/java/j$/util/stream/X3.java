package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X3 extends Y3 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f35562h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X3(Spliterator spliterator, Y3 y32, int i10) {
        super(spliterator, y32);
        this.f35562h = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X3(Spliterator spliterator, Predicate predicate, int i10) {
        super(spliterator, predicate);
        this.f35562h = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r2 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        r1.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        r8.accept(r7.f35572g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        return r0;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryAdvance(Consumer consumer) {
        boolean tryAdvance;
        boolean z10;
        int i10 = this.f35562h;
        AtomicBoolean atomicBoolean = this.f35579c;
        boolean z11 = false;
        Predicate predicate = this.f35571f;
        Spliterator spliterator = this.f35577a;
        switch (i10) {
            case 0:
                if (!this.f35580d) {
                    return spliterator.tryAdvance(consumer);
                }
                this.f35580d = false;
                while (true) {
                    tryAdvance = spliterator.tryAdvance(this);
                    if (tryAdvance && ((this.f35581e != 0 || !atomicBoolean.get()) && predicate.test(this.f35572g))) {
                        z11 = true;
                    }
                }
                return tryAdvance;
            default:
                if (!this.f35580d || ((this.f35581e == 0 && atomicBoolean.get()) || !spliterator.tryAdvance(this))) {
                    z10 = true;
                } else {
                    z10 = predicate.test(this.f35572g);
                    if (z10) {
                        consumer.accept(this.f35572g);
                        return true;
                    }
                }
                this.f35580d = false;
                if (z10) {
                    return false;
                }
                atomicBoolean.set(true);
                return false;
        }
    }

    @Override // j$.util.stream.Z3, j$.util.Spliterator
    /* renamed from: trySplit */
    public final Spliterator mo106trySplit() {
        switch (this.f35562h) {
            case 1:
                if (!this.f35579c.get()) {
                    return super.mo106trySplit();
                }
                return null;
            default:
                return super.mo106trySplit();
        }
    }
}
