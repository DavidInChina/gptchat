package xe;

import java.util.ArrayList;
import wf.AbstractC6216a;

/* renamed from: xe.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6422k extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6422k f49931Z = new C6422k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6422k f49932h0 = new C6422k(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6422k f49933i0 = new C6422k(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C6422k f49934j0 = new C6422k(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C6422k f49935k0 = new C6422k(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C6422k f49936l0 = new C6422k(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C6422k f49937m0 = new C6422k(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49938Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6422k(int i10) {
        super(0);
        this.f49938Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f49938Y;
        switch (i10) {
            case 0:
                return mo122invoke();
            case 1:
                return mo122invoke();
            case 2:
                return mo122invoke();
            case 3:
                return mo122invoke();
            case 4:
                return mo122invoke();
            case 5:
                switch (i10) {
                    case 5:
                        return new ArrayList();
                    default:
                        return new ArrayList();
                }
            default:
                switch (i10) {
                    case 5:
                        return new ArrayList();
                    default:
                        return new ArrayList();
                }
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        switch (this.f49938Y) {
            case 0:
                return "day-of-month not in [1,31]";
            case 1:
                return "year >= 1601";
            case 2:
                return "hours > 23";
            case 3:
                return "minutes > 59";
            default:
                return "seconds > 59";
        }
    }
}
