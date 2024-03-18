package H8;

import U3.l;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import h7.EnumC3329c;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import m.C4528h;

/* loaded from: classes.dex */
public final class f implements E8.e {

    /* renamed from: g  reason: collision with root package name */
    public static final E8.c f7484g;

    /* renamed from: h  reason: collision with root package name */
    public static final E8.c f7485h;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f7487a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f7488b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f7489c;

    /* renamed from: d  reason: collision with root package name */
    public final E8.d f7490d;

    /* renamed from: e  reason: collision with root package name */
    public final h f7491e = new h(this);

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f7483f = Charset.forName("UTF-8");

    /* renamed from: i  reason: collision with root package name */
    public static final G8.a f7486i = new G8.a(1);

    static {
        l a5 = E8.c.a(SubscriberAttributeKt.JSON_NAME_KEY);
        C4528h j6 = C4528h.j();
        j6.f38769Y = 1;
        a5.q(j6.i());
        f7484g = a5.f();
        l a10 = E8.c.a("value");
        C4528h j10 = C4528h.j();
        j10.f38769Y = 2;
        a10.q(j10.i());
        f7485h = a10.f();
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, E8.d dVar) {
        this.f7487a = byteArrayOutputStream;
        this.f7488b = map;
        this.f7489c = map2;
        this.f7490d = dVar;
    }

    public static int g(E8.c cVar) {
        e eVar = (e) ((Annotation) cVar.f4547b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f7478a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // E8.e
    public final E8.e a(E8.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    @Override // E8.e
    public final E8.e b(E8.c cVar, long j6) {
        d(cVar, j6, true);
        return this;
    }

    public final void c(E8.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f4547b.get(e.class));
        if (eVar != null) {
            a aVar = (a) eVar;
            int ordinal = aVar.f7479b.ordinal();
            int i11 = aVar.f7478a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        h((i11 << 3) | 5);
                        this.f7487a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    return;
                }
                h(i11 << 3);
                h((i10 << 1) ^ (i10 >> 31));
                return;
            }
            h(i11 << 3);
            h(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void d(E8.c cVar, long j6, boolean z10) {
        if (z10 && j6 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f4547b.get(e.class));
        if (eVar != null) {
            a aVar = (a) eVar;
            int ordinal = aVar.f7479b.ordinal();
            int i10 = aVar.f7478a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        h((i10 << 3) | 1);
                        this.f7487a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j6).array());
                        return;
                    }
                    return;
                }
                h(i10 << 3);
                i((j6 >> 63) ^ (j6 << 1));
                return;
            }
            h(i10 << 3);
            i(j6);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void e(E8.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f7483f);
            h(bytes.length);
            this.f7487a.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                e(cVar, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                f(f7486i, cVar, entry, false);
            }
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                h((g(cVar) << 3) | 1);
                this.f7487a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                h((g(cVar) << 3) | 5);
                this.f7487a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
        } else if (obj instanceof Number) {
            d(cVar, ((Number) obj).longValue(), z10);
        } else if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f7487a.write(bArr);
        } else {
            E8.d dVar = (E8.d) this.f7488b.get(obj.getClass());
            if (dVar != null) {
                f(dVar, cVar, obj, z10);
                return;
            }
            E8.f fVar = (E8.f) this.f7489c.get(obj.getClass());
            if (fVar != null) {
                h hVar = this.f7491e;
                hVar.f7493a = false;
                hVar.f7495c = cVar;
                hVar.f7494b = z10;
                fVar.a(obj, hVar);
            } else if (obj instanceof c) {
                c(cVar, ((EnumC3329c) ((c) obj)).f31934Y, true);
            } else if (obj instanceof Enum) {
                c(cVar, ((Enum) obj).ordinal(), true);
            } else {
                f(this.f7490d, cVar, obj, z10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, H8.b] */
    public final void f(E8.d dVar, E8.c cVar, Object obj, boolean z10) {
        ?? outputStream = new OutputStream();
        outputStream.f7480Y = 0L;
        try {
            OutputStream outputStream2 = this.f7487a;
            this.f7487a = outputStream;
            dVar.a(obj, this);
            this.f7487a = outputStream2;
            long j6 = outputStream.f7480Y;
            outputStream.close();
            if (z10 && j6 == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            i(j6);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f7487a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f7487a.write(i10 & 127);
    }

    public final void i(long j6) {
        while (((-128) & j6) != 0) {
            this.f7487a.write((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        this.f7487a.write(((int) j6) & 127);
    }
}
