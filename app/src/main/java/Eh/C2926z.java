package eh;

import bh.AbstractC2223m;
import bh.C2224n;
import dh.C2681G;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: eh.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2926z implements SerialDescriptor {

    /* renamed from: b  reason: collision with root package name */
    public static final C2926z f29479b = new C2926z();

    /* renamed from: c  reason: collision with root package name */
    public static final String f29480c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2681G f29481a = A7.b.G(u0.f28491a, C2914n.f29467a).f28396d;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return f29480c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        this.f29481a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        return this.f29481a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        this.f29481a.getClass();
        return C2224n.f26017c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f29481a.f28429d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        this.f29481a.getClass();
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f29481a.getClass();
        return kf.v.f37483Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        this.f29481a.h(i10);
        return kf.v.f37483Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        return this.f29481a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f29481a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        this.f29481a.j(i10);
        return false;
    }
}
