package Sh;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final K f16709a = new Object();

    public final byte[] a(InputStream inputStream) {
        int read;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[1024];
        int i10 = 0;
        do {
            read = inputStream.read(bArr, i10, 1024 - i10);
            int max = Math.max(read, 0) + i10;
            if (max == 1024) {
                arrayList.add(bArr);
                bArr = new byte[1024];
                i10 = 0;
            } else {
                i10 = max;
            }
        } while (read != -1);
        byte[] bArr2 = new byte[(arrayList.size() * 1024) + i10];
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            System.arraycopy((byte[]) it.next(), 0, bArr2, i11 * 1024, 1024);
            i11++;
        }
        System.arraycopy(bArr, 0, bArr2, i11 * 1024, i10);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        return true;
    }

    public final int hashCode() {
        return (K.class.hashCode() * 31) + 1024;
    }
}
