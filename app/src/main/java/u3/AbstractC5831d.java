package u3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.play_billing.N;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import k6.AbstractC4194d;
import r.ExecutorC5333a;

/* renamed from: u3.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5831d {

    /* renamed from: a  reason: collision with root package name */
    public static final P5.c f46361a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f46362b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f46363c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f46364d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f46365e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f46366f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f46367g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f46368h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f46369i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f46370j = {48, 48, 50, 0};

    public static byte[] a(C5829b[] c5829bArr, byte[] bArr) {
        int i10 = 0;
        for (C5829b c5829b : c5829bArr) {
            i10 += ((((c5829b.f46358g * 2) + 7) & (-8)) / 8) + (c5829b.f46356e * 2) + b(c5829b.f46352a, c5829b.f46353b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c5829b.f46357f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f46366f)) {
            for (C5829b c5829b2 : c5829bArr) {
                l(byteArrayOutputStream, c5829b2, b(c5829b2.f46352a, c5829b2.f46353b, bArr));
                n(byteArrayOutputStream, c5829b2);
                int[] iArr = c5829b2.f46359h;
                int length = iArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = iArr[i11];
                    Gi.e.X(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                m(byteArrayOutputStream, c5829b2);
            }
        } else {
            for (C5829b c5829b3 : c5829bArr) {
                l(byteArrayOutputStream, c5829b3, b(c5829b3.f46352a, c5829b3.f46353b, bArr));
            }
            for (C5829b c5829b4 : c5829bArr) {
                n(byteArrayOutputStream, c5829b4);
                int[] iArr2 = c5829b4.f46359h;
                int length2 = iArr2.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length2) {
                    int i16 = iArr2[i14];
                    Gi.e.X(byteArrayOutputStream, i16 - i15);
                    i14++;
                    i15 = i16;
                }
                m(byteArrayOutputStream, c5829b4);
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static String b(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f46368h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f46367g;
        String str3 = "!";
        if (equals || Arrays.equals(bArr, bArr3)) {
            obj = ":";
        } else {
            obj = str3;
        }
        if (str.length() <= 0) {
            if (str3.equals(obj)) {
                return str2.replace(":", str3);
            }
            if (":".equals(obj)) {
                return str2.replace(str3, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains(str3) && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder p10 = android.gov.nist.core.a.p(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                return R.a.t(p10, str3, str2);
            } else if (str3.equals(obj)) {
                return str2.replace(":", str3);
            } else {
                if (":".equals(obj)) {
                    return str2.replace(str3, ":");
                }
                return str2;
            }
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw new IllegalStateException(android.gov.nist.core.a.e("Unexpected flag: ", i10));
            }
            return i11;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static void d(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(r.f.p(new FileOutputStream(file2), file2));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static int[] e(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) Gi.e.O(byteArrayInputStream, 2);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static C5829b[] f(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C5829b[] c5829bArr) {
        byte[] bArr3 = f46369i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f46364d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int O10 = (int) Gi.e.O(fileInputStream, 1);
                    byte[] M10 = Gi.e.M(fileInputStream, (int) Gi.e.O(fileInputStream, 4), (int) Gi.e.O(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M10);
                        try {
                            C5829b[] g10 = g(byteArrayInputStream, O10, c5829bArr);
                            byteArrayInputStream.close();
                            return g10;
                        } catch (Throwable th2) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, f46370j)) {
            int O11 = (int) Gi.e.O(fileInputStream, 2);
            byte[] M11 = Gi.e.M(fileInputStream, (int) Gi.e.O(fileInputStream, 4), (int) Gi.e.O(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(M11);
                try {
                    C5829b[] h10 = h(byteArrayInputStream2, bArr2, O11, c5829bArr);
                    byteArrayInputStream2.close();
                    return h10;
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static C5829b[] g(ByteArrayInputStream byteArrayInputStream, int i10, C5829b[] c5829bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C5829b[0];
        }
        if (i10 == c5829bArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = (int) Gi.e.O(byteArrayInputStream, 2);
                strArr[i11] = new String(Gi.e.L(byteArrayInputStream, (int) Gi.e.O(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                C5829b c5829b = c5829bArr[i12];
                if (c5829b.f46353b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    c5829b.f46356e = i13;
                    c5829b.f46359h = e(byteArrayInputStream, i13);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c5829bArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C5829b[] h(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, C5829b[] c5829bArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C5829b[0];
        }
        if (i10 == c5829bArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                Gi.e.O(byteArrayInputStream, 2);
                String str2 = new String(Gi.e.L(byteArrayInputStream, (int) Gi.e.O(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long O10 = Gi.e.O(byteArrayInputStream, 4);
                int O11 = (int) Gi.e.O(byteArrayInputStream, 2);
                C5829b c5829b = null;
                if (c5829bArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= c5829bArr.length) {
                            break;
                        } else if (c5829bArr[i12].f46353b.equals(str)) {
                            c5829b = c5829bArr[i12];
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (c5829b != null) {
                    c5829b.f46355d = O10;
                    int[] e10 = e(byteArrayInputStream, O11);
                    if (Arrays.equals(bArr, f46368h)) {
                        c5829b.f46356e = O11;
                        c5829b.f46359h = e10;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return c5829bArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C5829b[] i(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f46365e)) {
            int O10 = (int) Gi.e.O(fileInputStream, 1);
            byte[] M10 = Gi.e.M(fileInputStream, (int) Gi.e.O(fileInputStream, 4), (int) Gi.e.O(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(M10);
                try {
                    C5829b[] j6 = j(byteArrayInputStream, str, O10);
                    byteArrayInputStream.close();
                    return j6;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static C5829b[] j(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        TreeMap treeMap;
        int i11;
        if (byteArrayInputStream.available() == 0) {
            return new C5829b[0];
        }
        C5829b[] c5829bArr = new C5829b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int O10 = (int) Gi.e.O(byteArrayInputStream, 2);
            c5829bArr[i12] = new C5829b(str, new String(Gi.e.L(byteArrayInputStream, (int) Gi.e.O(byteArrayInputStream, 2)), StandardCharsets.UTF_8), Gi.e.O(byteArrayInputStream, 4), O10, (int) Gi.e.O(byteArrayInputStream, 4), (int) Gi.e.O(byteArrayInputStream, 4), new int[O10], new TreeMap());
        }
        for (int i13 = 0; i13 < i10; i13++) {
            C5829b c5829b = c5829bArr[i13];
            int available = byteArrayInputStream.available() - c5829b.f46357f;
            int i14 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c5829b.f46360i;
                if (available2 <= available) {
                    break;
                }
                i14 += (int) Gi.e.O(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i14), 1);
                for (int O11 = (int) Gi.e.O(byteArrayInputStream, 2); O11 > 0; O11--) {
                    Gi.e.O(byteArrayInputStream, 2);
                    int O12 = (int) Gi.e.O(byteArrayInputStream, 1);
                    if (O12 != 6 && O12 != 7) {
                        while (O12 > 0) {
                            Gi.e.O(byteArrayInputStream, 1);
                            for (int O13 = (int) Gi.e.O(byteArrayInputStream, 1); O13 > 0; O13--) {
                                Gi.e.O(byteArrayInputStream, 2);
                            }
                            O12--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                c5829b.f46359h = e(byteArrayInputStream, c5829b.f46356e);
                int i15 = c5829b.f46358g;
                BitSet valueOf = BitSet.valueOf(Gi.e.L(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
                for (int i16 = 0; i16 < i15; i16++) {
                    if (valueOf.get(c(2, i16, i15))) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (valueOf.get(c(4, i16, i15))) {
                        i11 |= 4;
                    }
                    if (i11 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i16), Integer.valueOf(i11 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c5829bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean k(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C5829b[] c5829bArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f46364d;
        int i10 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                Gi.e.X(byteArrayOutputStream2, c5829bArr.length);
                int i11 = 2;
                int i12 = 2;
                for (C5829b c5829b : c5829bArr) {
                    Gi.e.W(byteArrayOutputStream2, c5829b.f46354c, 4);
                    Gi.e.W(byteArrayOutputStream2, c5829b.f46355d, 4);
                    Gi.e.W(byteArrayOutputStream2, c5829b.f46358g, 4);
                    String b10 = b(c5829b.f46352a, c5829b.f46353b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = b10.getBytes(charset).length;
                    Gi.e.X(byteArrayOutputStream2, length2);
                    i12 = i12 + 14 + length2;
                    byteArrayOutputStream2.write(b10.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i12 == byteArray.length) {
                    C5837j c5837j = new C5837j(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(c5837j);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < c5829bArr.length) {
                        try {
                            C5829b c5829b2 = c5829bArr[i13];
                            Gi.e.X(byteArrayOutputStream3, i13);
                            Gi.e.X(byteArrayOutputStream3, c5829b2.f46356e);
                            i14 = i14 + 4 + (c5829b2.f46356e * 2);
                            int[] iArr = c5829b2.f46359h;
                            int length3 = iArr.length;
                            int i15 = i10;
                            while (i10 < length3) {
                                int i16 = iArr[i10];
                                Gi.e.X(byteArrayOutputStream3, i16 - i15);
                                i10++;
                                i15 = i16;
                            }
                            i13++;
                            i10 = 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i14 == byteArray2.length) {
                        C5837j c5837j2 = new C5837j(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(c5837j2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < c5829bArr.length) {
                            try {
                                C5829b c5829b3 = c5829bArr[i17];
                                int i19 = 0;
                                for (Map.Entry entry : c5829b3.f46360i.entrySet()) {
                                    i19 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream4, c5829b3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream5, c5829b3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                Gi.e.X(byteArrayOutputStream3, i17);
                                int length4 = byteArray3.length + i11 + byteArray4.length;
                                int i20 = i18 + 6;
                                ArrayList arrayList4 = arrayList3;
                                Gi.e.W(byteArrayOutputStream3, length4, 4);
                                Gi.e.X(byteArrayOutputStream3, i19);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i18 = i20 + length4;
                                i17++;
                                arrayList3 = arrayList4;
                                i11 = 2;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i18 == byteArray5.length) {
                            C5837j c5837j3 = new C5837j(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(c5837j3);
                            long j6 = 4;
                            long size = j6 + j6 + 4 + (arrayList2.size() * 16);
                            int i21 = 4;
                            Gi.e.W(byteArrayOutputStream, arrayList2.size(), 4);
                            int i22 = 0;
                            while (i22 < arrayList2.size()) {
                                C5837j c5837j4 = (C5837j) arrayList2.get(i22);
                                Gi.e.W(byteArrayOutputStream, AbstractC4194d.o(c5837j4.f46378a), i21);
                                Gi.e.W(byteArrayOutputStream, size, i21);
                                boolean z10 = c5837j4.f46380c;
                                byte[] bArr3 = c5837j4.f46379b;
                                if (z10) {
                                    byte[] r10 = Gi.e.r(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(r10);
                                    Gi.e.W(byteArrayOutputStream, r10.length, 4);
                                    Gi.e.W(byteArrayOutputStream, bArr3.length, 4);
                                    length = r10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    Gi.e.W(byteArrayOutputStream, bArr3.length, 4);
                                    Gi.e.W(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i22++;
                                arrayList5 = arrayList;
                                i21 = 4;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] bArr4 = f46365e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a5 = a(c5829bArr, bArr4);
            Gi.e.W(byteArrayOutputStream, c5829bArr.length, 1);
            Gi.e.W(byteArrayOutputStream, a5.length, 4);
            byte[] r11 = Gi.e.r(a5);
            Gi.e.W(byteArrayOutputStream, r11.length, 4);
            byteArrayOutputStream.write(r11);
            return true;
        }
        byte[] bArr5 = f46367g;
        if (Arrays.equals(bArr, bArr5)) {
            Gi.e.W(byteArrayOutputStream, c5829bArr.length, 1);
            for (C5829b c5829b4 : c5829bArr) {
                String b11 = b(c5829b4.f46352a, c5829b4.f46353b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                Gi.e.X(byteArrayOutputStream, b11.getBytes(charset2).length);
                Gi.e.X(byteArrayOutputStream, c5829b4.f46359h.length);
                Gi.e.W(byteArrayOutputStream, c5829b4.f46360i.size() * 4, 4);
                Gi.e.W(byteArrayOutputStream, c5829b4.f46354c, 4);
                byteArrayOutputStream.write(b11.getBytes(charset2));
                for (Integer num : c5829b4.f46360i.keySet()) {
                    Gi.e.X(byteArrayOutputStream, num.intValue());
                    Gi.e.X(byteArrayOutputStream, 0);
                }
                for (int i24 : c5829b4.f46359h) {
                    Gi.e.X(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        byte[] bArr6 = f46366f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a10 = a(c5829bArr, bArr6);
            Gi.e.W(byteArrayOutputStream, c5829bArr.length, 1);
            Gi.e.W(byteArrayOutputStream, a10.length, 4);
            byte[] r12 = Gi.e.r(a10);
            Gi.e.W(byteArrayOutputStream, r12.length, 4);
            byteArrayOutputStream.write(r12);
            return true;
        }
        byte[] bArr7 = f46368h;
        if (Arrays.equals(bArr, bArr7)) {
            Gi.e.X(byteArrayOutputStream, c5829bArr.length);
            for (C5829b c5829b5 : c5829bArr) {
                String b12 = b(c5829b5.f46352a, c5829b5.f46353b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                Gi.e.X(byteArrayOutputStream, b12.getBytes(charset3).length);
                TreeMap treeMap = c5829b5.f46360i;
                Gi.e.X(byteArrayOutputStream, treeMap.size());
                Gi.e.X(byteArrayOutputStream, c5829b5.f46359h.length);
                Gi.e.W(byteArrayOutputStream, c5829b5.f46354c, 4);
                byteArrayOutputStream.write(b12.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    Gi.e.X(byteArrayOutputStream, num2.intValue());
                }
                for (int i25 : c5829b5.f46359h) {
                    Gi.e.X(byteArrayOutputStream, i25);
                }
            }
            return true;
        }
        return false;
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, C5829b c5829b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        Gi.e.X(byteArrayOutputStream, str.getBytes(charset).length);
        Gi.e.X(byteArrayOutputStream, c5829b.f46356e);
        Gi.e.W(byteArrayOutputStream, c5829b.f46357f, 4);
        Gi.e.W(byteArrayOutputStream, c5829b.f46354c, 4);
        Gi.e.W(byteArrayOutputStream, c5829b.f46358g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, C5829b c5829b) {
        byte[] bArr = new byte[(((c5829b.f46358g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c5829b.f46360i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = intValue2 & 2;
            int i11 = c5829b.f46358g;
            if (i10 != 0) {
                int c10 = c(2, intValue, i11);
                int i12 = c10 / 8;
                bArr[i12] = (byte) ((1 << (c10 % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int c11 = c(4, intValue, i11);
                int i13 = c11 / 8;
                bArr[i13] = (byte) ((1 << (c11 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, C5829b c5829b) {
        int i10 = 0;
        for (Map.Entry entry : c5829b.f46360i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Gi.e.X(byteArrayOutputStream, intValue - i10);
                Gi.e.X(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ca, code lost:
        if (r5 == null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Type inference failed for: r14v0, types: [u3.b[], byte[]] */
    /* JADX WARN: Type inference failed for: r6v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(Context context, ExecutorC5333a executorC5333a, AbstractC5830c abstractC5830c, boolean z10) {
        boolean z11;
        char c10;
        C5829b[] c5829bArr;
        int i10;
        IOException iOException;
        C5829b[] c5829bArr2;
        C5828a c5828a;
        C5829b[] c5829bArr3;
        byte[] bArr;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? byteArrayOutputStream;
        FileInputStream a5;
        boolean z15;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(N.t(new FileInputStream(file), file));
                        long readLong = dataInputStream.readLong();
                        dataInputStream.close();
                        if (readLong == packageInfo.lastUpdateTime) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            abstractC5830c.h(2, null);
                        }
                        if (z15) {
                            Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                            AbstractC5836i.c(context, false);
                            return;
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i11 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C5828a c5828a2 = new C5828a(assets, executorC5333a, abstractC5830c, name, file2);
            byte[] bArr2 = c5828a2.f46346c;
            if (bArr2 == null) {
                c5828a2.b(3, Integer.valueOf(i11));
            } else {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c5828a2.b(4, null);
                    }
                } else {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        c5828a2.b(4, null);
                    }
                }
                c5828a2.f46349f = true;
                byte[] bArr3 = f46362b;
                try {
                    try {
                        c10 = c5828a2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        abstractC5830c.h(6, e10);
                        c10 = null;
                        if (c10 != null) {
                        }
                        c5829bArr2 = c5828a2.f46350g;
                        if (c5829bArr2 != null) {
                        }
                        c5828a = c5828a2;
                        AbstractC5830c abstractC5830c2 = c5828a.f46345b;
                        c5829bArr3 = c5828a.f46350g;
                        boolean z16 = c10;
                        if (c5829bArr3 != null) {
                        }
                        bArr = c5828a.f46351h;
                        if (bArr == null) {
                        }
                        if (z13) {
                        }
                        if (z13) {
                        }
                        z11 = false;
                        AbstractC5836i.c(context, z11);
                    } catch (IOException e11) {
                        abstractC5830c.h(7, e11);
                        c10 = null;
                        if (c10 != null) {
                        }
                        c5829bArr2 = c5828a2.f46350g;
                        if (c5829bArr2 != null) {
                        }
                        c5828a = c5828a2;
                        AbstractC5830c abstractC5830c22 = c5828a.f46345b;
                        c5829bArr3 = c5828a.f46350g;
                        boolean z162 = c10;
                        if (c5829bArr3 != null) {
                        }
                        bArr = c5828a.f46351h;
                        if (bArr == null) {
                        }
                        if (z13) {
                        }
                        if (z13) {
                        }
                        z11 = false;
                        AbstractC5836i.c(context, z11);
                    }
                    if (c10 != null) {
                        try {
                        } catch (IOException e12) {
                            i10 = 7;
                            abstractC5830c.h(7, e12);
                            try {
                                c10.close();
                            } catch (IOException e13) {
                                iOException = e13;
                                abstractC5830c.h(i10, iOException);
                                c5829bArr = null;
                                c10 = c10;
                                c5828a2.f46350g = c5829bArr;
                                c5829bArr2 = c5828a2.f46350g;
                                if (c5829bArr2 != null) {
                                }
                                c5828a = c5828a2;
                                AbstractC5830c abstractC5830c222 = c5828a.f46345b;
                                c5829bArr3 = c5828a.f46350g;
                                boolean z1622 = c10;
                                if (c5829bArr3 != null) {
                                }
                                bArr = c5828a.f46351h;
                                if (bArr == null) {
                                }
                                if (z13) {
                                }
                                if (z13) {
                                    z11 = z12 ? 1 : 0;
                                    AbstractC5836i.c(context, z11);
                                }
                                z11 = false;
                                AbstractC5836i.c(context, z11);
                            }
                            c5829bArr = null;
                            c10 = c10;
                            c5828a2.f46350g = c5829bArr;
                            c5829bArr2 = c5828a2.f46350g;
                            if (c5829bArr2 != null) {
                            }
                            c5828a = c5828a2;
                            AbstractC5830c abstractC5830c2222 = c5828a.f46345b;
                            c5829bArr3 = c5828a.f46350g;
                            boolean z16222 = c10;
                            if (c5829bArr3 != null) {
                            }
                            bArr = c5828a.f46351h;
                            if (bArr == null) {
                            }
                            if (z13) {
                            }
                            if (z13) {
                            }
                            z11 = false;
                            AbstractC5836i.c(context, z11);
                        } catch (IllegalStateException e14) {
                            try {
                                abstractC5830c.h(8, e14);
                                try {
                                    c10.close();
                                } catch (IOException e15) {
                                    iOException = e15;
                                    i10 = 7;
                                    abstractC5830c.h(i10, iOException);
                                    c5829bArr = null;
                                    c10 = c10;
                                    c5828a2.f46350g = c5829bArr;
                                    c5829bArr2 = c5828a2.f46350g;
                                    if (c5829bArr2 != null) {
                                    }
                                    c5828a = c5828a2;
                                    AbstractC5830c abstractC5830c22222 = c5828a.f46345b;
                                    c5829bArr3 = c5828a.f46350g;
                                    boolean z162222 = c10;
                                    if (c5829bArr3 != null) {
                                    }
                                    bArr = c5828a.f46351h;
                                    if (bArr == null) {
                                    }
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    z11 = false;
                                    AbstractC5836i.c(context, z11);
                                }
                                c5829bArr = null;
                                c10 = c10;
                                c5828a2.f46350g = c5829bArr;
                                c5829bArr2 = c5828a2.f46350g;
                                if (c5829bArr2 != null) {
                                }
                                c5828a = c5828a2;
                                AbstractC5830c abstractC5830c222222 = c5828a.f46345b;
                                c5829bArr3 = c5828a.f46350g;
                                boolean z1622222 = c10;
                                if (c5829bArr3 != null) {
                                }
                                bArr = c5828a.f46351h;
                                if (bArr == null) {
                                }
                                if (z13) {
                                }
                                if (z13) {
                                }
                                z11 = false;
                                AbstractC5836i.c(context, z11);
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                try {
                                    c10.close();
                                } catch (IOException e16) {
                                    abstractC5830c.h(7, e16);
                                }
                                throw th3;
                            }
                        }
                        if (Arrays.equals(bArr3, Gi.e.L(c10, 4))) {
                            c5829bArr = i(c10, Gi.e.L(c10, 4), c5828a2.f46348e);
                            try {
                                c10.close();
                                c10 = c10;
                            } catch (IOException e17) {
                                IOException iOException2 = e17;
                                abstractC5830c.h(7, iOException2);
                                c10 = iOException2;
                            }
                            c5828a2.f46350g = c5829bArr;
                        } else {
                            throw new IllegalStateException("Invalid magic");
                        }
                    }
                    c5829bArr2 = c5828a2.f46350g;
                    if (c5829bArr2 != null) {
                        int i12 = Build.VERSION.SDK_INT;
                        c10 = 24;
                        char c11 = 24;
                        c10 = 24;
                        if (i12 >= 24 && i12 <= 34) {
                            if (i12 != 24) {
                                c11 = 25;
                                c11 = 25;
                                c10 = 25;
                                if (i12 != 25) {
                                    switch (i12) {
                                    }
                                }
                            }
                            try {
                                a5 = c5828a2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e18) {
                                abstractC5830c.h(9, e18);
                            } catch (IOException e19) {
                                abstractC5830c.h(7, e19);
                            } catch (IllegalStateException e20) {
                                c5828a2.f46350g = null;
                                abstractC5830c.h(8, e20);
                            }
                            if (a5 != null) {
                                try {
                                    boolean equals = Arrays.equals(f46363c, Gi.e.L(a5, 4));
                                    if (equals) {
                                        c5828a2.f46350g = f(a5, Gi.e.L(a5, 4), bArr2, c5829bArr2);
                                        a5.close();
                                        c5828a = c5828a2;
                                        c10 = equals;
                                    } else {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                } finally {
                                    try {
                                        a5.close();
                                    } catch (Throwable th4) {
                                        th.addSuppressed(th4);
                                    }
                                }
                            } else {
                                if (a5 != null) {
                                    a5.close();
                                }
                                c5828a = null;
                                c10 = c11;
                            }
                        }
                    }
                    c5828a = c5828a2;
                    AbstractC5830c abstractC5830c2222222 = c5828a.f46345b;
                    c5829bArr3 = c5828a.f46350g;
                    boolean z16222222 = c10;
                    if (c5829bArr3 != null) {
                        ?? r62 = c5828a.f46346c;
                        z16222222 = r62;
                        if (r62 != 0) {
                            if (c5828a.f46349f) {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(r62);
                                } catch (IOException e21) {
                                    abstractC5830c2222222.h(7, e21);
                                } catch (IllegalStateException e22) {
                                    abstractC5830c2222222.h(8, e22);
                                }
                                if (!k(byteArrayOutputStream, r62, c5829bArr3)) {
                                    abstractC5830c2222222.h(5, null);
                                    c5828a.f46350g = null;
                                    byteArrayOutputStream.close();
                                    z16222222 = r62;
                                } else {
                                    c5828a.f46351h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    c5828a.f46350g = null;
                                    z16222222 = r62;
                                }
                            } else {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                    }
                    bArr = c5828a.f46351h;
                    if (bArr == null) {
                        z13 = false;
                        z12 = true;
                    } else if (c5828a.f46349f) {
                        try {
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        File file3 = c5828a.f46347d;
                                        io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file3), file3);
                                        try {
                                            try {
                                                byte[] bArr4 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr4);
                                                    if (read > 0) {
                                                        p10.write(bArr4, 0, read);
                                                    } else {
                                                        z12 = true;
                                                        try {
                                                            c5828a.b(1, null);
                                                            p10.close();
                                                            byteArrayInputStream.close();
                                                            c5828a.f46351h = null;
                                                            c5828a.f46350g = null;
                                                            z13 = true;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            Throwable th6 = th;
                                                            p10.close();
                                                            throw th6;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    z16222222 = true;
                                    c5828a.b(6, e);
                                    z14 = z16222222;
                                    z13 = false;
                                    z12 = z14;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    z11 = false;
                                    AbstractC5836i.c(context, z11);
                                } catch (IOException e24) {
                                    e = e24;
                                    z16222222 = true;
                                    c5828a.b(7, e);
                                    z14 = z16222222;
                                    z13 = false;
                                    z12 = z14;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    z11 = false;
                                    AbstractC5836i.c(context, z11);
                                }
                            } finally {
                                c5828a.f46351h = null;
                                c5828a.f46350g = null;
                            }
                        } catch (FileNotFoundException e25) {
                            e = e25;
                            c5828a.b(6, e);
                            z14 = z16222222;
                            z13 = false;
                            z12 = z14;
                            if (z13) {
                            }
                            if (z13) {
                            }
                            z11 = false;
                            AbstractC5836i.c(context, z11);
                        } catch (IOException e26) {
                            e = e26;
                            c5828a.b(7, e);
                            z14 = z16222222;
                            z13 = false;
                            z12 = z14;
                            if (z13) {
                            }
                            if (z13) {
                            }
                            z11 = false;
                            AbstractC5836i.c(context, z11);
                        }
                    } else {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    if (z13) {
                        d(packageInfo, filesDir);
                    }
                    if (z13 && z10) {
                        z11 = z12 ? 1 : 0;
                        AbstractC5836i.c(context, z11);
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            }
            z11 = false;
            AbstractC5836i.c(context, z11);
        } catch (PackageManager.NameNotFoundException e27) {
            abstractC5830c.h(7, e27);
            AbstractC5836i.c(context, false);
        }
    }
}
