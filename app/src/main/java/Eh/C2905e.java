package eh;

import bh.AbstractC2223m;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: eh.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2905e implements SerialDescriptor {

    /* renamed from: b  reason: collision with root package name */
    public static final C2905e f29419b = new C2905e();

    /* renamed from: c  reason: collision with root package name */
    public static final String f29420c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f29421a = A7.b.E(C2914n.f29467a).f28439c;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return f29420c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return this.f29421a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        return this.f29421a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2223m e() {
        return this.f29421a.e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f29421a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        return this.f29421a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f29421a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        return this.f29421a.h(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i10) {
        return this.f29421a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f29421a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        return this.f29421a.j(i10);
    }
}
