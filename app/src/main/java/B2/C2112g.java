package b2;

import androidx.glance.appwidget.protobuf.AbstractC2061v;
import androidx.glance.appwidget.protobuf.AbstractC2063x;
import androidx.glance.appwidget.protobuf.X;
import androidx.glance.appwidget.protobuf.a0;
import z.AbstractC6708l;

/* renamed from: b2.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2112g extends AbstractC2063x {
    private static final C2112g DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private int layoutIndex_;
    private C2114i layout_;

    /* JADX WARN: Type inference failed for: r0v0, types: [b2.g, androidx.glance.appwidget.protobuf.x] */
    static {
        ?? abstractC2063x = new AbstractC2063x();
        DEFAULT_INSTANCE = abstractC2063x;
        AbstractC2063x.k(C2112g.class, abstractC2063x);
    }

    public static void n(C2112g c2112g, C2114i c2114i) {
        c2112g.getClass();
        c2114i.getClass();
        c2112g.layout_ = c2114i;
    }

    public static void o(C2112g c2112g, int i10) {
        c2112g.layoutIndex_ = i10;
    }

    public static C2111f r() {
        return (C2111f) ((AbstractC2061v) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, androidx.glance.appwidget.protobuf.X] */
    @Override // androidx.glance.appwidget.protobuf.AbstractC2063x
    public final Object d(int i10) {
        switch (AbstractC6708l.f(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0004", new Object[]{"layout_", "layoutIndex_"});
            case 3:
                return new AbstractC2063x();
            case 4:
                return new AbstractC2061v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X x10 = PARSER;
                X x11 = x10;
                if (x10 == null) {
                    synchronized (C2112g.class) {
                        try {
                            X x12 = PARSER;
                            X x13 = x12;
                            if (x12 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                x13 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return x11;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C2114i p() {
        C2114i c2114i = this.layout_;
        if (c2114i == null) {
            return C2114i.x();
        }
        return c2114i;
    }

    public final int q() {
        return this.layoutIndex_;
    }
}
