package O1;

import T0.m;
import androidx.datastore.preferences.protobuf.AbstractC2010a0;
import androidx.datastore.preferences.protobuf.AbstractC2022g0;
import androidx.datastore.preferences.protobuf.AbstractC2038x;
import androidx.datastore.preferences.protobuf.AbstractC2040z;
import androidx.datastore.preferences.protobuf.C2014c0;
import androidx.datastore.preferences.protobuf.C2018e0;
import androidx.datastore.preferences.protobuf.C2027l;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.n0;
import androidx.datastore.preferences.protobuf.r;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class e extends AbstractC2040z {
    private static final e DEFAULT_INSTANCE;
    private static volatile AbstractC2010a0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private P preferences_ = P.f25002Z;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC2040z.h(e.class, eVar);
    }

    public static P i(e eVar) {
        P p10 = eVar.preferences_;
        if (!p10.f25003Y) {
            eVar.preferences_ = p10.b();
        }
        return eVar.preferences_;
    }

    public static c k() {
        return (c) ((AbstractC2038x) DEFAULT_INSTANCE.d(5));
    }

    public static e l(io.sentry.instrumentation.file.d dVar) {
        e eVar = DEFAULT_INSTANCE;
        C2027l c2027l = new C2027l(dVar);
        r a5 = r.a();
        AbstractC2040z abstractC2040z = (AbstractC2040z) eVar.d(4);
        try {
            C2014c0 c2014c0 = C2014c0.f25030c;
            c2014c0.getClass();
            AbstractC2022g0 a10 = c2014c0.a(abstractC2040z.getClass());
            m mVar = c2027l.f25084d;
            if (mVar == null) {
                mVar = new m(c2027l);
            }
            a10.h(abstractC2040z, mVar, a5);
            a10.d(abstractC2040z);
            if (abstractC2040z.g()) {
                return (e) abstractC2040z;
            }
            throw new IOException(new n0().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof D) {
                throw ((D) e10.getCause());
            }
            throw new IOException(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof D) {
                throw ((D) e11.getCause());
            }
            throw e11;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.datastore.preferences.protobuf.a0, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2040z
    public final Object d(int i10) {
        switch (AbstractC6708l.f(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2018e0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f13340a});
            case 3:
                return new e();
            case 4:
                return new AbstractC2038x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2010a0 abstractC2010a0 = PARSER;
                AbstractC2010a0 abstractC2010a02 = abstractC2010a0;
                if (abstractC2010a0 == null) {
                    synchronized (e.class) {
                        try {
                            AbstractC2010a0 abstractC2010a03 = PARSER;
                            AbstractC2010a0 abstractC2010a04 = abstractC2010a03;
                            if (abstractC2010a03 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                abstractC2010a04 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return abstractC2010a02;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
