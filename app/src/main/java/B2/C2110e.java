package b2;

import androidx.glance.appwidget.protobuf.AbstractC2043c;
import androidx.glance.appwidget.protobuf.AbstractC2061v;
import androidx.glance.appwidget.protobuf.AbstractC2063x;
import androidx.glance.appwidget.protobuf.AbstractC2065z;
import androidx.glance.appwidget.protobuf.C;
import androidx.glance.appwidget.protobuf.C2052l;
import androidx.glance.appwidget.protobuf.C2057q;
import androidx.glance.appwidget.protobuf.X;
import androidx.glance.appwidget.protobuf.Y;
import androidx.glance.appwidget.protobuf.Z;
import androidx.glance.appwidget.protobuf.a0;
import androidx.glance.appwidget.protobuf.b0;
import androidx.glance.appwidget.protobuf.e0;
import java.io.IOException;
import z.AbstractC6708l;

/* renamed from: b2.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2110e extends AbstractC2063x {
    private static final C2110e DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private AbstractC2065z layout_ = Z.f25195i0;
    private int nextIndex_;

    static {
        C2110e c2110e = new C2110e();
        DEFAULT_INSTANCE = c2110e;
        AbstractC2063x.k(C2110e.class, c2110e);
    }

    public static void n(C2110e c2110e, C2112g c2112g) {
        int i10;
        c2110e.getClass();
        AbstractC2065z abstractC2065z = c2110e.layout_;
        if (!((AbstractC2043c) abstractC2065z).f25202Y) {
            int size = abstractC2065z.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            c2110e.layout_ = abstractC2065z.h(i10);
        }
        c2110e.layout_.add(c2112g);
    }

    public static void o(C2110e c2110e) {
        c2110e.getClass();
        c2110e.layout_ = Z.f25195i0;
    }

    public static void p(C2110e c2110e, int i10) {
        c2110e.nextIndex_ = i10;
    }

    public static C2110e q() {
        return DEFAULT_INSTANCE;
    }

    public static C2110e t(io.sentry.instrumentation.file.d dVar) {
        C2110e c2110e = DEFAULT_INSTANCE;
        C2052l c2052l = new C2052l(dVar);
        C2057q a5 = C2057q.a();
        AbstractC2063x j6 = c2110e.j();
        try {
            Y y10 = Y.f25192c;
            y10.getClass();
            b0 a10 = y10.a(j6.getClass());
            T0.m mVar = c2052l.f25247d;
            if (mVar == null) {
                mVar = new T0.m(c2052l);
            }
            a10.i(j6, mVar, a5);
            a10.d(j6);
            if (AbstractC2063x.g(j6, true)) {
                return (C2110e) j6;
            }
            throw new IOException(new e0().getMessage());
        } catch (C e10) {
            if (e10.f25146Y) {
                throw new IOException(e10.getMessage(), e10);
            }
            throw e10;
        } catch (e0 e11) {
            throw new IOException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof C) {
                throw ((C) e12.getCause());
            }
            throw new IOException(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C) {
                throw ((C) e13.getCause());
            }
            throw e13;
        }
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
                return new a0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C2112g.class, "nextIndex_"});
            case 3:
                return new C2110e();
            case 4:
                return new AbstractC2061v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X x10 = PARSER;
                X x11 = x10;
                if (x10 == null) {
                    synchronized (C2110e.class) {
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

    public final AbstractC2065z r() {
        return this.layout_;
    }

    public final int s() {
        return this.nextIndex_;
    }
}
