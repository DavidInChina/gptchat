package v;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: v.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5935d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f46835a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f46836b;

    public C5935d(byte[] bArr, List list) {
        this.f46835a = bArr;
        this.f46836b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f46836b.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public static C5935d a(String str, List list) {
        Collections.sort(list, new C5934c(0));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new C5935d(byteArrayOutputStream.toByteArray(), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5935d.class == obj.getClass()) {
            return Arrays.equals(this.f46835a, ((C5935d) obj).f46835a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46835a);
    }
}
