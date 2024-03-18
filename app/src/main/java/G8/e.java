package G8;

import E8.f;
import E8.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements E8.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6084a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f6085b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f6086c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f6087d;

    /* renamed from: e  reason: collision with root package name */
    public final E8.d f6088e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6089f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f6085b = new JsonWriter(bufferedWriter);
        this.f6086c = hashMap;
        this.f6087d = hashMap2;
        this.f6088e = aVar;
        this.f6089f = z10;
    }

    @Override // E8.e
    public final E8.e a(E8.c cVar, Object obj) {
        f(cVar.f4546a, obj);
        return this;
    }

    @Override // E8.e
    public final E8.e b(E8.c cVar, long j6) {
        String str = cVar.f4546a;
        g();
        JsonWriter jsonWriter = this.f6085b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j6);
        return this;
    }

    @Override // E8.g
    public final g c(String str) {
        g();
        this.f6085b.value(str);
        return this;
    }

    @Override // E8.g
    public final g d(boolean z10) {
        g();
        this.f6085b.value(z10);
        return this;
    }

    public final e e(Object obj) {
        int i10 = 0;
        JsonWriter jsonWriter = this.f6085b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                g();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i10 < length) {
                    jsonWriter.value(iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    long j6 = jArr[i10];
                    g();
                    jsonWriter.value(j6);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    jsonWriter.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    jsonWriter.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i10 < length5) {
                    e(numberArr[i10]);
                    i10++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i10 < length6) {
                    e(objArr[i10]);
                    i10++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                e(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    f((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            E8.d dVar = (E8.d) this.f6086c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f6087d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                g();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.f6088e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
        }
    }

    public final e f(String str, Object obj) {
        boolean z10 = this.f6089f;
        JsonWriter jsonWriter = this.f6085b;
        if (z10) {
            if (obj != null) {
                g();
                jsonWriter.name(str);
                e(obj);
            }
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            e(obj);
        }
        return this;
    }

    public final void g() {
        if (this.f6084a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
