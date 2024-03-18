package O1;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC2010a0;
import androidx.datastore.preferences.protobuf.AbstractC2012b0;
import androidx.datastore.preferences.protobuf.AbstractC2013c;
import androidx.datastore.preferences.protobuf.AbstractC2025j;
import androidx.datastore.preferences.protobuf.AbstractC2038x;
import androidx.datastore.preferences.protobuf.AbstractC2040z;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C2016d0;
import androidx.datastore.preferences.protobuf.C2018e0;
import androidx.datastore.preferences.protobuf.H;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class g extends AbstractC2040z {
    private static final g DEFAULT_INSTANCE;
    private static volatile AbstractC2010a0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private A strings_ = C2016d0.f25035i0;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC2040z.h(g.class, gVar);
    }

    public static void i(g gVar, Iterable iterable) {
        int i10;
        A a5 = gVar.strings_;
        if (!((AbstractC2013c) a5).f25029Y) {
            int size = a5.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            gVar.strings_ = a5.h(i10);
        }
        A a10 = gVar.strings_;
        Charset charset = B.f24959a;
        iterable.getClass();
        if (iterable instanceof H) {
            List d10 = ((H) iterable).d();
            H h10 = (H) a10;
            int size2 = a10.size();
            for (Object obj : d10) {
                if (obj == null) {
                    String str = "Element at index " + (h10.size() - size2) + " is null.";
                    for (int size3 = h10.size() - 1; size3 >= size2; size3--) {
                        h10.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof AbstractC2025j) {
                    h10.b0((AbstractC2025j) obj);
                } else {
                    h10.add((String) obj);
                }
            }
        } else if (iterable instanceof AbstractC2012b0) {
            a10.addAll((Collection) iterable);
        } else {
            if ((a10 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) a10).ensureCapacity(((Collection) iterable).size() + a10.size());
            }
            int size4 = a10.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (a10.size() - size4) + " is null.";
                    for (int size5 = a10.size() - 1; size5 >= size4; size5--) {
                        a10.remove(size5);
                    }
                    throw new NullPointerException(str2);
                }
                a10.add(obj2);
            }
        }
    }

    public static g j() {
        return DEFAULT_INSTANCE;
    }

    public static f l() {
        return (f) ((AbstractC2038x) DEFAULT_INSTANCE.d(5));
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.datastore.preferences.protobuf.a0, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2040z
    public final Object d(int i10) {
        switch (AbstractC6708l.f(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2018e0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new AbstractC2038x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2010a0 abstractC2010a0 = PARSER;
                AbstractC2010a0 abstractC2010a02 = abstractC2010a0;
                if (abstractC2010a0 == null) {
                    synchronized (g.class) {
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

    public final A k() {
        return this.strings_;
    }
}
