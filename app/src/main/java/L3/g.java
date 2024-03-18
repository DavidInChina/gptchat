package L3;

import io.sentry.android.core.AbstractC3612c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final String f10713b = s.f("Data");

    /* renamed from: c  reason: collision with root package name */
    public static final g f10714c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10715a;

    static {
        g gVar = new g(new HashMap());
        b(gVar);
        f10714c = gVar;
    }

    public g(g gVar) {
        this.f10715a = new HashMap(gVar.f10715a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:30:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(byte[] bArr) {
        Throwable e10;
        ObjectInputStream objectInputStream;
        Throwable th2;
        String str = f10713b;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e11) {
                    AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e11);
                }
                try {
                    for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                        hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e12) {
                        AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e12);
                    }
                    byteArrayInputStream.close();
                } catch (IOException e13) {
                    e10 = e13;
                    AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e14) {
                            AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e14);
                        }
                    }
                    byteArrayInputStream.close();
                    return new g(hashMap);
                } catch (ClassNotFoundException e15) {
                    e10 = e15;
                    AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                    return new g(hashMap);
                }
            } catch (IOException e16) {
                e = e16;
                Throwable th4 = e;
                objectInputStream = null;
                e10 = th4;
                AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new g(hashMap);
            } catch (ClassNotFoundException e17) {
                e = e17;
                Throwable th42 = e;
                objectInputStream = null;
                e10 = th42;
                AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new g(hashMap);
            } catch (Throwable th5) {
                th2 = th5;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e18) {
                        AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e18);
                    }
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException e19) {
                    AbstractC3612c.d(str, "Error in Data#fromByteArray: ", e19);
                }
                throw th2;
            }
            return new g(hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] b(g gVar) {
        Throwable th2;
        IOException e10;
        ObjectOutputStream objectOutputStream;
        String str = f10713b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (IOException e11) {
            e10 = e11;
        }
        try {
            objectOutputStream.writeInt(gVar.f10715a.size());
            for (Map.Entry entry : gVar.f10715a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e12) {
                AbstractC3612c.d(str, "Error in Data#toByteArray: ", e12);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                AbstractC3612c.d(str, "Error in Data#toByteArray: ", e13);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e14) {
            e10 = e14;
            objectOutputStream2 = objectOutputStream;
            AbstractC3612c.d(str, "Error in Data#toByteArray: ", e10);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e15) {
                    AbstractC3612c.d(str, "Error in Data#toByteArray: ", e15);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e16) {
                AbstractC3612c.d(str, "Error in Data#toByteArray: ", e16);
            }
            return byteArray;
        } catch (Throwable th4) {
            th2 = th4;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e17) {
                    AbstractC3612c.d(str, "Error in Data#toByteArray: ", e17);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e18) {
                AbstractC3612c.d(str, "Error in Data#toByteArray: ", e18);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.f10715a;
        Set<String> keySet = hashMap.keySet();
        HashMap hashMap2 = ((g) obj).f10715a;
        if (!keySet.equals(hashMap2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = hashMap.get(str);
            Object obj3 = hashMap2.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                } else {
                    z10 = obj2.equals(obj3);
                }
                if (!z10) {
                    return false;
                }
            } else if (obj2 != obj3) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f10715a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        HashMap hashMap = this.f10715a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public g(Map map) {
        this.f10715a = new HashMap(map);
    }
}
