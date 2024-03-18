package io.ktor.utils.io;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.lang.reflect.Constructor;
import jf.C3960j;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33373Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Constructor f33374Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Constructor constructor, int i10) {
        super(1);
        this.f33373Y = i10;
        this.f33374Z = constructor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(Throwable th2) {
        Object obj;
        Object obj2;
        C3960j c3960j;
        C3960j c3960j2;
        int i10 = this.f33373Y;
        Object obj3 = null;
        Constructor constructor = this.f33374Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("e", th2);
                try {
                    Object newInstance = constructor.newInstance(th2.getMessage(), th2);
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance);
                    obj = (Throwable) newInstance;
                } catch (Throwable th3) {
                    obj = N.w(th3);
                }
                if (!(obj instanceof C3960j)) {
                    obj3 = obj;
                }
                return (Throwable) obj3;
            case 1:
                AbstractC3557B.c0("e", th2);
                try {
                    Object newInstance2 = constructor.newInstance(th2);
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance2);
                    obj2 = (Throwable) newInstance2;
                } catch (Throwable th4) {
                    obj2 = N.w(th4);
                }
                if (!(obj2 instanceof C3960j)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
            case 2:
                AbstractC3557B.c0("e", th2);
                try {
                    Object newInstance3 = constructor.newInstance(th2.getMessage());
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance3);
                    Throwable th5 = (Throwable) newInstance3;
                    th5.initCause(th2);
                    c3960j = th5;
                } catch (Throwable th6) {
                    c3960j = N.w(th6);
                }
                if (!(c3960j instanceof C3960j)) {
                    obj3 = c3960j;
                }
                return (Throwable) obj3;
            case 3:
                AbstractC3557B.c0("e", th2);
                try {
                    Object newInstance4 = constructor.newInstance(new Object[0]);
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance4);
                    Throwable th7 = (Throwable) newInstance4;
                    th7.initCause(th2);
                    c3960j2 = th7;
                } catch (Throwable th8) {
                    c3960j2 = N.w(th8);
                }
                if (!(c3960j2 instanceof C3960j)) {
                    obj3 = c3960j2;
                }
                return (Throwable) obj3;
            case 4:
                Object newInstance5 = constructor.newInstance(th2.getMessage(), th2);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance5);
                return (Throwable) newInstance5;
            case 5:
                Object newInstance6 = constructor.newInstance(th2.getMessage());
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance6);
                Throwable th9 = (Throwable) newInstance6;
                th9.initCause(th2);
                return th9;
            case 6:
                Object newInstance7 = constructor.newInstance(th2);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance7);
                return (Throwable) newInstance7;
            default:
                Object newInstance8 = constructor.newInstance(new Object[0]);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", newInstance8);
                Throwable th10 = (Throwable) newInstance8;
                th10.initCause(th2);
                return th10;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f33373Y) {
            case 0:
                return a((Throwable) obj);
            case 1:
                return a((Throwable) obj);
            case 2:
                return a((Throwable) obj);
            case 3:
                return a((Throwable) obj);
            case 4:
                return a((Throwable) obj);
            case 5:
                return a((Throwable) obj);
            case 6:
                return a((Throwable) obj);
            default:
                return a((Throwable) obj);
        }
    }
}
