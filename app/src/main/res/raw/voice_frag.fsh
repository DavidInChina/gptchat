#version 300 es

#define E 2.71828182846
#define pi 3.14159265358979323844

precision highp float;

struct ColoredSDF {
    float distance;
    vec4 color;
};

struct SDFArgs {
    vec2 st;
    float amount;
    float duration;
    float time;
    float mainRadius;
};

float triangle(float t, float p){
    return 2.0 * abs(t / p - floor(t / p + 0.5));
}

float spring(float t, float d) {
    return 1.0 - (exp(-E * 2.0 * t) * cos((1.0 - d) * 115.0 * t));
}

float silkySmooth(float t, float k) {
    return (atan(k * sin((t - 0.5) * pi)) / atan(k)) * 0.5 + 0.5;
}

float scaled(float edge0, float edge1, float x) {
    return clamp((x - edge0) / (edge1 - edge0), 0.0, 1.0);
}

float fixedSpring(float t, float d) {
    float s = mix((1.0 - (exp(-E * 2.0 * t) * cos((1.0 - d) * 115.0 * t))), 1.0, scaled(0.0, 1.0, t));
    return s * (1.0 - t) + t;
}

float random(vec2 st) {
    return fract(sin(dot(st.xy, vec2(12.9898, 78.233))) * 43758.5453123);
}

float random(ivec2 st) {
    return random(vec2(st));
}

float random(float p) {
    return random(vec2(p));
}

float opSmoothUnion(float d1, float d2, float k) {
    if (k <= 0.0) {
        k = 0.000001;
    }
    float h = clamp(0.5 + 0.5 * (d2 - d1) / k, 0.0, 1.0);
    return mix(d2, d1, h) - k * h * (1.0 - h);
}

float opSmoothSubtraction(float d1, float d2, float k) {
    if (k <= 0.0) {
        k = 0.000001;
    }
    float h = clamp(0.5 - 0.5 * (d2 + d1) / k, 0.0, 1.0);
    return mix(d2, -d1, h) + k * h * (1.0 - h);
}

float sdRoundedBox(vec2 p, vec2 b, vec4 r) {
    r.xy = (p.x > 0.0) ? r.xy : r.zw;
    r.x = (p.y > 0.0) ? r.x : r.y;
    vec2 q = abs(p) - b + r.x;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;
}

float sdSegment(vec2 p, vec2 a, vec2 b) {
    vec2 pa = p - a;
    vec2 ba = b - a;
    float h = clamp(dot(pa, ba) / dot(ba, ba), 0.0, 1.0);
    return length(pa - ba * h);
}

float sdArc(vec2 p, vec2 sca, vec2 scb, float ra, float rb) {
    p *= mat2(sca.x, sca.y, -sca.y, sca.x);
    p.x = abs(p.x);
    return (scb.y * p.x > scb.x * p.y) ? length(p - ra * scb) - rb : abs(length(p) - ra) - rb;
}

float arc(vec2 st, float startAngle, float length, float radius, float width) {
    return sdArc(st,
    vec2(sin(startAngle), cos(startAngle)),
    vec2(sin(length), cos(length)),
    radius, width);
}

vec2 rotate(vec2 v, float a) {
    float s = sin(a);
    float c = cos(a);
    mat2 m = mat2(c, s, -s, c);
    return m * v;
}

ColoredSDF applyIdleState(ColoredSDF sdf, SDFArgs args) {
    float connectedLinearAnimation = scaled(0.0, 2.0, args.duration);
    float connectedAnimation = fixedSpring(connectedLinearAnimation, 0.96);
    float circleSize  = mix(pow(scaled(0.0, 3.0, args.time), 2.0) * 0.75 + 0.1, 1.0, connectedAnimation) * 0.33;
    vec2 rotatedCoords = rotate(args.st, -args.time * pi - connectedAnimation * pi * 2.0 - pi * 2.0 * 25.0 * silkySmooth(scaled(0.0, 5.0, args.time), 2.0));

    float strokeWidth = mix(circleSize / 2.0, circleSize, connectedAnimation);
    float connecting = abs(length(args.st) - circleSize) - strokeWidth;

    float connected = length(args.st) - circleSize;
    float idleDist = mix(connecting, connected, connectedAnimation);

    float d = min(sdf.distance, idleDist);
    sdf.distance = mix(sdf.distance, d, args.amount);
    float angle = atan(rotatedCoords.y, rotatedCoords.x);
    float alpha = mix(min(1.0, scaled(-pi, pi, angle)), 1.0, connectedLinearAnimation);

    float spinningCircleDist = length(rotatedCoords - vec2(-mix(circleSize, strokeWidth, connectedAnimation), 0)) - strokeWidth;

    alpha = min(1.0, max(alpha, smoothstep(0.005, 0.0, spinningCircleDist) + connectedAnimation * 4.0));

    sdf.color = mix(sdf.color, vec4(vec3(1.0), alpha), args.amount);
    return sdf;
}

ColoredSDF applyListenState(ColoredSDF sdf, SDFArgs args, float micLevel) {
    float breathingSequence = sin(args.time) * 0.5 + 0.5;
    float entryAnimation = fixedSpring(scaled(0.0, 3.0, args.duration), 0.9);

    float radius = 0.38 + micLevel * 0.05 + breathingSequence * 0.03;
    radius *= 1.0 - (1.0 - entryAnimation) * 0.25;

    float d = length(args.st) - radius;
    sdf.distance = mix(sdf.distance, d, args.amount);

    vec4 newCol = vec4(1.0);
    newCol.a = mix(1.0, 0.4 + micLevel * 0.3, silkySmooth(scaled(0.3, 1.8, args.duration), 2.0));
    sdf.color = mix(sdf.color, newCol, smoothstep(0.0, 1.0, args.amount));

    return sdf;
}

ColoredSDF applyListenIntentlyState(ColoredSDF sdf, SDFArgs args, float micLevel, float touchDownTimestamp, float touchUpTimestamp) {
    float touch = fixedSpring(scaled(0.0, 1.0, args.time - touchDownTimestamp), 0.99) -
    fixedSpring(scaled(0.0, 0.8, args.time - touchUpTimestamp), 1.0);

    float listenIntentlyAnimation = clamp(spring(scaled(0.0, 0.9, args.duration), 1.0), 0.0, 1.0);
    float radius = 0.38 + micLevel * 0.05 + 0.05;

    float ring = 10000.0;

    // Draw ring around circle
    if (touch > 0.0) {
        touch = min(touch, listenIntentlyAnimation);// Don't be faster than entry animation
        float arcWidth = radius * 0.1;
        radius -= touch * arcWidth * 2.3;
        radius = min(radius, mix(radius, args.mainRadius - arcWidth * 2.3 - micLevel * 0.01, touch));

        float startAngle = pi / 2.0 - (args.time - touchDownTimestamp) / 2.0;
        float arcLengthTouch = smoothstep(0.04, 1.0, touch) * pi * (1.0 - ((arcWidth / 3.0) / radius));
        float radiusTouch = radius * fixedSpring(scaled(0.0, 1.0, args.duration), 1.0) * args.amount + micLevel * 0.01;
        radiusTouch += arcWidth * 1.3 * mix(-1.0, 1.0, smoothstep(0.0, 0.12, touch));

        float ringRadius = radiusTouch;
        float arcLength = arcLengthTouch;
        ring = arc(args.st, startAngle, arcLength, ringRadius, arcWidth);// Stroke width
    }

    float d = length(args.st) - radius;
    d = min(d, ring);

    sdf.distance = mix(sdf.distance, d, args.amount);

    vec4 newCol = vec4(1.0);
    newCol.a = mix(newCol.a, 1.0 - micLevel * 0.3, listenIntentlyAnimation);// Reduce alpha when mic power goes up
    sdf.color = mix(sdf.color, newCol, smoothstep(0.0, 1.0, args.amount));

    return sdf;
}

ColoredSDF applyListenGraceState(ColoredSDF sdf, SDFArgs args, float micLevel, float graceStartTimestamp, float graceEndTimestamp) {
    // Grace period
    float graceEntryAnimation = silkySmooth(scaled(graceStartTimestamp, graceStartTimestamp + 0.8, args.time), 2.0);
    float graceExitAnimation = silkySmooth(scaled(graceEndTimestamp + 0.5, graceEndTimestamp + 0.5 - 0.3, args.time), 2.0);
    float gracePeriodVisible = max(0., fixedSpring(scaled(graceStartTimestamp, graceStartTimestamp + 0.8, args.time), 0.99) - fixedSpring(scaled(graceEndTimestamp + 0.5, graceEndTimestamp + 0.8, args.time), 1.0));

    float gracePercentAnimation = scaled(graceStartTimestamp, graceEndTimestamp, args.time) * gracePeriodVisible;

    graceEntryAnimation *= args.amount;
    graceExitAnimation *= args.amount;
    gracePercentAnimation *= args.amount;

    float radius = 0.45 + micLevel * 0.01;

    float ring = 10000.0;

    // Draw ring around circle
    float arcWidth = radius * 0.1;

    // Adjust for border
    radius -= args.amount * arcWidth * 2.3;
    radius -= gracePercentAnimation * 0.05;
    // Never go out of bounds
    radius = min(radius, args.mainRadius - arcWidth * 2.3);

    float arcLengthGrace = mix(0.0, 1.0, clamp(gracePercentAnimation * 1.05, 0., 1.0)) * pi * 0.999;// 0.999 solves a glitch

    float radiusGrace = radius * graceExitAnimation * fixedSpring(scaled(0.0, 1.0, args.duration), 1.0) * args.amount + micLevel * 0.01;

    radiusGrace += arcWidth * 1.3 * mix(-1.0, 1.0, smoothstep(0.0, 0.2, gracePercentAnimation));

    float arcLength = max(arcWidth / 8.0, arcLengthGrace);
    float startAngle = -pi / 2.0 - arcLength;
    float ringRadius = radiusGrace;
    ringRadius = mix(ringRadius, 0.25, silkySmooth(scaled(graceEndTimestamp - 0.15, graceEndTimestamp + 0.5, args.time), 2.0));

    ringRadius = mix(mix(1.0, 0.3, smoothstep(graceEndTimestamp - 0.4, graceEndTimestamp, args.time)), ringRadius, args.amount);
    arcWidth = mix(0.0, arcWidth, args.amount);

    ring = arc(args.st, startAngle, arcLength, ringRadius, arcWidth); // Stroke width

    float d = length(args.st) - radius;

    d = opSmoothUnion(d, ring, 0.2 * (1.0 - args.amount));

    sdf.distance = mix(sdf.distance, d, args.amount);

    vec4 newCol = vec4(1.0);
    newCol.a = mix(newCol.a, 1.0, args.amount); // Reduce alpha when mic power goes up

    sdf.color = mix(sdf.color, newCol, smoothstep(0.0, 1.0, args.amount));

    return sdf;
}

ColoredSDF applyThinkState(ColoredSDF sdf, SDFArgs args) {
    float d = 1000.0;// default value for distance field
    int count = 5;// cloud bubbles
    float entryAnimation = spring(scaled(0.0, 1.0, args.duration), 1.0);

    float thinkingDotEntryAnimation = spring(scaled(0.1, 1.1, args.duration), 1.0);
    float thinkingDotRadius = mix(0.2, 0.06, thinkingDotEntryAnimation) * args.amount;

    // move coordinate system to align with optical center
    args.st.x -= thinkingDotRadius * 0.5 * thinkingDotEntryAnimation;

    for (int i = 0; i < count; i++) {
        float f = float(float(i) + 0.5) / float(count);// fraction
        float a = -f * pi * 2.0 + args.time / 3.0;
        float ringRadi = args.mainRadius * 0.45 * entryAnimation;

        // cloud pattern
        ringRadi -= (sin(entryAnimation * pi * 4.0 + a * pi * 2.0 + args.time * 3.0
        - silkySmooth(args.time / 4.0, 2.0) * pi * 1.0) * 0.5 + 0.5) * args.mainRadius * 0.1;

        vec2 pos = vec2(cos(a), sin(a)) * ringRadi;
        float dd = length(args.st - pos) - args.mainRadius * 0.5;

        // last value here is "goo"-level
        d = opSmoothUnion(d, dd, 0.03 * (scaled(0.0, 10.0, args.duration)) + 0.8 * (1.0 - entryAnimation));

        // thinking dot
        float dotAngle = f * pi * 2.0;
        float dotRingRadius = (sin(thinkingDotEntryAnimation * pi * 4.0 + a * pi * 2.0 + args.time * 0.1 * pi * 4.0) * 0.5 + 0.5) * thinkingDotRadius * 0.3;
        vec2 dotPos = vec2(-args.mainRadius, args.mainRadius) * 0.8 * thinkingDotEntryAnimation;
        vec2 dotOffset = vec2(cos(dotAngle + args.time), sin(dotAngle + args.time)) * dotRingRadius;
        float dotD = length(args.st - dotPos - dotOffset) - thinkingDotRadius * 0.8;
        d = opSmoothUnion(d, dotD, (1.0 - min(thinkingDotEntryAnimation, args.amount)) * thinkingDotRadius);
    }
    sdf.distance = mix(sdf.distance, d, args.amount);
    sdf.color = mix(sdf.color, vec4(1.0), args.amount);

    return sdf;
}

ColoredSDF applySpeakState(ColoredSDF sdf, SDFArgs args, vec4 avgMag) {
    float d = 1000.0;
    int barCount = 4;
    for (int i = 0; i < barCount; i++) {
        float f = float(float(i) + 0.5) / float(barCount);// fraction

        // height/width of bar
        float w = (1.0 / float(barCount)) * 0.44;
        float h = w;

        // wave-like motion when starting
        float wave = sin(f * pi * 0.8 + args.time) * 0.5 + 0.5;
        float entryAnimation = spring(scaled(0.1 + wave * 0.4, 1.0 + wave * 0.4, args.duration), 0.98);
        vec2 pos = vec2((f) - 0.5, 0.0) * args.mainRadius * 1.9;
        pos.y = 0.25 * (1.0 - entryAnimation);

        // audio level for bar
        h += avgMag[i] * (0.1 + (1.0 - abs(f - 0.5) * 2.0) * 0.1);

        float dd = sdRoundedBox(args.st - pos, vec2(w, h), vec4(w));
        d = opSmoothUnion(d, dd, 0.2 * (1.0 - args.amount));
    }

    sdf.distance = mix(sdf.distance, d, args.amount);
    sdf.color = mix(sdf.color, vec4(1.0), args.amount);
    return sdf;
}

ColoredSDF applyHaltState(ColoredSDF sdf, SDFArgs args) {
    // animate in then pulse slowly
    float radius = mix(0.4, mix(0.4, 0.45, args.amount), sin(args.time * 0.25) * 0.5 + 0.5);
    float strokeWidth = mix(radius / 2.0, 0.02, args.amount);

    // stroke position inside
    radius -= strokeWidth;

    radius *= mix(0.7, 1.0, args.amount);
    float circle = abs(length(args.st) - radius) - strokeWidth;

    sdf.distance = mix(sdf.distance, circle, args.amount);
    sdf.color = mix(sdf.color, vec4(pow(0.8, 2.2)), scaled(0.5, 1.0, args.amount));
    return sdf;
}

// Blending mode normal
vec3 blendNormal(vec3 base, vec3 blend) {
    return blend;
}

vec3 blendNormal(vec3 base, vec3 blend, float opacity) {
    return (blendNormal(base, blend) * opacity + base * (1.0 - opacity));
}

// Fragment shader
in vec4 out_position;
in vec2 out_uv;

// Parameters
uniform float time;
uniform float smoothLevel;
uniform float touchDownTimestamp;
uniform float touchUpTimestamp;
uniform float stateListen;
uniform float listenTimestamp;
uniform float stateListenIntently;
uniform float listenIntentlyTimestamp;
uniform float stateThink;
uniform float thinkTimestamp;
uniform float stateSpeak;
uniform float speakTimestamp;
uniform float readyTimestamp;
uniform float stateHalt;
uniform float haltTimestamp;
uniform float stateFailedToConnect;
uniform float failedToConnectTimestamp;
uniform float stateListenGrace;
uniform float graceStartTimestamp;
uniform float graceEndTimestamp;
uniform vec4 assistantMagnitudes;

out vec4 fragColor;

// Fragment shader function
void main() {
    vec2 st = out_uv - 0.5;

    ColoredSDF sdf;
    sdf.distance = 1000.0;
    sdf.color = vec4(1.0);

    SDFArgs args;
    args.st = st;
    args.time = time;
    args.mainRadius = 0.49;

    SDFArgs idleArgs = args;
    SDFArgs listenArgs = args;
    SDFArgs listenIntentlyArgs = args;
    SDFArgs listenGraceArgs = args;
    SDFArgs thinkArgs = args;
    SDFArgs speakArgs = args;
    SDFArgs haltArgs = args;
    SDFArgs failedToConnectArgs = args;

    idleArgs.amount = 1.0;
    listenArgs.amount = stateListen;
    listenIntentlyArgs.amount = stateListenIntently;
    listenGraceArgs.amount = stateListenGrace;
    thinkArgs.amount = stateThink;
    speakArgs.amount = stateSpeak;
    haltArgs.amount = stateHalt;
    failedToConnectArgs.amount = stateFailedToConnect;

    idleArgs.duration = time - readyTimestamp;
    listenIntentlyArgs.duration = time - listenIntentlyTimestamp;
    listenGraceArgs.duration = time - graceStartTimestamp;
    listenArgs.duration = time - listenTimestamp;
    thinkArgs.duration = time - thinkTimestamp;
    speakArgs.duration = time - speakTimestamp;
    haltArgs.duration = time - haltTimestamp;
    failedToConnectArgs.duration = time - failedToConnectTimestamp;

    float listeningIntentlyDuration = time - listenIntentlyTimestamp;

    float touch = fixedSpring(scaled(0., 1.5, time - touchDownTimestamp), 0.99) - fixedSpring(scaled(0., 0.8, time - touchUpTimestamp), 1.0);

    sdf = applyIdleState(sdf, idleArgs);

    // blend the signed distance field between our states

    // failed
    if (failedToConnectArgs.amount > 0.0) {
        // use halted state
        sdf = applyHaltState(sdf, failedToConnectArgs);
    }

    // listen
    if (listenArgs.amount > 0.0) {
        sdf = applyListenState(sdf, listenArgs, smoothLevel);
    }

    // listen
    if (listenIntentlyArgs.amount > 0.0) {
        sdf = applyListenIntentlyState(sdf, listenIntentlyArgs, smoothLevel, touchDownTimestamp, touchUpTimestamp);
    }

    // listen
    if (listenGraceArgs.amount > 0.0) {
        sdf = applyListenGraceState(sdf, listenGraceArgs, smoothLevel, graceStartTimestamp, graceEndTimestamp);
    }

    // think
    if (thinkArgs.amount > 0.0) {
        sdf = applyThinkState(sdf, thinkArgs);
    }

    // talk
    if (speakArgs.amount > 0.0) {
        sdf = applySpeakState(sdf, speakArgs, assistantMagnitudes);
    }

    // halt
    if (haltArgs.amount > 0.0) {
        sdf = applyHaltState(sdf, haltArgs);
    }

    // edge sharpness, higher value, blurrier border
    // practically free anti-aliasing
    float clampingTolerance = 0.005;

    // clamp the edge of the signed distance field
    float clampedShape = smoothstep(clampingTolerance, 0.0, sdf.distance);

    vec4 assistantColor = vec4(sdf.color.rgb, sdf.color.a * clampedShape * scaled(0.0, 1.0, time));

    fragColor = assistantColor;
}
