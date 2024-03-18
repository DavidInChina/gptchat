package q2;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Arrays;
import s2.AbstractC5530A;

/* renamed from: q2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5262b {

    /* renamed from: e  reason: collision with root package name */
    public static final C5262b f43661e = new C5262b(-1, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f43662a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43663b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43664c;

    /* renamed from: d  reason: collision with root package name */
    public final int f43665d;

    public C5262b(int i10, int i11, int i12) {
        int i13;
        this.f43662a = i10;
        this.f43663b = i11;
        this.f43664c = i12;
        if (AbstractC5530A.z(i12)) {
            i13 = AbstractC5530A.u(i12, i11);
        } else {
            i13 = -1;
        }
        this.f43665d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5262b)) {
            return false;
        }
        C5262b c5262b = (C5262b) obj;
        if (this.f43662a == c5262b.f43662a && this.f43663b == c5262b.f43663b && this.f43664c == c5262b.f43664c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f43662a), Integer.valueOf(this.f43663b), Integer.valueOf(this.f43664c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f43662a);
        sb2.append(", channelCount=");
        sb2.append(this.f43663b);
        sb2.append(", encoding=");
        return AbstractC2469q0.j(sb2, this.f43664c, ']');
    }
}
