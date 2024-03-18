package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3800n implements Consumer, Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35692a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f35693b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f35694c;

    public /* synthetic */ C3800n(int i10, Object obj, Object obj2) {
        this.f35692a = i10;
        this.f35693b = obj;
        this.f35694c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35692a;
        Object obj2 = this.f35694c;
        Object obj3 = this.f35693b;
        switch (i10) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C3804n3) obj3).a((Consumer) obj2, obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35692a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i10 = this.f35692a;
        Object obj = this.f35694c;
        Object obj2 = this.f35693b;
        switch (i10) {
            case 1:
                j$.time.b.b(obj);
                return new AbstractC3835u0((EnumC3840v0) obj2);
            case 2:
                j$.time.b.b(obj);
                return new AbstractC3835u0((EnumC3840v0) obj2);
            case 3:
                j$.time.b.b(obj);
                return new AbstractC3835u0((EnumC3840v0) obj2);
            default:
                return new C3816q0((EnumC3840v0) obj2, (Predicate) obj);
        }
    }
}
