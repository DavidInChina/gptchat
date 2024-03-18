package b2;

import androidx.glance.appwidget.protobuf.A;
import androidx.glance.appwidget.protobuf.AbstractC2043c;
import androidx.glance.appwidget.protobuf.AbstractC2049i;
import androidx.glance.appwidget.protobuf.AbstractC2061v;
import androidx.glance.appwidget.protobuf.AbstractC2063x;
import androidx.glance.appwidget.protobuf.AbstractC2065z;
import androidx.glance.appwidget.protobuf.F;
import androidx.glance.appwidget.protobuf.X;
import androidx.glance.appwidget.protobuf.Z;
import androidx.glance.appwidget.protobuf.a0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z.AbstractC6708l;

/* renamed from: b2.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2114i extends AbstractC2063x {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final C2114i DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile X PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private AbstractC2065z children_ = Z.f25195i0;
    private boolean hasAction_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        C2114i c2114i = new C2114i();
        DEFAULT_INSTANCE = c2114i;
        AbstractC2063x.k(C2114i.class, c2114i);
    }

    public static void n(C2114i c2114i, EnumC2115j enumC2115j) {
        c2114i.getClass();
        c2114i.type_ = enumC2115j.a();
    }

    public static void o(C2114i c2114i, EnumC2107b enumC2107b) {
        c2114i.getClass();
        c2114i.width_ = enumC2107b.a();
    }

    public static void p(C2114i c2114i, EnumC2107b enumC2107b) {
        c2114i.getClass();
        c2114i.height_ = enumC2107b.a();
    }

    public static void q(C2114i c2114i, EnumC2108c enumC2108c) {
        c2114i.getClass();
        c2114i.horizontalAlignment_ = enumC2108c.a();
    }

    public static void r(C2114i c2114i, EnumC2117l enumC2117l) {
        c2114i.getClass();
        c2114i.verticalAlignment_ = enumC2117l.a();
    }

    public static void s(C2114i c2114i, EnumC2106a enumC2106a) {
        c2114i.getClass();
        c2114i.imageScale_ = enumC2106a.a();
    }

    public static void t(C2114i c2114i) {
        EnumC2116k enumC2116k = EnumC2116k.BACKGROUND_NODE;
        c2114i.getClass();
        c2114i.identity_ = enumC2116k.a();
    }

    public static void u(C2114i c2114i, boolean z10) {
        c2114i.hasAction_ = z10;
    }

    public static void v(C2114i c2114i, ArrayList arrayList) {
        int i10;
        AbstractC2065z abstractC2065z = c2114i.children_;
        if (!((AbstractC2043c) abstractC2065z).f25202Y) {
            int size = abstractC2065z.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            c2114i.children_ = abstractC2065z.h(i10);
        }
        AbstractC2065z abstractC2065z2 = c2114i.children_;
        Charset charset = A.f25144a;
        if (arrayList instanceof F) {
            List d10 = ((F) arrayList).d();
            F f6 = (F) abstractC2065z2;
            int size2 = abstractC2065z2.size();
            for (Object obj : d10) {
                if (obj == null) {
                    String str = "Element at index " + (f6.size() - size2) + " is null.";
                    for (int size3 = f6.size() - 1; size3 >= size2; size3--) {
                        f6.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof AbstractC2049i) {
                    f6.a0((AbstractC2049i) obj);
                } else {
                    f6.add((String) obj);
                }
            }
            return;
        }
        if (abstractC2065z2 instanceof ArrayList) {
            ((ArrayList) abstractC2065z2).ensureCapacity(arrayList.size() + abstractC2065z2.size());
        }
        int size4 = abstractC2065z2.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String str2 = "Element at index " + (abstractC2065z2.size() - size4) + " is null.";
                for (int size5 = abstractC2065z2.size() - 1; size5 >= size4; size5--) {
                    abstractC2065z2.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            abstractC2065z2.add(next);
        }
    }

    public static void w(C2114i c2114i, boolean z10) {
        c2114i.hasImageDescription_ = z10;
    }

    public static C2114i x() {
        return DEFAULT_INSTANCE;
    }

    public static C2113h y() {
        return (C2113h) ((AbstractC2061v) DEFAULT_INSTANCE.d(5));
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
                return new a0(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C2114i.class, "identity_", "hasAction_", "hasImageDescription_"});
            case 3:
                return new C2114i();
            case 4:
                return new AbstractC2061v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                X x10 = PARSER;
                X x11 = x10;
                if (x10 == null) {
                    synchronized (C2114i.class) {
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
}
